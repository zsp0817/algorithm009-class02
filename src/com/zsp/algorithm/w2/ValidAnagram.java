package com.zsp.algorithm.w2;

/**
 * Created by zhangshaopeng on 2020/5/26.
 * <p>
 * 有效的字母异位数
 * https://leetcode-cn.com/problems/valid-anagram/
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // 方法一：排序后判断是否一致
//        char[] sc = s.toCharArray();
//        char[] tc = t.toCharArray();
//        Arrays.sort(sc);
//        Arrays.sort(tc);
//        return String.valueOf(sc).equals(String.valueOf(tc));

        // 方法二：
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count > 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
        System.out.println(new ValidAnagram().isAnagram("rat", "cat"));
    }
}
