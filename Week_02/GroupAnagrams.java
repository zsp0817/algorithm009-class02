package com.zsp.algorithm.w2;

import java.util.*;

import static java.util.stream.Collectors.joining;

/**
 * Created by zhangshaopeng on 2020/5/26.
 * <p>
 * 字母异位词分组
 * https://leetcode-cn.com/problems/group-anagrams/
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();

        // 方法一：排序字符串相等，则为异位词
//        HashMap<String, List<String>> map = new HashMap<>();
//        for (String str : strs) {
//            char[] chars = str.toCharArray();
//            Arrays.sort(chars);
//            String key = String.valueOf(chars);
//            if (!map.containsKey(key))
//                map.put(String.valueOf(chars), new ArrayList<>());
//            map.get(key).add(str);
//        }
//        return new ArrayList(map.values());

        // 方法二：按计数分类，使用"#1#2#1#0..."这样的方式来表示
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for (String str : strs) {
            Arrays.fill(count, 0);
            for (char c : str.toCharArray())
                count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }

            String key = sb.toString();
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupList = new GroupAnagrams().groupAnagrams(strs);

        for (List<String> valueList : groupList) {
            System.out.println(valueList.stream().collect(joining(",")));
        }

    }
}
