package com.raj;

/**
 * Created by rajkumarpurushothaman on 6/5/17.
 */
public class Hello {

    public static boolean isSuperPalindrome(String s, int k) {

        int len = s.length();
        int div = len/k;
        int rem = len%k;

        // if(rem!=0) {
        //     return false;
        // }

        int start=0;
        int end=0;
        for(int i=0;i<div/2;i++) {
            start = i*2*k;
            end = start + (2*k);
            if(isPalindrome(s.substring(start,end))) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end) {
            if(s.charAt(start)==s.charAt(end)) {
                start++;
                end--;
                continue;
            }
            else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSuperPalindrome("10011001",2));
        System.out.println(isSuperPalindrome("25iwwi52",4));
        System.out.println(isSuperPalindrome("qz99qzzq99qzzq99qzzq99qz",3));
        System.out.println(isSuperPalindrome("ttgt2pmmp2tgttttgt2pmmp2tgtt",7));

    }
}
