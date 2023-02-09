package programming.com;

public class Twodimensional {

	public static void main(String[] args) {
	
		int arr[][]= {{12,34,89,23,89,23},{19,34,56,23,89,23},{12,64,23,23,89,23},{12,34,21,23,89,23},{55,19,34,23,89,23},{32,12,64,23,89,23}};
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6  ;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
