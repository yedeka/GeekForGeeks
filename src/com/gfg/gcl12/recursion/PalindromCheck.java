package com.gfg.gcl12.recursion;

/*
* Recursive solution to find out whether a given string is a Palindrom.
* */
public class PalindromCheck {
    private static boolean checkPalindrom(String input, int start, int end){
        if(end - start <= 1)
            return true;
        return input.charAt(start) == input.charAt(end) && checkPalindrom(input, start+1, end-1);
    }

    public static void main(String[] args){
        String strInput = "abba";
        System.out.println("String "+strInput+" is Palindrom => "+checkPalindrom(strInput, 0,strInput.length() -1));
    }
}
