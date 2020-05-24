package com.zsp.algorithm.w1;

/**
 * Created by zhangshaopeng on 2020/5/24.
 * <p>
 * 旋转数组
 * https://leetcode-cn.com/problems/rotate-array/
 */
public class Rotate {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        if (k <= 0) return;

        for (int i = 0; i < k; i++) {
            int length = nums.length;

            int temp = nums[length - 1];
            for (int n = nums.length - 1; n > 0; n--) {
                nums[n] = nums[n-1];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Rotate().rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }
}
