package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 763划分字母区间
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。
 */
public class Leetcode763Medium {
    public List<Integer> partitionLabels(String S) {
        int start = 0,end = 0;
        int[] array = new int[26];
        //寻找一个字母最后出现的位置
        for (int i = 0; i < S.length(); i++) {
            array[S.charAt(i)-'a'] = i;
        }
        List<Integer> partition = new ArrayList<Integer>();
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, array[S.charAt(i)-'a']);
            if(i == end)
            {
                partition.add(end-start+1);
                start = end + 1;
            }
        }
        return partition;
    }
    public static void main(String[] args) {

    }
}
