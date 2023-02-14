package com.strings;

public class Palindrome {

    public static boolean checkPalindrome(String str){

        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "rahecar";
        //System.out.println(checkPalindrome(str));
        if (checkPalindrome(str)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
