import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] ch = str.toCharArray();
        for(int i = 0; i <= str.length()-1-i; i++){
                char temp = ch[i];
                ch[i] = ch[str.length()-1-i];
                ch[str.length()-1-i] = temp;
        }
        System.out.println(ch);
    }
}
