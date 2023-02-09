

class Test1 extends Thread {
	 public void run()
	 {
		 System.out.println("Working with threading in java");
		 
		 for(int i=1;i<=10;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println("Even numbers :"+i);
			 }
			 
		 }
	 }
}


class Test2 extends Thread{
	 public void run()
	 {
		 System.out.println("Working with threading in java");
			 for(int i=1;i<=10;i++)
		 {
			 if(i%2!=0)
			 {
				 System.out.println("Odd numbers :"+i);
			 }
			 
		 }
		 
	 }
}

class Test3 extends Thread{
	public void run()
	{
		System.out.println("Printing value of i");
		for(int i=0;i<=30;i+=2)
		{
			System.out.println("Value of i:"+i);
		}
	}
}
public class Test{

	
	
	 
			 

	public static void main(String[] args) {
		
		
		Test1 t=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		
		t.start();
		t2.start();
		t3.start();
	

	}

}
