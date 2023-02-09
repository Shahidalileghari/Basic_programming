package DSA.com;


public class OneDArray {

	public static void main(String[] args) {
		
		int Darray[][]= {{1,12,13},{26,92,23},{35,32,2},{41,82,9},{56,34,33},{68,62,55},{70,72,23},{80,82,34},{94,92,90},{16,162,46}};
		
		
		System.out.println("\n\tElements of Multidimensional array");
		for(int i=0;i<10;i++)
		   {
			
		for(int j=0;j<3;j++)
			{
				System.out.print("\t"+Darray[i][j]+" ");
			}
			System.out.println();
	     	}
		
		
		
		int index=0;
		
		int [] array=new int[30];
		
		System.out.println( "\n\tConverting two dimensional array into one dimensional array");
		System.out.println("\n\tElements of one dimensional array\n");
		System.out.print("\t[");
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[index]= Darray[i][j];
				
				if(i==(array.length-1))
				{
				System.out.print(array[index]);
				break;
				}
				else {
					 System.out.print(array[index]+",");
				}
			
	          
				
				index++;
				
			}
			
			
		}
		System.out.print("]");
		// end of loop
		
		
		// sorting array
		
		System.out.println("\n\n\n");
		
	
		int temp=0;
		int i,j=0;
		
		//
		
		for( i=0;i<array.length;i++)
		{
			for( j=1;j<(array.length-1);j++)
			{
				if(array[j-1]>array[j])
				{
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
					System.out.print(array[i]);
				}
			}
		}
		
		
	}// end of main class

}// end of class
