package DSA.com;



public class SumAndAverage {
             SumAndAverage next;
             
             int data;
             
             int sum=0;
	public SumAndAverage(int data) {
		this.data=data;
		
	  }
	
	
	int sum(SumAndAverage head)	{
		
		
		SumAndAverage ptr=head;
		
		while(ptr!=null)
		{
			sum+=ptr.data;
			ptr=ptr.next;
		}
			
		
		
		return sum;
	}
	public static void main(String[] args) {
		  SumAndAverage sum=new SumAndAverage(2);
		  
		  SumAndAverage pAndAverage=sum;
		  
		  
		  for(int i=2;i<40;i++)
		  {
			  pAndAverage.next=new SumAndAverage(i*2);
			  pAndAverage=pAndAverage.next;
			  
			  
			 
		  }
		
		  System.out.println("\n\tList of numbers in linkedlist");
		  
		  for(SumAndAverage n=sum;n!=null;n=n.next)
		  {
			   
			  System.out.print(n.data+",");
			 
			  System.out.println( sum.sum(pAndAverage));
			  
		  }
		  
		  

		

	       }

            }
