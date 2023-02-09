import java.util.Calendar;

public class UIwithThread  {
                     
	   
	
	public static void main(String[] args) {
		
            Calendar cl=Calendar.getInstance();
            
            int year=cl.get(Calendar.YEAR);
            int month=cl.get(Calendar.MONTH);
            int day=cl.get(Calendar.DAY_OF_MONTH);
            int hour=cl.get(Calendar.HOUR_OF_DAY);
            int min=cl.get(Calendar.MINUTE);
            int second=cl.get(Calendar.SECOND);
            
            System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n",year,month+1,day,hour,min,second);
            
            
	}

}
