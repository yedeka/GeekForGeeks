package com.gfg.gcl12.binarysearch;
/*
* Problem Statement -   Given a positive number n and precision p, find the square root of number upto p decimal places using binary search.
* Solution -    The only difference of this with interger square root is precision comes into picture in terms of increment and checking for mid * mid with X.
* */
public class FindSquareRootToPrecision {
    private static double findDecimalSqrt(double num, double precision){
        double decimal= 1/Math.pow(10,precision);
        double low = 1;
        double high = num + 1;
        double sqrt = 0;
        while(high >= low){
            double mid = (high + low)/2;
            if(Math.abs(mid*mid - num) <= decimal ){
                sqrt = mid;
                break;
            }
            else if (mid*mid < num)
                low = mid + decimal;
            else
                high = mid - decimal;
        }
        return sqrt;
    }

    public static void main(String[] args){
        double sqrt = findDecimalSqrt(2010,3);
        System.out.println("Decimal squrt of 2010 is "+sqrt);
    }
}
