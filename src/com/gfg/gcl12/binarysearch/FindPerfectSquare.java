package com.gfg.gcl12.binarysearch;
/*
* Problem Statement -   Check if a given number N is a perfect square or not. If yes then return the number of which it is a perfect square, Else print -1.
* Solution  -           We use recursive binary search approach to start from one and increment until we find the solution.
 * */
public class FindPerfectSquare {
    private static long findPerfectSquare(long n, long low, long high){
        if(high >= low){
            long mid = low +(high-low)/2;
            if(mid * mid == n)
                return mid;
            else if(mid * mid > n)
                return findPerfectSquare(n,low, mid-1);
            else
                return findPerfectSquare(n,mid+1,high);
        }
        return -1;

    }
    public static void main(String[] args){
        int n = 4900;
        System.out.println("Is "+n+" perfect square => "+findPerfectSquare(n, 1, n));
        n = 29;
        System.out.println("Is "+n+" perfect square => "+findPerfectSquare(n, 1, n));
        n = 65;
        System.out.println("Is "+n+" perfect square => "+findPerfectSquare(n, 1, n));
    }
}
