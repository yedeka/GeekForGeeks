package com.gfg.gcl12;

/*
* Problem Statement -   Given a sorted array and a number x find out the greatest index of number in the array
* Input             -   [1,3,5,7,7,9] , x = 7
* Output            -   4
* */
public class Main {

    private static int findMaxIndex(int[] input, int x){
        int result = -1, beginning = 0, end= input.length-1, mid;
        while(beginning <= end){
            mid = (beginning+end)/2;
            //number at mid is less than x so we need to proceed further for finding the number
            if(input[mid] <= x){
                beginning = mid+1;
            }else{
                //Number is greater than x hence decrement
                end = mid-1;
            }

        }
        result = end;
        return result;
    }

    public static void main(String[] args) {
	    int[] input = new int[]{1,3,5,7,7,9};
	    int x = 7;
	    int result = findMaxIndex(input, x);
	    if(-1 == result){
	        System.out.println("No such number exists in given array");
        }else{
            System.out.println("Maximum Index => "+result);
        }
    }
}
