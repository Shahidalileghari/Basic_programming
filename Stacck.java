package programming.com;

import java.util.Scanner;
import java.util.Stack;

public class Stacck {

	public static void main(String[] args) {
		
		Stack<Integer> c=new Stack<Integer>();
		
//		c.push(100);
//		c.push(110);
//		c.push(120);
//		c.push(180);
//		c.push(190);
//		c.push(5000);
		
		try (Scanner scanner = new Scanner(System.in)) {
			for(int i=0;i<=5;i++)
			{
				System.out.print("Enter value of element ");
				int value=scanner.nextInt();
				
				c.push(value);
			}
		}
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Getting all element :"+c.get(i));
		}
		//System.out.println(c);
		
		// d=c.peek();
		//System.out.println("Printing peek element ");
		//System.out.println(d);
		
	//	c.pop();
		
		//System.out.println(c);
		
	//	i s=c.search(5000);
		
		
		//System.out.println(s);

	}

}
