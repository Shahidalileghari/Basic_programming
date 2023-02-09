      class Mythread implements Runnable
      {
    	  public void run()
    	  {
    		  System.out.println("Please do something");
    	  }
      }
public class Thread3 {

	public static void main(String[] args) {
		
     Thread t1=new Thread(new Mythread(),"Book java1");  
     Thread t2=new Thread(new Mythread(),"Book java1");
      t1.start();
      t2.start();
     
     
     System.out.println("Threads are being run");
     System.out.println("Name of your thread is :"+t1.getName());
     System.out.println("Name of your thread is :"+t1.getName());
     
	}

}
