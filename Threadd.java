
public class Threadd extends Thread{
    public void run()
    {
    	for(int i=9;i<=20;i++)
    	{
    		try {
				Thread.sleep(3000);
			} catch (Exception e) {
			   e.printStackTrace();
			}
    		
    		System.out.println("Value of i  :"+i);
    	}
    }
	public static void main(String[] args) {
		
                 Threadd t1=new Threadd();
                 
                 Threadd t2=new Threadd();
                 
                 t1.start();
                 
                 t2.start();
                		 
                		 
                		 
	}

}
