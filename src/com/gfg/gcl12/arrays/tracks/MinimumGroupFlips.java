package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Find minimum flips required in a binary array to make the array equal.
*
* */
public class MinimumGroupFlips {
    private static void findMinGroupFlips(int[] input){
        int firstElement = input[0], inputLength= input.length;
        for(int i=1;i<inputLength;i++){
            //Current element is different than previous element this indicates a group reversal
            if(input[i] != input[i-1]){
                if(firstElement != input[i])
                    System.out.println("Group Start => "+i);
                else
                    System.out.println("Group end => "+(i-1));
            }
        }
        if(input[inputLength-1] != firstElement){
            System.out.println("Group end => "+(inputLength-1));
        }
    }
    public static void main(String[] args){
        int[] input = new int[]{1,1,0,0,1};
        System.out.println("Starting a new Problem");
        findMinGroupFlips(input);
        input = new int[]{1,1,0,0,0};
        System.out.println("Starting a new Problem");
        findMinGroupFlips(input);
        input = new int[]{1,0,0,0,1,0,0,1,1,1,1};
        System.out.println("Starting a new Problem");
        findMinGroupFlips(input);
    }
}
