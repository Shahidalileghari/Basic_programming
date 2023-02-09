
import java.util.Scanner;



            class ContactApplication
            {
            	 static Scanner scanner=new Scanner(System.in);
                 
             
                   static int option;
                   
                   static   int input;
                   
                   
                   String numbers[] = {"03406919051","03406919052","03406919053","03406919054","03406919055"};
                   
                   String names[]   = {"Shahid","Ali","Kaleem","Naeem","Shahzeb"};
                   
                   
                   int i=0, j=0;
                 
                  
                   
                   String list[][];
                   
                   
                   
                   
                    static     String name,number;
                   
       	   public int ContactApp()
       	   {  System.out.println("\n\n");
       	       System.out.println("\tContact App\n");
       		   System.out.println("\t1=>Dispaly all contacts");
       		   System.out.println("\t2=>Search any contact");
       		   System.out.println("\t3=>Update number");
       		   System.out.println("\t4=>Delete mumber");
       		   System.out.println("\t5=>Add new number");
       		   System.out.println("\t0=>Exit the app");
       		   System.out.println("\n\tEnter any option");
       		   
       		option=scanner.nextInt();
       		   
       		   
       		   return option;
       		   
       	   }
       	   // end of contactApp
       	   
       	   
       	public void display()
       	{
       		System.out.println(" \t  contact list");
       		
       		System.out.println("\tNames"+"\t\tNumbers"+"\n");
       		

       		
       		list=new String[5][2];
       		
       		int n=list.length;
       		int k=0;
       		while(k<n)
       		{
       			list[k][0]=names[k];
       			list[k][1]=numbers[k];
       			
       			System.out.println("\t"+names[k]+"\t\t"+numbers[k]);
       			
       			k++;
       		}	
         	}  	// end of display method
       	
     
       	
       	
       	public int Search()
          	{
       		System.out.println("\n\tSearch any contact");
       		
       	
              System.out.println("Enter name of contact");
       		
       		System.out.println("\tEnter option");
       		 input=scanner.nextInt();
       	
      			
       	  
       	     return input;
       		
       	   } 	// end of search method
       	
      public void update()
      {
    	System.out.println("Update any contact");  
      }
      
      public void delete()
      {
    	System.out.println("Delete any contact");  
      }
      
      public void addnew()
      {
    	System.out.println("Add new contact");  
      }
      
      
      }  // end of class
            
           
            
            
    public class ContactLab2 {

	public static void main(String[] args) {
		
		ContactApplication app=new ContactApplication();
	
		do {
		switch(app.ContactApp())
		{
		   case 1:
			app.display();
		   break;
		 
		   case 2:
	            app.Search();
	       break;
	       
		   case 3:
		         app.update();
		   break;
		
		   case 4:
			     app.delete();
		   break;
			 
		   case 5:
				 app.addnew();
		    break;

		    default:
		         System.out.println("System exited ");
		         System.exit(0);
		 
		    break;
	 	}
      
	    }
		while(true);
	
	    }
      }
