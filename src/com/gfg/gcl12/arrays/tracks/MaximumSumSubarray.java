package com.gfg.gcl12.arrays.tracks;

public class MaximumSumSubarray {
    private static  int findMaxSubArraySum(int[] input){
        int maxEnd = input[0], result = input[0];
        for(int i=1;i<input.length;i++){
            // The idea is to compare the sum until current element to see if the element is bigger than current sum. If yes then we choose element else we extend the previous window.
            maxEnd = Math.max(maxEnd+input[i], input[i]);
            result = Math.max(maxEnd, result);
        }
        return result;
    }
    public static void main(String[] args){
        int[] input = new int[]{-3,8,-2,4,-5,6};
        int maxSum = findMaxSubArraySum(input);
        System.out.println("Maximum sum of any subarray => "+maxSum);
        input = new int[]{1,-2,3,-1,2};
        maxSum = findMaxSubArraySum(input);
        System.out.println("Maximum sum of any subarray => "+maxSum);
    }
}
