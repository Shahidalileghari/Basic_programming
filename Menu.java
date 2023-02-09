import java.util.ArrayList;

public class Menu {
public static void main(String[] args) {
		
		String menutitle="My Dream Menu";
		
		
		ArrayList<String>menu=new ArrayList<>();
		
		String starter="Anda";
		String maincourse="Pulao";
		
		String dessert="Saag and rice";
		String drink="Lassi";
		String morningfood="Ando paratho";
		
		menu.add(starter);
		menu.add(maincourse);
		menu.add(dessert);
		menu.add(drink);
        menu.add(morningfood);
		System.out.println("Menu title :"+menutitle);
       System.out.println(menu);
}
}
