package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static ArrayList<String> getPerms(String str){

        ArrayList<String> permutations = new ArrayList<>();

         if(str == null){
             return null;
         }

         else if(str.length() == 0){
             permutations.add("");
             return permutations;
         }

         char first = str.charAt(0);
         String remainder = str.substring(1);
         ArrayList<String> words = getPerms(remainder);
         for(String word : words){
             for(int j = 0; j <= word.length(); j++){
                 permutations.add(insertCharAt(word, first, j));
             }
         }
        return permutations;
    }

    public static String insertCharAt(String word, char c, int i){
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(getPerms(str));

    }
}

