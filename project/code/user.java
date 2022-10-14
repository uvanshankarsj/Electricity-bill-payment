import java.util.Scanner;

public class user extends database{
	public void user_(){
	int chc;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter 1 to view information");
	System.out.println("Enter 2 to pay the bill");
	System.out.println("Enter 3 to use customer care");
	System.out.println("Enter 4 to give feedback");
	chc=sc.nextInt();
	if (chc !=1 || chc !=2 || chc !=3 || chc!=4) {
		System.out.println("Enter the given choice alone only!");
		System.out.println("                  ");
	    user_();
	}
	switch (chc) {
	  case 1:
		  
			  System.out.println("Units used :"+ unit);
		      System.out.println("Tariff slab :"+ tariff_values);
              System.out.ptintln("Bill amount :" + amount);
	
	  case 2:
		  payment();
		  
	  case 3:
		  customer_care();
		  
	  case 4:
		  feedback();
		  
	}

}
}

