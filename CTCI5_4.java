package com.company;

import java.util.Scanner;

public class Main {

    public static boolean GetBit(int n, int index){
        return (n & (1 << index))>0;
    }

    public static int SetBit(int n, int index, boolean v){
        if(v){
            return n | (1 << index);
        }
        else{
            int mask = ~(1 << index);
            return n & mask;
        }
    }


    public static int GetNext_NP(int n){
        if(n <= 0){
            return -1;
        }

        int index = 0;
        int ones = 0;

        //Get first one.

        while(!GetBit(n, index)){
            index++;
        }

        //Get next zero and turn it on.

        while(GetBit(n, index)){
            index++;
            ones++;
        }
        n = SetBit(n, index, true);

        //Turn the previous one off.

        index--;
        n = SetBit(n, index, false);
        ones--;

        //Set zeros.

        for(int i = index-1; i >= ones; i--){
            n = SetBit(n, i, false);
        }

        //Set ones.

        for(int i = ones-1; i >= 0; i--){
            n = SetBit(n, i, true);
        }

        return n;

    }

    public static int GetPrevious_NP(int n){
        if(n <= 0){
            return -1;
        }

        int index = 0;
        int zeros = 0;

        //Get first zero.

        while(GetBit(n, index)){
            index++;
        }

        //Get next one and turn it off.

        while(!GetBit(n, index)){
            index++;
            zeros++;
        }
        n = SetBit(n, index, false);

        //Turn on the previous zero.

        index--;
        n = SetBit(n, index, true);
        zeros--;

        //Set ones.

        for(int i = index-1; i >= zeros; i--){
            n = SetBit(n, i, true);
        }

        //Set zeros.

        for(int i = zeros-1; i >= 0; i--){
            n = SetBit(n, i, false);
        }

        return n;

    }


    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

        System.out.println(GetNext_NP(n));
        System.out.println(GetPrevious_NP(n));

    }
}
//-------------------------------------------------
//Input-
//38
//Output-
//41
//37
