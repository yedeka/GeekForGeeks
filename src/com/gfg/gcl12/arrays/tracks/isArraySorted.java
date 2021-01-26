package com.gfg.gcl12.arrays.tracks;
/*
* Problem Statement - Find if an array is sorted
* */
public class isArraySorted {
    private static boolean isSorted(int[] input){
        boolean isSorted = true;
        for(int i=1;i< input.length;i++){
            if(input[i] < input[i-1])
                isSorted = false;
        }
        return isSorted;
    }
    public static void main(String[] args){
        int[] input = new int[]{10,20,30,40,90,1001};
        boolean sortedFlag = isSorted(input);
        System.out.println("Is input array sorted => "+sortedFlag);
        input = new int[]{10,20,20,20,20};
        sortedFlag = isSorted(input);
        System.out.println("Is input array sorted => "+sortedFlag);
        input = new int[]{60,20,20,20,20};
        sortedFlag = isSorted(input);
        System.out.println("Is input array sorted => "+sortedFlag);
    }
}
