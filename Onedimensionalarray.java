package DSA.com;



//import javax.imageio.ImageTranscoder;

                    class Myarray{
//            	  Scanner scanner=new Scanner(System.in);
            	  int size,row,colom;
            	  int i,j;
            	  int count=0;
      int array[][]= {{1,4,96},{8,63,6},{10,204,16},{61,44,64},{17,49,67},{766,100,56},{19,94,196},{18,34,76},{51,84,26},{81,54,99}};
            	  int index=0;
            	  
            	  int rowarray[]=new int [30];
            	  
            	
            	  
            	  

            	  
            	      public void output()
            	       {
            	    	  System.out.println("\n\nmultidimensional array");
            		  for(i=0;i<10;i++)
            		  {
            			  for(j=0;j<3;j++)
            			  {
            				  System.out.print(array[i][j]+" \t ");
            			            }
            			  System.out.println();
            		                 }
            	          }
            	      
            	      
            	           public void row()
            	         {
            	        	   System.out.println("\nElement in row");
            	        	   System.out.print("[");
            		     for(i=0;i<10;i++)
            		      {
            			  for(j=0;j<3;j++)
            			  {
            				 rowarray[index]=array[i][j];
            				 
            				 System.out.print(rowarray[index]+" ,");
            				 
            				 index++;
            			               }
            		
            		                  }
            		     System.out.print("]");
            			  System.out.println();
            	                      }
            	           
            	           
            	           
            	           
            	           public void bublesort(){
            	        	   
            	        	   for(int i=0; i<rowarray.length; i++) {
            	        		   for(int j=0; j<rowarray.length-1-i; j++) {
            	        			   if(rowarray[j]>rowarray[j+1]) {
            	        				   //swap
            	        				   
            	        				   int temp = rowarray[j];
            	        				   rowarray[j] = rowarray[j+1];
            	        				   rowarray[j+1] = temp;
            	        				   count++;
            	        				  
            	        			   }
            	        			   
            	        			 //  System.out.println(count);
            	        		   }
            	        		   
            	        	   }
            	        	   System.out.println("sorted array");
            	        	   for(int i=0; i<rowarray.length;i++) {
            	        		   System.out.print(rowarray[i]+" ");
            	        	   }
            	        	   System.out.println();
            	           }
            	           
            	           
            	           
            	           
            	           
            	           public int BinarySearch( int key) {
            	        	   int start=0;
            	        	   int  end = rowarray.length-1;
            	        	   
            	        	   for(int i=0; i<rowarray.length; i++) {
            	        		   int mid = (start+end)/2;
            	        		   
            	        		   //comparisons
            	        		   if(rowarray[mid]==key) {
            	        			   System.out.println(key+" Key is found at index:");
            	        			   return mid;
            	        			   
            	        		   }
            	        		   else {
									 if(key > rowarray[mid]) {
										 start=mid+1;
									 }
									 else 
										 {
											 end = mid-1;
										 
									}
								}
            	        	   }
            	        	   return -1;
            	        	   
            	           }
            	           
            	           
            	           
                          }// end of class
                    
                    
                    
                    
public class Onedimensionalarray {

	public static void main(String[] args) {
		
		
		Myarray myarray=new Myarray();
		
		//myarray.input();
		myarray.output();
         myarray.row();
         myarray.bublesort();
         
          int key=196;
         


         
         System.out.println(myarray.BinarySearch(key));
	}

}
