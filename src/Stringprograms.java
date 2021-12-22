import java.util.Scanner;

public class Stringprograms {
    public static void main (String[] a ){
        Scanner st = new Scanner(System.in);
        String A = st.next();
        String B = st.next();

      /*  // sum of the lenghts of A and B

        int string1length = Integer.parseInt(A);
        int string2length = Integer.parseInt(B);
        System.out
                .println(string1length+string2length);*/
        System.out.println(A.length()+B.length());

        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
        System.out.println(A.substring(1));
        System.out.println(Character.toUpperCase(A.charAt(0)));
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1)+" "+Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}
