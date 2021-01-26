package com.gfg.gcl12.prefixsum;
/*
*   Problem Statement - Consider an array of size n with all initial values as 0. Perform given ‘m’ add operations from index ‘a’ to ‘b’ and evaluate highest element in array.
*                       An add operation adds 100 to all elements from a to b (both inclusive).
* */
public class MOperationsforAandB {
    private static int findMax(int n, int m, int[] inputs){
        if (n <0 || m <0 || inputs.length != 2*m){
            return -1;
        }
        int firstIndex = 0, a,b;
        int[] inputArray = new int[n];
        while(firstIndex < 2*m){
            a = inputs[firstIndex++];
            inputArray[a]+=100;
            b = inputs[firstIndex++];
            inputArray[b+1]-=100;
        }
        return computeFindMaxPrefixSum(inputArray);
    }

    private static int computeFindMaxPrefixSum(int[] array){
        int max = array[0], currentSum = array[0];
        for(int i=1;i< array.length;i++){
            currentSum+=array[i];
            if(currentSum > max)
                max = currentSum;
        }
        return max;
    }

    public static void main(String[] args){
        int n = 5, m =3;
        int [] inputs = new int[]{1,3,0,2,0,1};
        int maxAfterOps = findMax(n, m, inputs);
        System.out.println("Max value after all operations => "+maxAfterOps);
    }
}
