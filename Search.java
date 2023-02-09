
public class Search {
     public static void main(String[] args) {
		int [][] arr= {{2,4},{5,3},{3,5}};
		
		
		int [] arr2 =new int[6];
		int index=0;
		
		
		 for(int i=0;i<3;i++)
		  {
			  for(int j=0;j<2;j++)
			  {
				System.out.print(arr[i][j]+"\t");
			  }
			  System.out.println();
		  }
		  for(int i=0;i<3;i++)
		  {
			  for(int j=0;j<2;j++)
			  {
				 arr2[index]=arr[i][j];
				 
				 index++;
			  }
		  }
		  System.out.println("\n\n");
		 
		  for(int i=0;i<arr2.length-1;i++)
		  {
			 
			
				  
				
			  System.out.print(arr2[i]+",");
			 
		  }
		  System.out.print(arr2[arr2.length-1]);
		 
		  System.out.println( "\n\n");
		  
		  for(int i=0;i<arr2.length;i++)
		  {
			 				  				
			 System.out.print(arr2[i]);
			 if(i<arr2.length-1) {
				 System.out.print(",");
			 }
		  }
	}
}
