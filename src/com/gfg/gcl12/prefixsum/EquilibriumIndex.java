package com.gfg.gcl12.prefixsum;

/*
* Problem Statement -   Find equilibrium index of an array. Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to
*                       the sum of elements at higher indexes.
* Time Complexity   -   O(N)
* Space Complexity  -   O(1)
* logic             -   First find sum of all elements in the array. Then initialize leftsum = 0 and for each index calculate right sum by subtracting index value from sum.
*                       If left sum and right sum match then that index is the equilibrium index else add index value to left sum to calculate the leftsum for the index.
* */
public class EquilibriumIndex {
    private static int findEquilibriumIndex(int[] input){
        if(null == input || input.length == 0)
            return -1;
        int sum=0, equilibriumIndex = -1,length = input.length, leftSum =0;
        for(int i=0;i<length;i++)
            sum = sum + input[i];
        for(int i=0;i<length;i++){
            sum = sum - input[i];
            if(sum == leftSum){
                equilibriumIndex = i;
                break;
            }else
                leftSum = leftSum + input[i];
        }
        return equilibriumIndex;
    }

    public static void main(String[] args){
        int[] input = new int[]{-7, 1, 5, 2, -4, 3, 0};
        int eqIndex = findEquilibriumIndex(input);
        System.out.println("Equilibrium Index of given array => "+eqIndex);
    }
}
