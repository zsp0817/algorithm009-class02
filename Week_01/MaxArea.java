package com.zsp.algorithm.w1;

/**
 * Created by zhangshaopeng on 2020/5/24.
 *
 * 盛水最多的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {

    public int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;

        // 方法一：两次循环遍历
//        int max = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = 1; j < height.length; j++) {
//                int temp = (j - i) * Math.min(height[i], height[j]);
//                max = Math.max(temp, max);
//            }
//        }

        // 方法二：头尾指针夹逼
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, area);

            // 如果左指标的高度大于右指标的高度，则右指标移动，否则左指标移动
            if (height[left] > height[right]) --right;
            else ++left;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max = new MaxArea().maxArea(height);
        System.out.println(max);
    }
}
