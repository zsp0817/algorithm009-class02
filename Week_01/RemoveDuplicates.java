package com.zsp.algorithm.w1;

/**
 * Created by zhangshaopeng on 2020/5/24.
 *
 * 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                if (j - i > 1) {
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1;
    }
}
