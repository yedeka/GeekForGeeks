package com.gfg.gcl12.recursion;

public class SumofDigits {
    private static int findDigitSUm(int n){
        int remainder = n %10;
        n = n/10;
        if(n <= 0)
            return remainder;
        return remainder + findDigitSUm(n);
    }

    public static void main(String[] args){
        int input = 253;
        System.out.println("Sum of digits for "+input+" => "+findDigitSUm(input));
    }

}
