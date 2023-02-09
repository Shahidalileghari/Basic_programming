         

class TimeClass{
        	  private int second,minute, hour;
        	  
        	  public TimeClass(int s,int m,int h) {
        		  
        		  this.second=s;
        		  this.minute=m;
        		  this.hour=h;
				
			}
        	  // setter
        	  public void setsecond(int sec)
        	  {
        		  this.second=sec;
        	  }
        	  
        	  public void setmint(int min)
        	  {
        		  this.minute=min;
        	  }
        	  public void sethour(int hou)
        	  {
        		  this.hour=hou;
        	  }
        	  
        	  // getter
        	  
        	  public int getSecond()
        	  {
        		  return second;
        	  }
        	  
        	  public int getminute()
        	  {
        		 return minute;
        	  }
        	  public int gethour()
        	  {
        		  return hour;
        	  }
        	  
        	  public void setTime(int second,int minute,int hour)
        	  {
        		  this.second=second;
        		  this.minute=minute;
        		  this.hour=hour;
        				  
        	  }
        	  public String toString()
        	  {
        		  return String.format("%02d:%02d:%04d",second,minute,hour );
        	  }
        	  
        	  public TimeClass nextSecond()
        	  {
        		  ++second;
        		  
        		  if(second>=60)
        		  {
        			second=0;
        			++minute;
        			if(minute>=60)
        			{
        				minute=0;
        				++hour;
        				
        				if(hour>=24)
        				{
        					hour=0;
        				}
        			}
        			
        		  }
        		  
        		  return this;
        	  }
        	  
          }
public class Time {

	public static void main(String[] args) {
		TimeClass tcClass=new TimeClass(6, 6, 23);
		
		System.out.println(tcClass);
		
		tcClass.setsecond(59);
		tcClass.setmint(59);
		tcClass.sethour(23);
		
		System.out.println(tcClass);
		
		
		tcClass.setsecond(60);
		tcClass.setmint(60);
		tcClass.sethour(22);
		
		
		System.out.println(tcClass.nextSecond());
		System.out.println(tcClass.nextSecond().nextSecond().nextSecond());

	}

           }
