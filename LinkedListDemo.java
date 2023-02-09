
  class Link{
	          public int data;
	          public int key;
	          public Link next;
	          
	          Link(int  key, int data)
	          {
	        	  this.key=key;
	        	  this.data=data;
	        	  
	          }
	          public void display()
	          {
	        	  System.out.println("{"+key+","+data+"}");
	        	  
	          }
	          
	          
   }

public class LinkedListDemo {

	public static void main(String[] args) {
	
		Link link=new Link(43, 43);
		
		link.display();

	}

}
