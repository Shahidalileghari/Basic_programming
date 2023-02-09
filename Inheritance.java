

class Personal {
	String nameString;
	public Personal(String name) {
		nameString=name;
	}
	public void print()
	{
		System.out.println("Name of student is :"+nameString);
	}
}

 class education extends Personal{
	 
	 String phoneString;
	 
	public education(String phone , String n) {
		super(phone);
		this.phoneString=phone ;
		
	}

	public void display()
	{
		super.print();
		System.out.println("Phone number of student :"+phoneString);
		System.out.println("Name number of student :"+n);
	}
	
	 
}

public class Inheritance {

	public static void main(String[] args) {
		
  education education=new education("0340","Shahid");
  

  
  
  education.display();
	}

}
