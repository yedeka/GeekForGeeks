package com.gfg.gcl12.recursion;

/*
* Given N and K such that N people stand in a circle and in each iteration kth person gets killed starting from first person. Find out the survivor
* Solution - After every killing the indexing moves by k. Hence we add k to the returned number .Since we need the indexing to be bounded by n we need to do mod N
* */
public class JosephusProblem {
    private static int jose(int n, int k){
        if(n==0)
            return 0;
        return (jose(n-1,k)+k) % n;
    }
    public static void main(String[] args){
        int survivor = jose(7,3);
    }
}
