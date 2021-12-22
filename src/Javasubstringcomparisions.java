import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Javasubstringcomparisions {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String s = st.next();
        int len = st.nextInt();
        List<String> substring = new
                ArrayList<>();
        for(int i=0; i+len<=s.length();i++){
            substring.add(s.substring(i,i+len));
        }
        Collections.sort(substring);
        System.out.println(substring.get(0));
        System.out
                .println(substring.get(substring.size()-1));
    }

}
