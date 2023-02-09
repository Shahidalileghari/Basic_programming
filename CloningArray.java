package programming.com;

public class CloningArray {

	public static void main(String[] args) {
	
		int arr[]= {32,12,45,65,78,90};
		
		int array[]=arr.clone();
		
		System.out.println(arr==array);
		
		
		System.out.println(arr[0]==array[0]);
		
		System.out.println(arr[1]==array[1]);
		

	}

}
