package com.gfg.gcl12.arrays.tracks;
/*
* Problem Statement -   Find the second largest element in an array in O(N)
* */
public class FindSecondLargest {
    private static int findSecondLargest(int[] arr){
        int result = -1, largest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[largest]){
                if(result != -1)
                    result = largest;
                largest = i ;
            }else{
                if(result != -1){
                    if(arr[i] > arr[result])
                        result = i;
                }else{
                    result = i;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] input = new int[]{9,3,15,17,20};
        int secondLargest = findSecondLargest(input);
        System.out.println("Second Largest element => "+input[secondLargest]);
    }
}
