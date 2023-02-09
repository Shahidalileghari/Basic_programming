package DSA.com;

 
class Array{
        	   

       		int index=0;
       		
       		int [] array=new int[30];
       		
       		int arr[][]=new int[10][3] ;
       		
        	   int i,j;
        	   
        	   
        	   public void twodarray(int[][] array)
        	   {
        		   
        		   for(int i=0;i<10;i++)
        		   {
        			
        		    for(int j=0;j<3;j++)
        			{
        				System.out.print("\t"+array[i][j]+" ");
        			}
        			System.out.println();
        	     	}
        		
        		   
        	   }
        	   
        	   
        public  void  oneDarray(int arr[][]) {
        	
        	System.out.println( "\n\tConverting  multidimensional array into one dimensional array");
    		System.out.println( " \n\tElements of one dimensional array\n");
    		System.out.print("\t[");
    		
    		
    		for( i=0;i<10;i++)
    		{
    			for( j=0;j<3;j++)
    			{
    				array[index]= arr[i][j];
    				
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
    		System.out.println("\n\n");
    		int n=array.length;
    		
    		for(i=0;i<n;i++) {
    			for(j=1;j<(n-i);j++)
    			{
    				if(array[j]>array[j+1])
    				{
    					int temp=0;
    					temp=array[j];
    					array[j]=array[j+1];
    					array[j+1]=temp;
    					
    					System.out.print(array[i]+",");
    				}
    			}
    		}
    		
    		
    		
    		// end of loop	
    		
    		
	         	}// end of oneD
        	   
//        	   
//        	public void Bubble()
//        
//        	{
//        		
//        		int n=arr.length;
//        		
//        		for(i=0;i<n;i++)
//        		{
//        			for(j=0;j<n-1;j++)
//        			{
//        				if(arr[i][j]>arr[i][j+1])
//        					
//        				{
//        					 int temp=0;
//        					 
//        					 temp=arr[i][j];
//        					 arr[i][j]=arr[i][j+1];
//        					 arr[i][j+1]=temp;
//        					 
//        					 System.out.print(arr[i][j]);
//        					 
//        				}
//        				
//        				System.out.println();
//        			}
//        		}
//        		
//        		
//        	}
        	   
        	   
        	   
           }
public class Arrays {

	public static void main(String[] args) {
		
int Darray[][]= {{1,12,13},{26,92,23},{35,32,2},{41,82,9},{56,34,33},{68,62,55},{70,72,23},{80,82,34},{94,92,90},{16,162,46}};

     Array arr=new Array();
     
     arr.twodarray(Darray);
     
     System.out.println("\n\n");
     arr.oneDarray(Darray);
     
     System.out.println("\n\n");
     
    //arr.Bubble(Darray);
		
	}

}
