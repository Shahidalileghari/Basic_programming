package programming.com;

public class Studentresult {

	public static void main(String[] args) {


		double []mark_oops   =new double[5];
		double []mark_pp     =new double[5];
		
		
		String names[]       =new String[5];
		
		mark_oops[0]=56;
		mark_oops[2]=58;
		mark_oops[3]=76;
		mark_oops[4]=50;
		//mark_oops[5]=86;
	//	mark_oops[5]=89;
		
		
		mark_pp[0]=86;
		mark_pp[1]=76;
		mark_pp[2]=65;
		mark_pp[3]=69;
	//	mark_pp[4]=46;
	//	mark_pp[5]=89;
		
		names[0]="Ali";
		names[1]="Ahmed";
		names[2]="Naseer";
		names[3]="Wali";
		names[4]="Waseem";
		
		int i=0;
		
		System.out.println("\t\tNames \t\tOOP_Marks \t\tPP_Marks");
		
		for( i=0;i<mark_oops.length;i++)
		{
			System.out.println("\t\t\t\t"+mark_oops[i]);
		}
		
//		for( i=0;i<mark_pp.length;i++)
//		{
//			//System.out.println("\t\t\t\t\t\t"+mark_pp[i]);
//		}
//		
//		System.out.println("\t\t\t\t"+mark_oops[i]+"\t\t\t\t\t\t"+mark_pp[i]);
	} }

    
