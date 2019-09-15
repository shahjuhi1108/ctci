//Multiple ways-

import java.util.Arrays;
import java.util.Scanner;

//Anagram or not?

//#1- Two loops and two arrays-

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str1 = s.next();
        if(str.length() == str1.length()){
            int[] count = new int[26];
            int[] count1 = new int[26];
            for(int i = 0; i < str.length(); i++){
                int temp = str.charAt(i) - 'a';
                count[temp]++;
            }
            for(int i = 0; i < str1.length(); i++){
                int temp = str1.charAt(i) - 'a';
                count1[temp]++;
            }

            if(Arrays.equals(count, count1)){
                System.out.println("Yes, Anagram.");
            }

            else
                System.out.println("Yes, Anagram");
        }
        else
            System.out.println("Not anagram");
    }
}

----------------------------------------------------------------


import java.util.Scanner;

//Anagram or not?

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str1 = s.next();
        if(str.length() == str1.length()){
            int[] count = new int[26];
            for(int i = 0; i < str.length(); i++){
                int temp = str.charAt(i) - 'a';
                count[temp]++;
            }
            for(int i = 0; i < str1.length(); i++){
                int temp = str1.charAt(i) - 'a';
                count[temp]--;
            }

            for(int i = 0; i < count.length; i++){
                if(count[i] != 0){
                    System.out.println("Not anagram");
                    return;
                }
            }
            System.out.println("Yes, Anagram");
        }
        else
            System.out.println("Not anagram");
    }
}
---------------------------------------------------------------------------

import java.util.Scanner;

//Anagram or not?

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str1 = s.next();
        if(str.length() == str1.length()){
            int[] count = new int[26];
            for(int i = 0; i < str.length(); i++){
                int temp = str.charAt(i) - 'a';
                count[temp]++;
                temp = str1.charAt(i) - 'a';
                count[temp]--;
            }

            for(int i = 0; i < count.length; i++){
                if(count[i] != 0){
                    System.out.println("Not anagram");
                    return;
                }
            }
            System.out.println("Yes, Anagram");
        }
        else
            System.out.println("Not anagram");
    }
}
