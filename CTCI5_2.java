package com.company;

import java.util.Scanner;

public class Main {

    public static String printBin(String str){
        int intpart = Integer.parseInt(str.substring(0, str.indexOf('.')));
        double decpart = Double.parseDouble(str.substring(str.indexOf('.'),str.length()));

        String int_string = "";

        while(intpart > 0){
            int r = intpart % 2;
            intpart >>= 1;
            int_string = r + int_string;
        }

        StringBuffer dec_string = new StringBuffer();

        while(decpart > 0){
            if(dec_string.length() >= 32){
                //return "ERROR";
                break;
            }

            if(decpart == 1){
                dec_string.append((int)decpart);
                break;
            }

            double r = decpart * 2;
            if(r >= 1){
                dec_string.append(1);
                decpart = r - 1;
            }

            else{
                dec_string.append(0);
                decpart = r;
            }
        }

        return int_string + "." + dec_string.toString();

    }

    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String str = s.next();

    String con = printBin(str);

        System.out.println(con);

    }
}

