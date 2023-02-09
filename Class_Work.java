package programming.com;



public class Class_Work {

	public static void main(String[] args) {
		
	
      
  	int oopMarks[]=new int[4];
	
	int ppMarks[]=new int[4];

	
 String student[]=new String[4];
  
  
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
  
  student[0]="15SW0120";
  student[1]="15SW0121";
  student[2]="15SW0122";
  student[3]="15SW0123";

          
  
     String oopString[] =new String[oopMarks.length];
     
     for(int i=0;i<oopMarks.length;i++)
     {
    	 oopString[i]=String.valueOf(oopMarks[i]);
     }
     
     
     String ppString[] =new String[ppMarks.length];
     
     for(int i=0;i<ppMarks.length;i++)
     {
    	 oopString[i]=String.valueOf(oopMarks[i]);
     }
     
    String [][]info=new String[4][3];   
     
     System.out.println("\n\nRollNo \t\t\tOOp_marks\tPP_marks\n");
     // for length of info
     int n=info.length;
     int i=0;
     // while loop
     while(i<n)
      {
  	  info[i][0] = oopString[i];
  	  info[i][1] = ppString[i];
  	  info[i][2]=  student[i];
   	
  
  	
  	
 	System.out.println(student[i]+" \t\t"+oopMarks[i]+" \t\t"+ppMarks[i]);
  	
 	i++;
    }
    // end of while loop
     
     
	 }

     }
