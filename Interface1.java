  interface Dog{
	  public void sound();
	 
  }

  class pet implements Dog{
	  public void sound() {
		System.out.println("Extending pet class from interface of dog\nDog is barking ");
	}
  }

public class Interface1 {

	public static void main(String[] args) {
		
            pet ptPet=new pet();
            
            ptPet.sound();
	}

}
