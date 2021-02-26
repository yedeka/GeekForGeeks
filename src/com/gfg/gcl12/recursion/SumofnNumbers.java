package com.gfg.gcl12.recursion;

public class SumofnNumbers {
    private static int findSum(int n){
        if(n == 0)
            return 0;
        return(n+findSum(n-1));
    }
    public static void main(String[] args){
        System.out.println("Sum on first 5 natural numbers => "+findSum(5) );
        System.out.println("Sum on first 4 natural numbers => "+findSum(4) );
    }
}
