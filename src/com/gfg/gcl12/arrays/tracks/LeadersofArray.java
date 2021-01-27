package com.gfg.gcl12.arrays.tracks;

import java.util.ArrayList;

/*
*   Problem Statement   -   Given an array find the leaders in an array
*   Input               -   [7,10,4,3,6,5,2]
*   Output              -   [10,6,5,2]
* */
public class LeadersofArray {
    private static ArrayList<Integer> findLeaders(int[] input){
        ArrayList<Integer> leadersList = new ArrayList<Integer>();
        int inputLength = input.length, leader = input[inputLength-1];
        leadersList.add(leader);
        for(int i=inputLength-2;i>=0;i--){
            if(input[i] > leader){
                leader = input[i];
                leadersList.add(leader);
            }
        }
        return leadersList;
    }

    public static void main(String[] args){
        int[] input = new int[]{7,10,4,3,6,5,2};
        ArrayList<Integer> leaderList = findLeaders(input);
        System.out.print("LeaderList => [ ");
        for(Integer i: leaderList)
            System.out.print(i+", ");
        System.out.println("]");
    }
}
