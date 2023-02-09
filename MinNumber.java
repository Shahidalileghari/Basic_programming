package programming.com;

public class MinNumber {
         static int  []a= {2,4,3,50,10,70,6,76,43,21,86};
 		
   		static int largest()
   		{
   			int i;
   			int max=a[0];
   			for(i=0;i<a.length;i++)
   			{
   			if(a[i]>max)
   			{
   				max=a[i];
   			}
   		
   			}
   			return max;
   		}

	public static void main(String[] args) {

		
		System.out.println("Maximum number in array :"+largest());
		
		System.out.println(a.getClass());

	   
	}
}
	


