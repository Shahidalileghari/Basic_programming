           class Date{
        	   private int day,month,year;
        	   public Date(int d,int m ,int y) {
				this.year=y;
				this.month=m;
				this.day=d;
			}
        	   
        	   public void setda(int da)
        	   {
        		   this.day=da;
        		   
        	   }
        	   public void setm(int m)
        	   {
        		   this.month=m;
        	   }
        	   
        	   public void sety(int y)
        	   {
        		   this.year=y;
        	   }
        	   public int getYear()
        	   {
        		   return year;
        	   }
        	   
        	   public int getMonth()
        	   {
        		   return month;
        	   }
        	   
        	   public int getday()
        	   {
        		   return day;
        	   }
        	   
        	   public String toString()
        	   {
        		   return String.format("%02d/%02d/%04d",day,month,year);
        	   }

           }
public class DateClass {

	public static void main(String[] args) {
		
		Date d1=new Date(05, 04, 2022);
		
		System.out.println(d1);
		
		d1.setda(6);
		d1.setm(8);
		d1.sety(2002);
		
		System.out.println(d1);

	}

}
