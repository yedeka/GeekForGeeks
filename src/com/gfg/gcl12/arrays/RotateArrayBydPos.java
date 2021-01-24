package com.gfg.gcl12.arrays;

/*
* Problem Statement -   Given an array and a number d rotate the array to left by d positions.
* Input             -   Array [1,2,3,4,5], d = 2
* Output            -   [3,4,5,1,2]
* */
public class RotateArrayBydPos {
    private static void rotateByd(int[] input, int d){
        d = d% input.length;
        reverseArray(input,0, input.length-1);
        reverseArray(input, 0, input.length-1-d);
        reverseArray(input, input.length-d, input.length-1);
    }

    private static void reverseArray(int[] input, int start, int end){
        for(int i=start,j = end;i<input.length/2;i++,j--){
            swap(input,i,j);
        }
    }

    private static void swap(int[] input, int iStart, int iEnd){
        int temp = input[iStart];
        input[iStart] = input[iEnd];
        input[iEnd] = temp;
    }

    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4,5};
        int d =2;
        rotateByd(input,d);
        System.out.print("Rotated Array => [");
        for(int i=0;i< input.length;i++){
            System.out.print(input[i]+" ,");
        }
        System.out.print("]");
    }
}
