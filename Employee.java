
 class   EmployeeClass{
    	private int Id;
    	private String firstname;
    	private String lastname;
    	private double salary;
    	private double increase;
			
		
    	
    	public EmployeeClass(int ID, String f, String l, double S, double increase)
    	{
    		this.Id=ID;
    		this.firstname=f;
    		this.lastname=l;
    		this.salary=S;
    		this.increase=increase;
    	}
    	
    	public void setID(int Id)
    	{
    		this.Id=Id;
    	}
    	
    	public void setFirstname(String name)
    	{
    		this.firstname=name;
    	}
    	public void setlastname(String lastname)
    	{
    	this.lastname=lastname;
    	}
    	public void setsalary(double salary)
    	{
    		this.salary=salary;
    	}
    	public void setIncrease(double inc)
    	{
    		this.increase=inc;
    	}
    	public int getID()
    	{
    		return Id;
    	}
    	
    	public String getname()
    	{
    		return firstname;
    	}
    	
    	public String getlast()
    	{
    		return lastname;
    	}
    	
    	public double getSalary()
    	{
    		return salary;
    	}
    	
    	public double getIncrease()
    	{
    		return increase;
    	}
    	
    	public double getCal()
    	{
    		return (salary*increase)/100+salary;
    	}
    	
    }

public class Employee {

	public static void main(String[] args) {
		
		EmployeeClass e1=new EmployeeClass(1, "Kashif", "Khoso", 24000,30);
		
		System.out.println("Id of employee        :"+e1.getID());
		System.out.println("Name of employee      :"+e1.getname());
		System.out.println("Last name of employee :"+e1.getlast());
		System.out.println("Salary of employee    :"+e1.getSalary());
		
		System.out.println("New salary is         :"+e1.getCal());
		
EmployeeClass e2=new EmployeeClass(2, "Shahid", "laghari", 84000,50);
		
		System.out.println("Id of employee         :"+e2.getID());
		System.out.println("Name of employee       :"+e2.getname());
		System.out.println("Last name of employee  :"+e2.getlast());
		System.out.println("Salary of employee     :"+e2.getSalary());
		System.out.println("New salary is          :"+e2.getCal());
	}

}
