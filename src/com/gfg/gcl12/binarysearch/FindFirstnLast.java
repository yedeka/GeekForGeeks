package com.gfg.gcl12.binarysearch;

/*
* Problem Statement - Given a sorted array find out the first and last index of a number within the array.
* Time Complexity - O(LogN)
* Space Complexity - O(LogN)
* Extended Problem - Find out the number of occurances of an element in the array.
* Solution -    Find the first and last index of an element in the array and then number of occurances is last - first + 1
* */
public class FindFirstnLast {
    private static int findFirst(int[] input, int x, int low, int high){
        if(high > low){
            int mid = low + (high-low)/2;
            if(mid == 0 || input[mid] == x && x > input[mid-1])
                return mid;
            else if(x > input[mid])
                return findFirst(input,x ,mid+1,high);
            else
                return findFirst(input,x ,low,mid-1);
        }
        return -1;
    }

    private static int findLast(int[] input, int x, int low, int high){
        if(high > low){
            int mid = low +(high - low)/2;
            if(mid == input.length -1 || (input[mid] == x && input[mid+1]>x))
                return mid;
            if(x >= input[mid])
                return findLast(input, x, mid+1, high);
            else
                return findLast(input, x, low, mid-1);

        }
        return -1;
    }

    public static void main(String[] args){
        int[] input = new int[] {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 2;
        int first = findFirst(input, x, 0, input.length-1);
        System.out.println("First Index of "+x+" => "+first);
        int last = findLast(input, x, 0, input.length-1);
        System.out.println("Last Index of "+x+" => "+last);
    }
}
