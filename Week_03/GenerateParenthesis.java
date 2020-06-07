package com.zsp.algorithm.w3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangshaopeng on 2020/6/3.
 * <p>
 * 括号生成
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
public class GenerateParenthesis {

    List<String> resultList;

    public List<String> generateParenthesis(int n) {
        resultList = new ArrayList<>();
        this.generateParenthesis(0, 0, n, "");
        return resultList;
    }

    private void generateParenthesis(int left, int right, int n, String s) {
        // 如果左括号和右括号都等于N，则退出
        if (left == n && right == n) {
            this.resultList.add(s);
            return;
        }

        // 如果左括号小于N，则继续补充左括号
        if (left < n) {
            this.generateParenthesis(left + 1, right, n, s + "(");
        }
        // 如果左括号大于右括号，则说明要补充右括号
        if (left > right) {
            this.generateParenthesis(left, right + 1, n, s + ")");
        }
    }

    public static void main(String[] args) {
        List<String> resultList = new GenerateParenthesis().generateParenthesis(3);
        System.out.println(resultList);
    }

}
