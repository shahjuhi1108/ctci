package com.company;

import java.util.Scanner;

public class Main {


    public static int getPaths(int a, int b, int x, int y){

        if(a == x && b == y){
            return 1;
        }

        if(a > x || b > y){
            return 0;
        }

        return getPaths(a,b+1, x, y) + getPaths(a+1, b, x, y);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(getPaths(0,0,2,2));

    }
}

