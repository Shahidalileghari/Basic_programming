

public class Buffer1 {

	public static void main(String[] args) {
		StringBuffer sB=new StringBuffer("Shahid") ;
		
		sB.append("\tAli");
		
		System.out.println(sB);
sB.insert(1, "Laghari");

System.out.println(sB);

sB.replace(2, 3, "Shahid");

System.out.println(sB);

StringBuffer s1=new StringBuffer("Shahid");

s1.delete(3, 6);

System.out.println(s1);

StringBuffer s2=new StringBuffer("Azhar");
s2.reverse();
System.out.println("Azhar=>"+s2);
	}

}
