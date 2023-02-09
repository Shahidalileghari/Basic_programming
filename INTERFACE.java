
interface MyInterface {
	public void run();
	public void see();
	
}

class PG implements MyInterface
{
	public void run()
	{
		System.out.println("These are java concepts");
		
	}
	
	public void see()
	{
		System.out.println("See you soon");
	}
}


public class INTERFACE {
	

	public static void main(String[] args) {
		
		PG myInterface=new PG();
		Thread thread=new Thread();
		
		try {
			myInterface.run();
			thread.sleep(1800);
			System.out.println("Afer 900 miliseconds");
			myInterface.see();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
