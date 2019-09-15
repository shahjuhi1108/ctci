import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str1 = s.next();
        int len = str.length();
        int len1 = str1.length();
        if(len != 0 && len1 != 0 && len == len1){
            str = str + str;
            if(str.contains(str1)){
                System.out.println("Yes, it is a substring.");
            }
            else
                System.out.println("Not a substring.");
        }

        else{
            return;
        }
    }
}
