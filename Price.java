package programming.com;

public class Price {

	public static void main(String[] args) {
	int price[]= {32,12,45,76,89,87,654,908,5564};
 int n=4;
 
 System.out.println("Profit :"+rodcut(price, n));
	  }
      


public static int rodcut (int price[], int n)
{

if(n==0) {
	
	return 0;
}


int maxValue=Integer.MIN_VALUE;

for(int i=0;i<=n;i++)
{
int cost=price[i-1]+rodcut(price, n-i);

if(cost>maxValue)
{
	maxValue=cost;
}
}
return maxValue;
}
}


