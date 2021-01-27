package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Given an array of prices give the maximum profit for the same
* Input             -   [1,5,3,8,12]
* Output            -   13
* Logic             -   We profit from a trade by buying at the lowest value and selling at the highest. Hence here we start at index 1 since we have to look back at the values.
*                       We look at previous value if it is lower than current value we add to profit. If it is less we don't do anything. That way when prices are going up we are
*                       adding the cumulative difference to ensure that we sell when the price is the highest and we capture that difference.
* */
public class StockBuynSell {
    private static int findMaxProfit(int[] input){
        int profit = 0;
        for(int i=1;i<input.length;i++){
            if(input[i] > input[i-1]){
                profit+= input[i] - input[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int [] input = new int[]{1,5,3,8,12};
        int profit = findMaxProfit(input);
        System.out.println("Maximum profit for given prices => "+profit);
    }
}
