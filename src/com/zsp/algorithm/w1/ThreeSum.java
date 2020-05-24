package com.zsp.algorithm.w1;

import java.util.*;

/**
 * Created by zhangshaopeng on 2020/5/24.
 *
 * 三数之和
 * https://leetcode-cn.com/problems/3sum/
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 2) return result;

        // 方法一：三个循环遍历处理，用Set去重
        Arrays.sort(nums);
        Set<List<Integer>> tempSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        tempSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        result = new ArrayList<>(tempSet);

        // todo: 方法二：使用Hash表，可以减少一个循环

        // 方法三：使用指针前后夹逼

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ThreeSum().threeSum(nums);
        System.out.println(result.toString());
    }
}
