
public class Thread2 extends Thread{
	
	
     public static void main(String[] args) {
		
    	 Thread t1=new Thread("Shahid Ali Leghari");
    	 
    	 t1.start();
    	 
    	 System.out.println("Thread has been created by your name :"+t1.getName());
	}
}
