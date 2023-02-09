package DSA.com;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Shahid");
		ll.add("Ali");
		ll.add("Khan");
		ll.add("Ali");
		ll.add("Saleem");
		
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		System.out.println(l+"");
		System.out.println(l.size());
		
		System.out.println(l.getLast());
		System.out.println(l.getFirst());
		System.out.println("\n\n\n");
		Object arr[]=l.toArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
//		ll.addFirst("Name");
//        ll.addLast("Kareem");
//        ll.add(5,"Laghari");
//		System.out.println(ll);
//		
//		
//		ll.remove("Shahid");
//		ll.remove(3);
//		ll.removeFirst();
//		
//		ll.removeLast();
//		
//		
//		System.out.println(ll);
		System.out.println("\n\n\n");
		        for(int i=0;i<ll.size();i++)
		        {
		        	System.out.print(ll.get(i)+" ");
		        }
		        
		        System.out.println();

	}

}
