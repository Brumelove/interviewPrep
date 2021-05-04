package com.prep.nextlevel.ds_algo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Brume
 */
public class SimpleStringAlgo {
    static String reverseMe(String input) {
        var reversedInput = new StringBuilder();
        reversedInput.append(input);

        return reversedInput.reverse().toString();
    }
    static Boolean anagramChecker(String input, String input2) {

        var sorta = input.replaceAll("\\s", "").toCharArray();
        var sortb = input2.replaceAll("\\s", "").toCharArray();

        if (sorta.length != sortb.length) {
            return false;
        }
        Arrays.sort(sorta);
        Arrays.sort(sortb);

        for (int i = 0; i < input.length(); i++) {
            if (sorta[i] != sortb[i]) {
                return false;
            }
        }

        return true;
    }
    static String wordFlipper(String input) {
        var reversedInput = new StringBuilder();
        var s = input.split(" ");
        for (int i = s.length-1; i >=0 ; i--) {
            reversedInput.append(s[i]).append(" ");
        }
        return reversedInput.reverse().toString();
    }
    static int hammingDistance(String input1, String input2) {
        int count = 0;
       if (input1.length() != input2.length()) {
           return -1;
       }
        for (int i = 0; i < input1.length(); i++) {
           if (input1.charAt(i) != input2.charAt(i)) {
               count++;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance("shove","stove"));
    }
}
