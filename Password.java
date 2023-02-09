

      class Check{
    	  
    	  double a,b;
    	  
    	  public Check(double x, double y) {
			this.a=x;
			this.b=y;
		}
    	  
    	  void setA(double d)
    	  {
    		  a=d;
    	  }
    	  void setB(double c)
    	  {
    		  b=c;
    	  }
    	  
    	  public double getA()
    	  {
    		  return a;
    	  }
    	  public double getB()
    	  {
    		  return b;
    	  }
    	  
    	  public void produce()
    	  {
    		  if(a%2==0&& b%2==0)
   
    		  {
    			  System.out.println( ("Sum:"+a+b));
    		  }
    		  
    		  else 
    			  if(a%2!=0&& b%2!=0)
    			  {
    				  System.out.println("Sub:"+(a-b));
    			  }
    		  
    			  else 
        			  if(a>=0&& b>=0)
        			  {
        				  System.out.println("mul:"+(a*b));
        			  }
    		  
    		  else {
				System.out.println("Divide:"+a/b);
			
			
    	  }
      }
      }

public class Password {

	public static void main(String[] args) {
		
		Check check=new Check(12, 3);
		
		
		
Check check1=new Check(13, -3);
		
		
Check check2=new Check(14, 36);

check.produce();
check1.produce();
check2.produce();
		
       
	}

}

