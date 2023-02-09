import java.util.Scanner;

interface calculator1{
    int add(int a, int b);

    int sub(int a, int b);

    int div(int a, int b);

    int mul(int a, int b);
   }

   
interface calculator3{
   int add(int a, int b, int c) ;


  int sub(int a, int b, int c);

  int div(int a, int b, int c);

  int mul(int a, int b,int c);
 }

 interface calculator4{
  int add(int a, int b, int c, int w) ;


 int sub(int a, int b, int c, int w);

 int div(int a, int b, int c, int w);

 int mul(int a, int b,int c, int w);
}

public class CalculatorInterface {
    public static void main(String[] args)
     
    {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      int x=sc.nextInt();
      System.out.println("Enter second number");
      int y=sc.nextInt();
      System.out.println("Enter third number");
      int z=sc.nextInt();
      System.out.println("Enter fourth number");
      int t=sc.nextInt();
calculator1 calculator2=new calculator1()
   // annonymous inner class
{
    public int add(int x , int y)
      {
        return x+y;
      }

      public int sub(int x , int y)
      {
        return x-y;
      }
      public int div(int x , int y)
      {
        return x/y;
      }
      public int mul(int x , int y)
      {
        return x*y;
      }

     
      
};
calculator3 cl3=new calculator3() {
  public int add(int a, int b, int c)
  {
    return a+b+c;
  }
   
  public int sub(int a, int b, int c)
  {
    return a-b-c;
  }
  public int mul(int a, int b, int c)
  {
    return a*b*c;
  } public int div(int a, int b, int c)
  {
    return a/b/c;
  }

};
   

 calculator4 cl4=new calculator4() {
  
 
public int add(int a, int b, int c ,int w)
{
  return a+b+c+w;
}
 
public int sub(int a, int b, int c,int w)
{
  return a-b-c-w;
}
public int mul(int a, int b, int c, int w)
{
  return a*b*c*w;
} public int div(int a, int b, int c, int w)
{
  return w*a/b/c;
}
};
    System.out.println("Calculation with two parameters");

   try  
       {
       System.out.println("Summation       "+x+"+"+y+"="+calculator2.add(x, y)); 
       System.out.println("subtraction     "+x+"-"+y+"="+calculator2.sub(x, y));
       System.out.println("Multiplication  "+x+"*"+y+"="+calculator2.mul(x, y));
       System.out.println("Division        "+x+"/"+y+"="+calculator2.div(x, y));

       
     
       }
       catch(Exception e){
       System.out.println("Can't divide by zero");
       }
       System.out.println("Calculation with three parameters");
       try
       {
        System.out.println("Summation       "+x+"+"+y+"+"+z+"="+cl3.add(x, y, z)); 
        System.out.println("subtraction     "+x+"-"+y+"-"+z+"="+cl3.sub(x, y, z));
        System.out.println("Multiplication  "+x+"*"+y+"*"+z+"="+cl3.mul(x, y, z));
        System.out.println("Division        "+x+"/"+y+"/"+z+"="+cl3.div(x, y,z));
 
       }
       catch(Exception e)
       {
        System.out.println("calculator3 Can't divide by zero");
       }
       System.out.println("Calculation with four parameters");

       try
       {
        System.out.println("Summation       "+x+"+"+y+"+"+z+"+"+t+"="+cl4.add(x, y, z,t)); 
        System.out.println("subtraction     "+x+"-"+y+"-"+z+"+"+t+"="+cl4.sub(x, y, z,t));
        System.out.println("Multiplication  "+x+"*"+y+"*"+z+"*"+t+"="+cl4.mul(x, y, z, t));
        System.out.println("Division        "+t+"*"+x+"/"+y+"/"+z+"="+cl4.div(x, y,z, t));
 
       }
       catch(Exception e)
       {
        System.out.println("calculator3 Can't divide by zero");
       }
       
    }
}
