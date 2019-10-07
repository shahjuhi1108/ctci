package com.company;

import java.util.Scanner;

public class Main {

    public static int bitsRequired(int a, int b){
        int count = 0;

        for(int c = a ^ b; c != 0; c = c >> 1){
            count += c & 1;
        }

        return count;

    }


    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

        System.out.println(bitsRequired(a,b));

    }
}
//-------------------------------------------
//Input-
//31, 14 = 2
//11, 6 = 3
