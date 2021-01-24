package com.gfg.gcl12.binarysearch;
/*
* Problem Statement - Given an integer x, find it’s square root. If x is not a perfect square, then return floor(√x).
* */
public class FindIntegerSquareRoot {
    private static int findSqrt(int n){
        int start = 1, end = n, mid , answer = -1;
        //Handling base cases
        if(n == 0 || n == 1)
            return start;
        while(start <= end){
            mid = (start + end)/2;
            if(mid*mid == n)
                return mid;
            else if(mid*mid<n){
                start = mid + 1;
                //This is done to update the floor to ensure that we get the smaller value and not the larger value;
                answer = mid;
            }else{
                end = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Floored square root for "+n+" => "+findSqrt(n));
        n = 81;
        System.out.println("Floored square root for "+n+" => "+findSqrt(n));
        n = 105;
        System.out.println("Floored square root for "+n+" => "+findSqrt(n));

    }
}
