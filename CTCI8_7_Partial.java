package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void getCount(String indent, int target, int next, ArrayList<Integer> answer){

        System.out.println(indent + Integer.toString(target) + " Next " + Integer.toString(next) + " answer " + answer);

        int[] array = {25, 10, 5 ,1};

        if (target < 0 || next >= array.length){
            return;
        }

        int denom = array[next];


        if(target == 0){
            System.out.println(answer);
            return;
        }

        if(target > 0) {
            getCount(indent + "    |" ,target, next+1, new ArrayList<>(answer));
            answer.add(denom);
            getCount(indent + "    |", target - denom, next+1, new ArrayList<>(answer));
        }
    }



    public static void getCount(int target){
        getCount("|" ,target, 0, new ArrayList<>());
    }




    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cents = s.nextInt();
        getCount(15);

    }
}

