package com.company;

public class Palindrome {
        public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    public static String reverseString(String s) {
        String txt = "";
        for (int i = 0; i < s.length(); i++) {
            txt += s.charAt(s.length() - i - 1);
        }
        return txt;
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s)))
            return true;
        else
            return false;
    }
}


