package com.zsp.algorithm.w1;

/**
 * Created by zhangshaopeng on 2020/5/24.
 * <p>
 * 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }
}
