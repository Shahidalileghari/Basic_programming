
import java.util.Scanner;





class Music{
    	
    	int option,i;
    	
    String choice;
    	
    	String songs[]= {"urdu","sindhi","indian"};
    	String song;
  
    	
    	Scanner scanner=new Scanner(System.in);
    	     
    	public int List()
    	{
    		System.out.println("\n\tMusic App");
    		System.out.println("\t1=>Song playlist");
    		System.out.println("\t2=>Search any song");
    		System.out.println("\t3=>Delete any songs");
    		System.out.println("\t4=>Add new songs");
    		System.out.println("\t5=>Update song");
    		
    		System.out.println("\t0=>Enter 0 to exit");
    		
    		System.out.println("Enter any option");
    		
    		
    		option=scanner.nextInt();
    		
    		
    		return option;
    	}
    	
    	public void playlist()
    	{
    		   System.out.println("\tList of songs");
    		for(int i=1;i<=songs.length;i++)
    		{
    			System.out.println("\t"+i+":"+songs[i]+"");
    		}
    		System.out.println();
    	}
    	
    	public void search()
    	{
    		System.out.println("Enter any song to be searched");
    		
    		choice=scanner.nextLine();
    		choice=scanner.nextLine();
    		int t=0;
    		//choice=songs[0];
    		for( i=0;i<songs.length;i++)
    		{
    			if(choice.equals(songs[i]))
    			{
    				System.out.println("Your searched song:"+songs[i]);
    				t=10;
    				break;
    			}
    			
    			
    		}
    		if(t!=10)
    		{
    			System.out.println("Song not found");
    		}
    		
    		
    	
    	}
    	
    	public void delete()
    	{
    		
    	}
    	
    	
    	
    	public void addnew(String song) {
    		System.out.println("Enter any song tobe added");
    		
    		
    	
    		for(int i=0;i<songs.length;i++)
    		{
    			if(songs[i]==null)
    			{
    				songs[i]=String.valueOf(i+1);
    				
    				songs[i]=song;
    				break;
    				
    			}
    		}
    		
    		
    		
    		
    		
    		
		}
    	
    	public void update()
    	{
    		System.out.println();
    	}
    }

public class MusicApp {

	public static void main(String[] args) {
		
		
		
			
		
			
			   Music music=new Music();
			   do {
			   switch(music.List())
			   {
			   case 1:
				   
				   music.playlist();
				   break;
				   
			        case 2:
				   
				   music.search();
				   break;
				   
			        case 3:
			     	   
			     	   music.delete();
			     	   break;
			     	   
			        case 4:
			     	   
			     	   music.addnew();;
			     	   break;
			        case 5:
			     	   
			     	   music.update();
			     	   break;
			     	   
			     	  default:
			     		   System.out.println("App exited");
			     		   System.exit(0);
			     	   

			     	   
			   }
			   }while(true);
		
	              }

                  }
