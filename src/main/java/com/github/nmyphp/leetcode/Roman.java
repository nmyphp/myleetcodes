package com.github.nmyphp.leetcode;

/**
 *
 * Leetcode:罗马数字转整数
 * https://leetcode-cn.com/problems/roman-to-integer/
 *
 */
public class Roman {

    public int romanToInt(String s) {
        int result = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            int v1 = getValue(s.charAt(i));
            if (i + 1 < size && v1 < getValue(s.charAt(i + 1))) {
                result -= v1;
            } else {
                result += v1;
            }
        }
        return result;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
