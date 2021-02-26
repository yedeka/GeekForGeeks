package com.gfg.gcl12.recursion;

public class printNto1 {
    private static void printnt1(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printnt1(n-1);
    }

    public static void main(String[] args){
        printnt1(5);
    }
}
