import java.util.Arrays;
import java.util.Scanner;

//Adjecant Duplicate will be removed.

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] ch = str.toCharArray();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while( i < str.length()-1){
            if(ch[i] == ch[i+1]){
                while(i < str.length()-1 && ch[i] == ch[i+1]){
                    i++;
                }
            }
            sb.append(ch[i]);
            i++;
        }
        System.out.println(sb.toString());
    }
}
