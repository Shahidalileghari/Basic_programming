package programming.com;

import java.util.Scanner;

public class InputArray {
	int arr[];
        public void input()
        {
        	try (Scanner scanner = new Scanner(System.in)) {
				
			
        	
        	System.out.println("Printing elements of an array");
        	System.out.print("[");
        	for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+",");
			}
        	System.out.print(arr.length-1+"]");
        }
        }
	public static void main(String[] args) {
         InputArray array=new InputArray();
         
         array.input();
	}

}
