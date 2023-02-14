package com.coderbyte;

import java.util.Scanner;

public class mathchal {

    public static void main(String[] args) {
        // keep this function call here
        Scanner input = new Scanner(System.in);
        int num = 49897;
        String s = Integer.toString(num);
        int ele = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>ele){
                String s1 = String.valueOf(s.charAt(i));
                ele = Integer.parseInt(s1);
            }

        }
    }
}