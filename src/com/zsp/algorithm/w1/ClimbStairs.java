package com.zsp.algorithm.w1;

/**
 * Created by zhangshaopeng on 2020/5/25.
 * <p>
 * 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n) + climbStairs(n - 1);
    }

    public static void main(String[] args) {
        int count = new ClimbStairs().climbStairs(5);
        System.out.println(count);
    }
}
