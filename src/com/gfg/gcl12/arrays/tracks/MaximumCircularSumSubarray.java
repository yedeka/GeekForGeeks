package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Find out a maximum sum for a circular subarray. A circular sub array is an array where we connect last element to the first element.
* I/P               -   8, -4, 3, -5, 4
* O/P               -   12
* */
public class MaximumCircularSumSubarray {
    private static int findMaxCircularSum(int[] input){
        int regularSum = findRegularMaxSum(input);
        if(regularSum < 0)
            return regularSum;
        int circularMax = findcircularMaxSum(input);
       return Math.max(regularSum, circularMax);
    }
    private static int findRegularMaxSum(int[] input){
        int currentMax = input[0], result = input[0], inputLength = input.length;
        for(int i=1;i<inputLength;i++){
            currentMax = Math.max(currentMax+input[i],input[i]);
            result = Math.max(result, currentMax);
        }
        return result;
    }
    private static int findcircularMaxSum(int[] input){
        int cumulativeSum = 0, minSum = input[0], currentSum = input[0], inputLength = input.length;
        for(int i=0;i<inputLength;i++){
            cumulativeSum += input[i];
        }
        for(int i=1;i<inputLength;i++){
            currentSum = Math.min(currentSum + input[i], input[i]);
            minSum = Math.min(minSum, currentSum);
        }
        return cumulativeSum - minSum;
    }
    public static void main(String[] args){
        int[] input = new int[]{8, -4,3,-5,4};
        int maxCircularSum = findMaxCircularSum(input);
        System.out.println("maxCircularSum => "+maxCircularSum);
        input = new int[]{5,-2,3,4};
        maxCircularSum = findMaxCircularSum(input);
        System.out.println("maxCircularSum => "+maxCircularSum);
        input = new int[]{2,3,-4};
        maxCircularSum = findMaxCircularSum(input);
        System.out.println("maxCircularSum => "+maxCircularSum);
        input = new int[]{8,-4,3,-5,4};
        maxCircularSum = findMaxCircularSum(input);
        System.out.println("maxCircularSum => "+maxCircularSum);
    }
}