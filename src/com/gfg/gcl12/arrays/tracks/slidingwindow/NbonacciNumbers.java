package com.gfg.gcl12.arrays.tracks.slidingwindow;
/*
* Problem Statement -   Find first N bonacci numbers given a number count as M. Nbonacci numbers can be found out by adding first N numbers.
* */
public class NbonacciNumbers {
    private static int[] findNbonacciNumbers(int n, int m) throws Exception {
        if(n > m)
            throw new Exception("N can't be greater than M");
        int[] result = new int[m];
        //For an nbonacci number first n-1 numbers are always 0.
        result[n-1] = 1;
        int currentSum = 0;
        for(int i=0;i<n;i++){
            currentSum += result[i];
        }
        for(int i=n;i<m;i++){
            result[i] = currentSum;
            currentSum = currentSum + (result[i] - result[i-n]);
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        int[] nbonacci = findNbonacciNumbers(3,8);
    }
}
