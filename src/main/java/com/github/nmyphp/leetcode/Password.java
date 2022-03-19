package com.github.nmyphp.leetcode;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 牛客：密码验证合格程序
 * https://www.nowcoder.com/practice/184edec193864f0985ad2684fbc86841
 */
public class Password {
    
    private static final Pattern[] PATTERNS = new Pattern[]{Pattern.compile("\\d"), Pattern.compile("[a-z]"), Pattern.compile("[A-Z]"), Pattern.compile("[^a-zA-Z0-9]")};
    private static final Pattern PATTERN = Pattern.compile(".*(...).*\\1.*");
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()) {
           String str = sc.nextLine();
           if (match(str)) {
               System.out.println("OK");
           } else {
               System.out.println("NG");
           }
       }
    }
    
    private static boolean match(String str) {
       
        if (null == str || str.length() < 8) {
            return false;
        }
        int matchCount = 0;
        for(Pattern p : PATTERNS) {
            if (p.matcher(str).find()) {
                matchCount ++;
            }
        }
        if (matchCount < 3) {
            return false;
        }
        if (PATTERN.matcher(str).find()) {
            return false;
        }
        return true;
    }
}