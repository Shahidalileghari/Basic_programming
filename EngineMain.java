
class CarEngine{
	public void start()
	{
		System.out.println("The engine of car has started");
	}
	
	public void stop()
	{
		System.out.println("The engine of car has stopped");
	}
    }

class Car{
	private String color;
	private int max_speed;
	
	
	public void cardetails() {
		System.out.println("The color of car is "+color+"\nThe maximum speed is "+max_speed);
	}
	
	public void setcolor(String color)
	{
	this.color=color;
	}
	
	public void setmaxspeed(int ms)
	{
	this.max_speed=ms;
	}
	
}

class  HondaCar extends Car{
	public void hondastart() {
		CarEngine honda_Engine=new CarEngine();
		
		honda_Engine.start();
		
		honda_Engine.stop();
	}
}




public class EngineMain {

	public static void main(String[] args) {
		
HondaCar hondaCar=new HondaCar();

hondaCar.setcolor("Black");

hondaCar.setmaxspeed(46);

hondaCar.cardetails();

hondaCar.hondastart();

   System.out.println("Another car");

HondaCar hondaCar1=new HondaCar();

hondaCar1.setcolor("White");

hondaCar1.setmaxspeed(78);

hondaCar1.cardetails();

hondaCar1.hondastart();

	}

}
