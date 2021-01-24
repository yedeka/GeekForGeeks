package com.gfg.gcl12.arrays;
/*
* Problem Statement -   given an array find out the reverse of an array without using any extra memory
* Input             -   [1,2,3,4,5]
* Output            -   [5,4,3,2,1]
* */
public class ArrayReverse {

    private static int[] reverseArray(int[] input){
        int length = input.length;
        for(int i=0,j=length-1;i<length/2;i++,j--){
            swap(input, i, j);
        }
        return input;
    }
    private static void swap(int[] input, int idx1, int idx2){
        int temp = input[idx1];
        input[idx1] = input[idx2];
        input[idx2] = temp;
    }

    private static void printArray(int[] input){
        System.out.print("Reversed Array => [ ");
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ,");
        }
        System.out.println(" ]");
    }

    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4,5,6};
        reverseArray(input);
        printArray(input);
        input = new int[]{1,2,3,4,5};
        reverseArray(input);
        printArray(input);
    }
}
