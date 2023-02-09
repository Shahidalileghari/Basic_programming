class Rectangleclass{
	private double  length;
	private double width;
	
	public Rectangleclass(double len, double wid) {
		this.length=len;
		this.width=wid;
	}
	
	public void setwidth(double w) {
		this.width=w;
		
	}
	
	public void setLength(double l) {
		this.length=l;
		
	}
	
	public double getlength()
	{
		return length;
	}
	public double getwidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return 0.5*(length*width);
	}
	
	public double getperimeter() {
		
		return 2*(length+width);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		
		Rectangleclass R1=new Rectangleclass(4.0,6.0);
		
		System.out.println("The length of rectangle is "+R1.getlength());
		System.out.println("The width of rectangle is "+R1.getwidth());
		System.out.println("The area of rectangle is "+R1.getArea());
		System.out.println("The perimeter of rectangle is "+R1.getperimeter());
		
		Rectangleclass R2=new Rectangleclass(6.0,8.0);
		System.out.println("\n\n\n");
		System.out.println("The length of rectangle is "+R2.getlength());
		System.out.println("The width of rectangle is "+R2.getwidth());
		System.out.println("The area of rectangle is "+R2.getArea());
		System.out.println("The perimeter of rectangle is "+R2.getperimeter());

	}

}
