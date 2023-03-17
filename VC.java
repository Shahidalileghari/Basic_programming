import java.sql.SQLOutput;
import java.util.Scanner;

public class VC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter any string");
        s=sc.nextLine();

        char c;
        int v=0,co=0,sp=0,nu=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
             c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i' ||c=='o'||c=='u')
            {
                v++;
            } else if (c>='a' && c<='z') {
                co++;
                
            } else if (c>='0' &&c<='9') {
                nu++;
                
            } else if (c>=' ') {
                sp++;
            }
        }
        System.out.println("Vowel:"+v+"\nConsonant:"+co+"\nNumber:"+nu+"\nSpace:"+sp);
    }
}
