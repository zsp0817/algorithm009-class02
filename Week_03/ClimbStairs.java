package com.zsp.algorithm.w3;

/**
 * Created by zhangshaopeng on 2020/6/1.
 * <p>
 * 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbStairs {


    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairs(0, n, memo);
    }

    private int climbStairs(int i, int n, int[] memo) {
        if (i > n) return 0;
        if (i == n) return 1;
        if (memo[i] > 0) return memo[i];
        memo[i] = climbStairs(i + 1, n, memo) + climbStairs(i + 2, n, memo);
        return memo[i];
    }

    public static void main(String[] args) {
        int result = new ClimbStairs().climbStairs(10);
        System.out.println(result);
    }
}
