import java.util.Iterator;

public class Thread1 implements Runnable {
           
	
	String name;
	Thread thread;
	Thread1(String name)
	
	{
		this.name=name;
		thread=new Thread(this,name);		
		System.out.println("A new thread is "+thread+"\n");
		
		thread.start();
	}
	public void run() {
		try {
			
			for(int i=5;i>0;i--)
			{
				System.out.println(name+":"+i);
				
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread existing");
	}
	public static void main(String[] args) {
		
        new Thread1("1st");
        new Thread1("2nd");
        new Thread1("3rd");
        
              try {
				Thread.sleep(1800);
			} catch (Exception e) {
				e.printStackTrace();
			}
              
              
              System.out.println("Main thread is existing");
	}

}
