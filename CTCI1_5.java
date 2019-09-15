import java.util.Scanner;

//Replace space by %20.

public class Main{

    public static String replace(String st){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < st.length(); i++){
            char  c = st.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(replace(str));
    }
}
