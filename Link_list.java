package programming.com;

import java.util.ArrayList;
import java.util.List;

public class Link_list {

	public static void main(String[] args) {
		
		
		List<Integer> c=new ArrayList<>();
		
		
		c.add(12);
		c.add(122);

		c.add(82);

		c.add(62);

		c.add(128);
		c.set(1, 453);
		//c.remove(4);
	//	c.clear();
		// d=c.get(3);
		
		System.out.println(c);
		boolean f=c.contains(56);
		System.out.println("F:"+f);
		
		boolean f2=c.contains(82);
		System.out.println("f2:"+f2);
		
		System.out.println("Getting required number");
		//System.out.println(d);

		for(int i=0;i<c.size();i++)
		{
			System.out.print(c.get(i)+" ");
		}

	}

}
