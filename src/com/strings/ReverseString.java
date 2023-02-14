package com.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "racecar";
        int n = str.length();

        StringBuffer sb = new StringBuffer("");

        for (int i = n-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
        System.out.println(str);
        String bs = sb.toString();
        if(str.equals(bs)){
            System.out.println("pali");
        }
        else {
            System.out.println("nopali");
        }
    }
}
