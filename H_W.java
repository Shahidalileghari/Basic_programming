package programming.com;

public class H_W {

	public static void main(String[] args) {
		
		int oopMarks[]=new int[4];
		
		int ppMarks[]=new int[4];
	
		
      int student[]=new int[4];
      
      
      //Marks in OOP
      
      oopMarks[0]=90;
      oopMarks[1]=80;
      oopMarks[2]=85;
      oopMarks[3]=70;
      
      
      //Marks in PP
      
      ppMarks[0]=90;
      ppMarks[1]=60;
      ppMarks[2]=67;
      ppMarks[3]=77;

     //Names of students
      
      student[0]=78;
      student[1]=87;
      student[2]=56;
      student[3]=53;
   
     // 2-D array to store student score and names
      
      
       int [][]marks=new int[4][3];   
       
       System.out.println("RollNo\t\t\tOOp_marks\t\t\tPP_marks");
      for(int i=0;i<marks.length;i++)
      {
    	marks[i][0] = oopMarks[i];
    	marks[i][1] = ppMarks[i];
    	marks[i][2]=student[i];
    	
    
    	
    	
   	System.out.println(student[i]+"\t\t\t"+oopMarks[i]+"\t\t\t\t"+ppMarks[i]);
    	
    	
      }
      
		
		
		
	}

}
