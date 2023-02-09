import java.util.Scanner;

public class MainMenu {

	Scanner scanner=new Scanner(System.in);
	int choice;
	int arr[];
	int size,i,t;
	int target[];
	 public int menu()
    {
   	 System.out.println("\n\nMenu ");
   	 System.out.println("1:Input array");
   	 System.out.println("2:Display array");
   	 System.out.println("3:Searching");
   	 System.out.println("4:Update");
   	 System.out.println("5:Insertion");
   	 System.out.println("6:Deletion");
   	 System.out.println("7:Exit");
   	 System.out.println("\nEnter your choice");
   	  choice=scanner.nextInt();
   	 return choice;
    }
	 
	 public int[] Input()
	 {
		 System.out.println("This array input method");
		 
		 System.out.print("Enter size of an array: ");
			 size=scanner.nextInt();
			
			arr=new int[size];
			System.out.print("Enter elements of an array: ");
			for( i=0;i<arr.length;i++)
			{
				System.out.print("Enter number at index " + i + "= " );
				arr[i]=scanner.nextInt();
			}
			
			return arr;
	 }
      
	 public void output()
	 {
		 System.out.println("This is display method");
		 
		 
		 
		
		 System.out.println(" elements of an array");
		 System.out.print("[");
		 for( i=0;i<arr.length;i++)
		 {
			if(i == (arr.length - 1)) {
				System.out.print(arr[i]);
				break;
			}
			 System.out.print(arr[i]+","); 
			
		 }
		 
		 System.out.print("]");
	 }
	 
	 public int Searching()
	 {
		 System.out.println("Searching an array method");
		 
		 System.out.println("Enter your target :");
		 choice=scanner.nextInt();
		 
		 for(i=0;i<arr.length;i++)
		 {
	
		 
		 if(arr[i]==choice)
		 {
			 System.out.println(arr[i]);
		 }
		 
		  
		 }
		 
		System.out.println(choice);
		
		return choice;
		 
	 }
	 
	 public void update()
	 {
		 System.out.println("Update an array method");
		 
		   
	 }
	 
	 public void insert()
	 {
		 System.out.println("Insert method");
	 }
	 
	 public void deletion()
	 {
		 System.out.println("deletion method");
	 }
	 
	 
	public void Exit()
	{
		System.out.println("Invalid input");
	}

public static void main(String[] args) {
	


   MainMenu mainMenu=new MainMenu();
   
   //mainMenu.menu();
   do {
  switch(mainMenu.menu())
   {
   
   case 1:
   
	   mainMenu.Input();
	   break;
   
   case 2:
   
	   mainMenu.output();
	   break;
   
   
   case 3:
   
	   mainMenu.Searching();
	   break;
   
   case 4:
   
	   mainMenu.update();
       break;
  case 5:
  
	 mainMenu.insert(); 
   break;
  case 6:
	  mainMenu.deletion();
	  break;
	  
   default:
	   System.out.println("System exit");
	   System.exit(7);
	  
	
   }
   }
  while(true);
 
     }
    }
