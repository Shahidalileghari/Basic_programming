package programming.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testarray {

	public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	
	Collections.addAll(list, "Shahid","Ali","Saleem","Kaleem","Raheem","Naeem");
	
	System.out.println(list);
	list.add(3, "SALEEM");
	
	System.out.println(list);
	
	System.out.println("Index of Shahid :"+list.get(0));
	System.out.println("Index of Kaleem :"+list.get(3));
    System.out.println("Sublist of (2,5)"+list.subList(2, 5));
    
    list.remove(4);
    
    System.out.println(list);
	}

}
