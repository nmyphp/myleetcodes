package com.github.nmyphp.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for all App.
 */
public class CommonTest {

    @Test
    public void romanToInt() {
        Roman roman = new Roman();
        assertTrue(3 == roman.romanToInt("III"));
        assertTrue(4 == roman.romanToInt("IV"));
        assertTrue(9 == roman.romanToInt("IX"));
        assertTrue(58 == roman.romanToInt("LVIII"));
        assertTrue(1994 == roman.romanToInt("MCMXCIV"));
        assertTrue(500 == roman.romanToInt("D"));
    }
}
