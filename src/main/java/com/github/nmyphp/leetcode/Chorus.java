package com.github.nmyphp.leetcode;

import java.util.Scanner;

/**
 * 牛客：合唱队 https://www.nowcoder.com/practice/6d9d69e3898f45169a441632b325c7b4
 */
public class Chorus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] base = new int[n];
            for (int i = 0; i < n; i++) {
                base[i] = sc.nextInt();
            }
            System.out.println(countCut(n, base));
        }
    }

    public static int countCut(int n, int[] base) {
        int[] leftIncrement = new int[n];
        int[] rightDecrement = new int[n];
        for (int i = 0; i < n; i++) {
            leftIncrement[i] = 1;
            for (int j = 0; j < i; j++) {
                if (base[i] > base[j]) {
                    leftIncrement[i] = Math.max(leftIncrement[j] + 1, leftIncrement[i]);
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            rightDecrement[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (base[i] > base[j]) {
                    rightDecrement[i] = Math.max(rightDecrement[i], rightDecrement[j] + 1);
                }
            }
        }
        int max = 1;
        for (int i = 0; i < n; i++) {
            int temp = leftIncrement[i] + rightDecrement[i] - 1;
            if (temp > max) {
                max = temp;
            }
        }
        return n - max;
    }
}