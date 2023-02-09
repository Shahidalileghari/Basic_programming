package programming.com;

public class HW {

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

     //roll of students
      
      student[0]=78;
      student[1]=87;
      student[2]=56;
      student[3]=53;
   
     // 2-D array to store student score and names
      
      
       int [][]info=new int[4][3];   
       
       System.out.println("\n\nRollNo\t\tOOp_marks\tPP_marks");
       // for length of info
       int n=info.length;
       int i=0;
       // while loop
      while(i<n)
      {
    	  info[i][0] = oopMarks[i];
    	  info[i][1] = ppMarks[i];
    	  info[i][2]=  student[i];
    	
    
    	
    	
   	System.out.println(student[i]+"\t\t"+oopMarks[i]+"\t\t"+ppMarks[i]);
    	
   	i++;
      }
      // end of while loop
	
		
		
		
      

	}

}
