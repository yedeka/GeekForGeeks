package com.gfg.gcl12.arrays.tracks;

/*
* Problem Description   -   Remove duplicates from a sorted array
* */
public class RemoveDuplicates {
    private static int removeDups(int[] input){
        int res = 1;
        for(int i=1;i<input.length;i++){
            if(input[i] != input[res - 1]){
                input[res++] = input[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] input = new int[]{10,20,20,30,30,30};
         System.out.println("Size of duplicate free array => "+removeDups(input));
    }
}