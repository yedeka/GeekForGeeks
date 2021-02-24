package com.gfg.gcl12.recursion;

/*
    Simple recursive program to find out binary equivalent of a number.
    at each step we calculate the remainder of diving by and send the quotient back into the recursive function.
    At the end we print the remainder for each step. This results in printing the remainders in reverse order which is exactly what we do during decimal to binary conversion.
*
 */
public class printBinaryEquivalent {
    private static void fun1(int n){
        if(n == 0)
            return;
        fun1(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args){
        fun1(16);
    }
}
