import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
	 
		int n=8;
		ArrayList<Integer>ArrayList=new ArrayList<>(n);
		
		for(int i=1;i<=n;i++)
		
			ArrayList.add(i);
			
			System.out.println(ArrayList);
			
			
			ArrayList.remove(4);
			ArrayList.remove(3);
			ArrayList.remove(6);
			
			System.out.println(ArrayList);
			
			
			for(int i=0;i<ArrayList.size();i++)
			
				System.out.println(ArrayList.get(i)+"");
			
			
		
	}

}
