import java.lang.ProcessBuilder.Redirect;

class Circle{
	   private double radius;
	   private String color;
	   
	   public Circle()
	   {
		   radius=1.0;
		   color="red";
	   }
	   
	   public Circle(double r,String C)
	   {
		   radius=r;
		   color=C;
		   
		   
	   }
	   public double getRadius()
	   {
		   return radius;
	   }
	   public String getcolor()
	   {
		   return color;
	   }
	   
	   public double getArea()
	   {
		   return radius*radius*Math.PI;
	   }
   }

public class TestCircle {

	public static void main(String[] args) {
		
            Circle c1=new Circle();
            
            System.out.println("The radius of circle is "+c1.getRadius()+" meter\n"+"The area of circle is "+c1.getArea()+"sq meter");
            
            
            Circle c2=new Circle(4.0,"Blue");
            System.out.println("The color of circle is "+c2.getcolor()+"The radius of circle is "+c2.getRadius()+"meter\n"+"The area of circle is "+c2.getArea()+"sq meter");
            
	}

}
