package programming.com;
       class Student{
    	   public int roll;
    	   public String name;
    	   public Student(int rollno, String names) {
			
    		  this.roll=rollno;
    		  this.name=names;
		}
       }
public class ArrayStudent {

	public static void main(String[] args) {
     Student[] arr;
     arr=new Student[5];
     
     arr[0]=new Student(1, "Sahid");
     arr[1]=new Student(2, "Ali");
     arr[2]=new Student(3, "Laghari");
     arr[3]=new Student(4, "Khan");
     arr[4]=new Student(5, "Shahzeb");
     
     for(int i=0;i<arr.length;i++)
     {
    	 int n=i+1;
    	 System.out.println("Student at "+n+" :"+arr[i].roll +" "+arr[i].name);
     }
	}

}
