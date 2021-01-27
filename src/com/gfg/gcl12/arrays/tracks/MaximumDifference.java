package com.gfg.gcl12.arrays.tracks;
/*
*   Problem Statement   -   Given an array find out the maximum difference in any 2 indices of the array.
*   Input               -   [2,3,10,6,4,8,1]
*   Output              -   8
* */
public class MaximumDifference {
    private static int findMaximumDifference(int[] input){
        int maxDifference = input[1] - input[0], minElement = input[0];
        for(int i=1;i<input.length;i++){
            maxDifference = Math.max(maxDifference, input[i] - minElement);
            minElement = Math.min(minElement, input[i]);
        }
        return maxDifference;
    }

    public static void main(String[] args){
        int[] input = new int[] {2,3,10,6,4,8,1};
        int maxDifference = findMaximumDifference(input);
        System.out.println("Maximum Difference => "+maxDifference);
        input = new int[] {7,9,5,6,3,2};
        maxDifference = findMaximumDifference(input);
        System.out.println("Maximum Difference => "+maxDifference);
        input = new int[] {10,20,30};
        maxDifference = findMaximumDifference(input);
        System.out.println("Maximum Difference => "+maxDifference);
        input = new int[] {30,20,10};
        maxDifference = findMaximumDifference(input);
        System.out.println("Maximum Difference => "+maxDifference);
    }
}
