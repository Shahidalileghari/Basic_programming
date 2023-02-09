package DSA.com;




public class Linkedlist {
	
	       int data;
	       Linkedlist next;
	       
	    public   Linkedlist(int data)
	       {
	    	   this.data=data;
	       }
	    
	     public static void main(String[] args) {
		 Linkedlist listt=new Linkedlist(2);
		
		Linkedlist p=listt;
		
		
		for(int i=2;i<50;i++)
		{
			p.next=new Linkedlist(i*2);
			
			p=p.next;
		}
		
		
		for(Linkedlist n=listt;n!=null;n=n.next)
			
		{
			System.out.print(n.data+",");
		}
		
		System.out.println();
	   }
	   }
   
    
    
    
       

