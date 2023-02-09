          
  class InvoiceClass{
	  private String id;
	  private String desk;
	  private double quantity;
	  private double unitprice;
	  
	  public InvoiceClass(String i,String d, double q, double up)
	  {
		  this.id=i;
		  this.desk=d;
		  this.quantity=q;
		  this.unitprice=up;
		  
		  
	  }
	  
	  public void setId(String ID)
	  {
		  this.id=ID;
	  }
	  public void setDesk(String Desk)
	  {
		 this.desk=Desk; 
	  }
	  
	  public void setQ(double qun)
	  {
		  this.quantity=qun;
	  }
	  public void setUP(double Up)
	  {
		  this.unitprice=Up;
	  }
	  
	  public String getID()
	  {
		  return id;
	  }
	  
	  public double getQ()
	  {
		  return quantity;
	  }
	  public double getup()
	  {
		  return unitprice;
	  }
	  
	  public String getdesk() {
		return desk;
	}
	  
	  public double getCal()
	  {
		  return quantity*unitprice;
	  }
  }

public class Invoice {

	public static void main(String[] args) {
		InvoiceClass Iv1=new InvoiceClass("A001", "CD_1", 560.0, 90.0);
		System.out.println("\n\nInvoice of a shop ");
		System.out.println("ID of purchase       :"+Iv1.getID());
		System.out.println("Name of purchase      :"+Iv1.getdesk());
		System.out.println("Quantities of purchase :"+Iv1.getQ());
		System.out.println("Unitprice of purcahse  :"+Iv1.getup());
		
		System.out.println("Total price of purchase :"+Iv1.getCal());
		

	}

}
