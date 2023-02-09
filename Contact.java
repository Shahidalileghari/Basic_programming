

import java.util.Scanner;


public class Contact  {
      Scanner scanner=new Scanner(System.in);
      int size=10;
      static   int  index;
      String [][] contacts;
      
      
      public void printallcontact()
      {
    	  System.out.println("contacts\t\tNames");
    	  for(String[] str:contacts)
    		  
    	  {
    		  System.out.println(str[0]+"\t"+str[1]);
    	  }
      }
      
      public void addnewcontact(String newcontact)
      {
    	  for(int i=0;i<contacts.length;i++)
    	  {
    		  if(contacts[i][0]==null)
    			  
    		  {
    			  contacts[i][0]=String.valueOf(i+1);
    			  contacts[i][1]=newcontact;
    			  
    			  break;
    		  }
    	  }
      }
      
      public void deletecontact(int number)
      {
    	
    	  for(int i=number-1;i<contacts.length;i++)
    		  
    	  {
    		  if(contacts[i][0]!=null)
    		  {
    			  contacts[i][0]=contacts[i+1][0];
    			  contacts[i][1]=contacts[1][1];
    		  }
    	  }
      }
      
      public boolean searchcontact(String contact)
      {
    	  index=-1;
    	  for(String[] check:contacts)
    	  {
    		  index++;
    		  if(contact.equals(check[1]) || contact.equals(check[0]))
    		  {
    			  return true;
    		  }
    	  }
    	  return false;
      }
      
       public void updatecontact(String contact)
       {
    	   if(searchcontact(contact))
    	   {
    		   System.out.println("1->Update contact number\n2->Update name");
    		   String update=scanner.nextLine();
    		      if(update.equals("1"))
    		    		  {
    		    	  System.out.println("Enter number to be updated");
    		    	  update=scanner.nextLine();
    		    	  contacts[index][0]=update;
    		    		  }
    		      
    		      else if(update.equals("2"))
    		      {
    		    	  System.out.println("Enter name to be updated");
    		    	  update=scanner.nextLine();
    		    			  contacts[index][1]=update;	  
    		      }
    		      
    		      System.out.println("Contact updated successfully");
    	   }
    	   
    	   System.out.println("Contact not found");
       }
      }
