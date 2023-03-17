import java.security.PublicKey;

public class Reversed {
        public  static String reverse(String a)

        {
            int i=0;
           
            for( i=a.length()-1;i>=0;i--)
        {

        }
            return "" +a.charAt(i);
        }
    public static void main(String[] args) {
        String a="DIHAHS ILA IRAHGAL";
        System.out.println(reverse(a));
    }
}
