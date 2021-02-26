package com.gfg.gcl12.recursion;

public class print1toNo {
    private static void print1ToNo(int n){
        if(n == 0)
            return;
        print1ToNo(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        print1ToNo(10);
    }
}
