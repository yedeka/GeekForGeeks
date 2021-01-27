package com.gfg.gcl12.arrays.tracks;

/*
* Problem Statement -   Find maximum consecutive ones in a binary array
* I/P               -   [0,1,1,0,1,0]
* O/P               -   2
* */
public class ConsecutiveOnes {
    private static int findMaxOnes(int[] input){
        int currentCnt =0, maxCnt = 0, inputLength = input.length;
        for(int i=0;i<inputLength;i++){
            if(input[i] == 1){
                currentCnt++;
            }else{
                maxCnt = Math.max(currentCnt, maxCnt);
                currentCnt = 0;
            }
            //This is done to handle the corner case of array containing all 1s
            maxCnt = Math.max(currentCnt, maxCnt);
        }
        return maxCnt;
    }
    public static void main(String[] args){
        int[] input = new int[]{0,1,1,0,1,0};
        int maxOnes = findMaxOnes(input);
        System.out.println("Max consecutive ones => "+maxOnes);
        input = new int[]{1,1,1};
        maxOnes = findMaxOnes(input);
        System.out.println("Max consecutive ones => "+maxOnes);
        input = new int[]{0,0,0};
        maxOnes = findMaxOnes(input);
        System.out.println("Max consecutive ones => "+maxOnes);
        input = new int[]{0,1,0,0};
        maxOnes = findMaxOnes(input);
        System.out.println("Max consecutive ones => "+maxOnes);
        input = new int[]{0,1,1,1,0,1,1};
        maxOnes = findMaxOnes(input);
        System.out.println("Max consecutive ones => "+maxOnes);
    }
}
