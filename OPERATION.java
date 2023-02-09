import java.util.Scanner;





class A1 extends Thread{
	  
	 double i,j;
	  A1(Double a, Double b)
	  {
		  
		  i=a;
		  j=b;
		  
	  }
	  public void run()
	  {
		  
		  
		  System.out.println("Thread for arithmetic operation");
		  
		  System.out.println("Summation       :"+(i+j));
		  System.out.println("Subtraction     :"+(i-j));
		  System.out.println("Multiplication  :"+(i*j));
		  System.out.println("division        :"+(i/j));
		  
		  System.out.println("End of A1");
	  }
	  
  }


  
class B1 extends Thread{
	double i;
	B1(double a)
	{
		i=a;
	}
	
	public void run()
	{
		System.out.println(" Sine          :"+Math.sin(i));
		System.out.println(" cosine        :"+Math.cos(i));
		System.out.println(" tnagent       :"+Math.tan(i));
		System.out.println(" squareroot    :"+Math.sqrt(i));
		System.out.println(" cuberoot      :"+Math.cbrt(i));
		
		System.out.println("\n\nC1 class is over");
	}
}

class C1 extends Thread{
	double a,b,c;
	C1(double x,double y, double z)
	
	{
		a=x;
		b=y;
		c=z;
		
	}
	public void run()
	{
		System.out.println("Sum of number     :   "+(a+b+c));
	}

  

public class OPERATION {

	public static void main(String[] args) {
		
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter two number for arithmetic operations");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			
			System.out.println("Enter a number for trigonometric operation");
			
			double g=scanner.nextDouble();
			
			
			System.out.println("Enter values for three numebers");
			
			double df=scanner.nextDouble();
			double gh=scanner.nextDouble();
			double ft=scanner.nextDouble();
			
			
			A1 a1=new A1(x,y);
			
			B1 b1=new B1(g);
			
			C1 c1=new C1(df,gh,ft);
			
			a1.start();
			
			
			b1.start();
			
			
			c1.start();
		}
        catch (Exception e) {

e.printStackTrace();
		}
	}

}
}
