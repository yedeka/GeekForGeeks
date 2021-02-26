package com.gfg.gcl12.recursion;

/*
* Given a length of a rope n and 3 piece lengths for the rope find out how many maximum pieces we can make.
* e.g. n= 23, a= 11, b= 9, c = 12
* */
public class RopeCuttingProblem {
    private static int findOptimalCuts(int n, int a, int b, int c){
        if(n == 0)
            return 0;
        if (n < 0)
            return -1;
        int result = Math.max(Math.max(findOptimalCuts(n-a,a,b,c), findOptimalCuts(n-b,a,b,c)) ,findOptimalCuts(n-c,a,b,c));
        if (result == -1)
                return -1;
        return result + 1;
    }
    public static void main(String[] args){
        findOptimalCuts(23, 9 ,11, 12);
    }
}
