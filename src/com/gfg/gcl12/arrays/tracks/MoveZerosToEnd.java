package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Given an array move all the zero elements to the end and maintain the order of elements.
* I/P               -   [10,12,0,0,15,0]
* O/P               -   [10,12,15,0,0,0]
* Time complexity   -   O(N)
* Space Complexity  -   O(1)
* Logic             -   To  do this in linear time we count the non zero elements and the count of non zero elements is the first index of the zero so when we get a non zero element
*                       we swap that element with the element at the index of count which is the first zero index.
* */
public class MoveZerosToEnd {
    private static void moveZeros(int[] input){
        int count = 0;
        for(int i=0;i<input.length;i++){
            if(input[i] != 0){
                int temp = input[i];
                input[i] = input[count];
                input[count++] = temp;
            }
        }
    }

    public static void main(String[] args){
        int [] input = new int[]{10,12,0,0,15,0};
        moveZeros(input);
        System.out.print("Array with moved zeros => [ ");
        for(int i=0;i< input.length;i++){
            System.out.print(input[i]+", ");
        }
        System.out.println(" ]");
    }
}
