
import java.util.Objects;
import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {
		Contact objContact=new Contact();
		
		objContact.contacts=new String[objContact.size][2];
		
		    objContact.contacts[0][0]="Shahid";
	        objContact.contacts[0][1]="03406919051";
	        objContact.contacts[1][0]="Kaleem";
	        objContact.contacts[1][1]="03406919056";
	        objContact.contacts[2][0]="Naeem";
	        objContact.contacts[2][1]="03406919055";
	        objContact.contacts[3][0]="Saleem";
	        objContact.contacts[3][1]="03406919052";
	        objContact.contacts[4][0]="Jaleem";
	        objContact.contacts[4][1]="03406919053";
	        
	        
	        Scanner scanner=new Scanner(System.in);
	        
	        String choice;
	        
	        do {
	        	
	        	System.out.println("\n\tContact app");
	        	System.out.println("1=>Dispaly all contacts");
	        	System.out.println("2=>Search any contacts");
	        	System.out.println("3=>Update any contact");
	        	System.out.println("4=>Add new contact");
	        	System.out.println("5=>Delete any contact");
	        	System.out.println("0=>To exit");
	        	
	        	System.out.println("\nEnter your choice");
	        	choice=scanner.nextLine();
	        	
	        	String name  , number;
	        	
	        	for(int i=0;i<30;i++)
	        	System.out.println();
	        	
	        	switch(choice)
	        	{
	        	
	        	case "1"->
	        	{
	        		objContact.printallcontact();
	        		System.out.println();
	        		System.out.println("Press any key");
	        		String temp=scanner.nextLine();
	        		
	        		
	        	}
	        	
	        	case "2"->
	        	{
	        		System.out.println("1->Search by number \t2-> Search by name");
	        		number=scanner.nextLine();
	        		if(number.equals("1"))
	        		{
	        			System.out.println("Enter number");
	        			name=scanner.nextLine();
	        			if(objContact.searchcontact(name))
	        			{
	        				System.out.println(" Contat with number +"+name+"is"+objContact.contacts[Contact.index][0]);
	        			}
	        			
	        			else {
							System.out.println("Cotanct not found");
						}
	        		}
	        		
	        		else if(number.equals("2")){
	        			System.out.println("Enter number ");
	        			
	        			name=scanner.nextLine();
	        			if(objContact.searchcontact(name))
	        			{
	        				System.out.println("Contact with name "+name+" is found at "+objContact.contacts[Contact.index][1]);
	        			}
						else {
							System.out.println("contact not found");
						}
					}
	        		
	        		System.out.println("Press any key");
	        		String tempString=scanner.nextLine();
	        		
	        	}
	        	
	        	case "3"->
	        	{
	        		System.out.println("Enter number or name to be updated");
	        		name=scanner.nextLine();
	        		objContact.updatecontact(name);
	        		
	        		System.out.println("Press any key to update");
	        		
	        		String tempString=scanner.nextLine();
	        	}
	        	
	        	case "4"->
	        	{
	        		System.out.println("Enter contact name to add");
	        		name=scanner.nextLine();
	        		objContact.addnewcontact(name);
	        		
	        		System.out.println("press any key");
	        		String temString=scanner.nextLine();
	        		}
	        	
	        	case "5"->
	        	{
	        		System.out.println("Enter name of the contact to delete");
	        		name=scanner.nextLine();
	        		objContact.deletecontact(Integer.parseInt(name));
	        		
	        		System.out.println("Contact with name "+name+"has been deleted");
	        		System.out.println("press any key");
	        		 String temp=scanner.nextLine();
	        		 
	        	}
	        	
	        	}
	        		
	        	for(int i=0;i<50;i++);
	        	
	        	System.out.println();
				
			} while (!Objects.equals(choice, "0"));
	        
	

	}

}
