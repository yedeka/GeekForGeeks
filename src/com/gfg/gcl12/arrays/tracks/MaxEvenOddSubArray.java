package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Given an array of positive integers find the maximum length of an even odd subarray.
* Input             -   [5,10,20,6,3,8]
* Output            -   3 Even Odd subarray with maximum length is [6,3,8]
* Time Complexity   -   O(N)
* Space Complexity  -   O(1)
* */
public class MaxEvenOddSubArray {
    private  static int findMaxLengthEvenOddSubArray(int[] input){
        //Minimum length of a subarray will always be 1 since it will contain only single element even or odd.
        int current = 1, result =1, inputLength= input.length;
        for(int i=1;i<inputLength;i++){
            if((input[i]%2 == 0 && input[i-1]%2 != 0) || (input[i]%2 != 0 && input[i-1]%2 == 0)){
                current++;
                result = Math.max(result, current);
            }else
                current = 1;
        }
        return result;
    }
    public static void main(String[] args){
        int [] input = new int[]{5,10,20,6,3,8};
        int maxEvenOddLength = findMaxLengthEvenOddSubArray(input);
        System.out.println("Maximum even/odd subarray length => "+maxEvenOddLength);
        input = new int[]{5,10,7,6,3,8};
        maxEvenOddLength = findMaxLengthEvenOddSubArray(input);
        System.out.println("Maximum even/odd subarray length => "+maxEvenOddLength);
    }
}