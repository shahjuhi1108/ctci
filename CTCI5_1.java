package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int i = s.nextInt();
    int j = s.nextInt();
    int w = 32;

    int mask = (1<<i)-1 | ((1<<w-(j+1))-1)<<(j+1);

    int solution = (n & mask) | (m<<i);

        System.out.println(Integer.toBinaryString(solution));

    }
}

//------------------------------------------------------------
//Inputs-
//        210
//        13
//        3
//        6

