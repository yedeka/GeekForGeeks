package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Find out a majority element in an array. A majority element of an array is an element whose occurance is greater than N/2 times in the array.
* Time Complexity   -   O(N)
* Space Complexity  -   O(1)
* */
public class MajorityElement {
    private static int findMajorityIndex(int[] input){
        int majorityIndex = 0, count = 1, inputLength = input.length, resultIndex = -1;
        // Part 1 - Moore's voting algorithm where we find out the index of element occuring maximum times.
        for(int i =0;i<inputLength;i++){
            if(input[i] == input[majorityIndex])
                count++;
            else
                count --;
            if(count == 0){
                count = 1;
                majorityIndex = i;
            }
        }
        count = 0;
        //Part 2 - We check the occurance of the
        for(int i=0;i<inputLength;i++){
            if(input[i] == input[majorityIndex])
                count++;
            if(count > inputLength/2){
                resultIndex = i;
                break;
            }
        }
        return resultIndex;
    }
    public static void main(String[] args){
        int[] input = new int[]{8,3,4,8,8};
        System.out.println("Index of Majority element => "+findMajorityIndex(input));
        input = new int[]{6,8,7,6,6};
        System.out.println("Index of Majority element => "+findMajorityIndex(input));
        input = new int[]{3,7,4,7,7,5};
        System.out.println("Index of Majority element => "+findMajorityIndex(input));
    }
}