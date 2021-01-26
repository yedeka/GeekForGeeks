package com.gfg.gcl12.prefixsum;

import java.util.HashSet;
import java.util.Set;

/*
*   Problem Statement   -   Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
*   Time Complexity     -   O(N)
*   Space Complexity    -   O(N)
*   Solution            -   Calculate the prefix sum array for the input and while doing it check if any prefix sum repeats. If it does then there is a zero length subarray.
* */
public class SubarrayWithZeroSum {
    private static boolean isZeroSumSubArray(int[] input){
        boolean isZeroSumSubArray = false;
        Set<Integer> prefixSet = new HashSet<>();
        int sum = input[0];
        prefixSet.add(sum);
        for(int i=1;i<input.length;i++){
            sum = sum + input[i];
            if(prefixSet.contains(sum) || sum == 0){
                isZeroSumSubArray = true;
                break;
            }else{
                prefixSet.add(sum);
            }
        }
        return isZeroSumSubArray;
    }
    public static void main(String[] array){
        int[] input = new int[]{4, 2, -3, 1, 6};
        boolean isZeroSumSubArray = isZeroSumSubArray(input);
        System.out.println("Zero sum subarray => "+isZeroSumSubArray);
        input = new int[]{4, 2, 0, 1, 6};
        isZeroSumSubArray = isZeroSumSubArray(input);
        System.out.println("Zero sum subarray => "+isZeroSumSubArray);
        input = new int[]{-3, 2, 3, 1, 6};
        isZeroSumSubArray = isZeroSumSubArray(input);
        System.out.println("Zero sum subarray => "+isZeroSumSubArray);
    }
}
