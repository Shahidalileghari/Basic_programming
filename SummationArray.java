package programming.com;

public class SummationArray {

	public static void main(String[] args) {
		
		int arr[]= {32,54,65,78,98,23,45};
		
		sum(arr);

	}
    public static void sum(int arr[]) {
    	
    	int Sum=0;
    	int i=0;
    	for( i=0;i<arr.length;i++)
    	{
    		Sum+=arr[i];
    		
    		
    	}
    	System.out.println("Summation:"+Sum);
    }
}
