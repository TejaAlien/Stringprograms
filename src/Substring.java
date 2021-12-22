import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String s = st.next();
        int startindex = st.nextInt();
        int endindexminusone = st.nextInt();
        System.out.println(s.substring(startindex ,endindexminusone));
    }
}
