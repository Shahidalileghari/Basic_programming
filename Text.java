

class  ft implements Runnable

{
	public void run()
	{
		System.out.println("Runnable");
	}
}
public class Text {
	
	

	public static void main(String[] args) {
		  
		
		ft ft=new ft();
		
		Thread thread=new Thread(ft);
		
		thread.start();

	}

}
