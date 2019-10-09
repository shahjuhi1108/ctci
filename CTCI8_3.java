package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
        for(int i = 0; i < 16; i++){
            subset.add(getMapping(arr, i));
        }
        return subset;
    }

    public static ArrayList<Integer> getMapping(ArrayList<Integer> arr, int num){
        int size = arr.size();
        ArrayList<Integer> mapping = new ArrayList<>();
        for(int i = 0; i < size; i++){
            if(getLSB(num) == 1){
                mapping.add(arr.get(i));
            }
            num >>= 1;
        }
        return mapping;
    }

    public static int getLSB(int n){
        return (n & 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> set = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            int x = s.nextInt();
            set.add(x);
        }

        //int[] set = {6,7,8,9};
        //System.out.println(Arrays.toString(set));
        System.out.println(getSubset(set));

    }
}

