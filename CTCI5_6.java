package com.company;

import java.util.Scanner;

public class Main {

    public static int bitsSwap(int a){

        return (((a & 0xaaaaaaaa) >> 1) | ((a & 0x55555555) << 1));

    }


    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int a = s.nextInt();

        System.out.println(bitsSwap(a));

    }
}
//------------------------------------------
//Input-
//6 = 9
//13 = 14
