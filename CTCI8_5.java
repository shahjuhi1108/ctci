package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//Solution as per CTCI book.

    public static void getPar(int count){
        char[] str = new char[count*2];
        getPar(count, count, str, 0);
    }

    public static void getPar(int l, int r, char[] str, int count){
        if(l < 0 || r < l){
            return;
        }

        if(l == 0 && r == 0){
            System.out.println(str);
        } else{
            if(l > 0){
                str[count] = '(';
                getPar(l-1, r, str, count+1);
            }
            if(r > l){
                str[count] = ')';
                getPar(l, r-1, str, count+1);
            }
        }
    }


    //Solution as per me.

   public static ArrayList<String> appendNext(int a, int b, String str) {
        ArrayList<String> list = new ArrayList<>();

        if(a == 0 && b==0){
            list.add(str);
            return list;
        }

        if(a > b){
            return list;
        }

        if(a > 0){
            list.addAll(appendNext(a-1, b, str+"("));
        }

        if(b > 0){
            list.addAll(appendNext(a, b-1, str+")"));
        }

        return list;

   }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        getPar(count);
        System.out.println(appendNext(2,2, ""));

    }
}
//-----------------------------------------------
//Input - 3
//Output-
((()))
(()())
(())()
()(())
()()()
//Input - 2
//Output-
//[(()), ()()]
