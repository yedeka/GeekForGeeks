package com.gfg.gcl12.recursion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Problem Statement - Given a String find all possible subsets of a string iteratively.
* Time Complexity - O(N) where N is the length of the string.
* */
public class FindSubSets {
    private static Set<String> generateSubsets(String strInput){
        Set<String> subsets = new HashSet<String>();
        subsets.add(new String(""));
        for(int i=0;i<strInput.length();i++){
            addSubsets(subsets, strInput, i);
        }
        return subsets;
    }

    private static void addSubsets(Set<String> subsets, String strInput, int iSubsetIndex){
        Iterator<String> setIterator = subsets.iterator();
        Set<String> newSet = new HashSet<>();
        while(setIterator.hasNext()){
            newSet.add(setIterator.next().concat(String.valueOf(strInput.charAt(iSubsetIndex))));
        }
        subsets.addAll(newSet);
    }

    private static void printSubSets(Set<String> subsets){
        Iterator<String> subsetiterator = subsets.iterator();
        System.out.println("The generated subsets for given String are as follows");
        while(subsetiterator.hasNext()){
            String str = subsetiterator.next();
            if(str.equalsIgnoreCase("")){
                System.out.print("<EMPTY>"+"||");
            }else{
                System.out.print(str+"||");
            }

        }
    }

    public static void main(String[] args){
        printSubSets(generateSubsets("ABC"));
    }
}
