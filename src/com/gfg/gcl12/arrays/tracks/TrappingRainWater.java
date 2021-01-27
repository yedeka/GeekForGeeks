package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Given an array with the heights of different bars to trap rain water find the total rain water accumulated by the structure.
* I/P               -   [3,0,1,2,5]
* O/P               -   6
* */
public class TrappingRainWater {
    private static int findTrappedWater(int[] input){
        //Precompute the leftmax and rightmax for all the bars.
        int inputLength = input.length, leftMaxVal = input[0], rightMaxVal = input[inputLength-1], trappedWater=0;
        int[] leftMax = new int[inputLength], rightMax = new int[inputLength];

        for(int i=0;i< inputLength;i++){
            if(input[i] > leftMaxVal){
                leftMaxVal = input[i];
            }
            leftMax[i] = leftMaxVal;
        }
        for(int i=inputLength-1;i>=0 ;i--){
            if(input[i] > rightMaxVal){
                rightMaxVal = input[i];
            }
            rightMax[i] = rightMaxVal;
        }
        //Now calculate the water that can be stored by each bar and add it together
        for(int i=0;i<input.length;i++){
            trappedWater+=Math.min(leftMax[i], rightMax[i]) - input[i];
        }
        return trappedWater;
    }
    public static void main(String[] args){
        int[] input = new int[]{3,0,1,2,5};
        int trappedWater = findTrappedWater(input);
        System.out.println("Trapped water => "+trappedWater);
        input = new int[]{4,0,5,0,3};
        trappedWater = findTrappedWater(input);
        System.out.println("Trapped water => "+trappedWater);
    }
}
