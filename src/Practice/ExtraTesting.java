package Practice;

public class ExtraTesting {
	public static void main(String[] args) {

		// customer service

		float cus1 = 9800.00f, cus2 = 22380.00f, cus3 = 5490.00f, cus4 = 21200.00f, cus5 = 5538.00f;
		float totSale = cus1 + cus2 + cus3 + cus4 + cus5;
		System.out.println("\tSales Details");
		System.out.println("\t-------------");
		System.out.println("Total Sale  is  :  " + totSale);
		String display1 = "shop is closed";
		String display2 = "shop is open";

		// goal to close the shop

		if (totSale < 2000f) {
			System.out.println(display1.toUpperCase());
		}

		else {
			System.out.println(display2.toUpperCase());
		}

		// finding the best customer

		if ((cus1 > cus2) && (cus1 > cus3) && (cus1 > cus4) && (cus1 > cus5)) {
			System.out.println("CUSTOMER @1@ IS BEST");
		}
		else if ((cus2 > cus1) && (cus2 > cus3) && (cus2 > cus4) && (cus2 > cus5)) {
			System.out.println("CUSTOMER #2# IS BEST");
		}
		else if ((cus3 > cus1) && (cus3 > cus2) && (cus3 > cus4) && (cus3 > cus5)) {
			System.out.println("CUSTOMER *3* IS BEST");
		}
		else if ((cus4 > cus1) && (cus4 > cus2) && (cus4 > cus3) && (cus4 > cus5)) {
			System.out.println("CUSTOMER\" 4\" IS BEST");
		}
		else if ((cus5 > cus1) && (cus5 > cus2) && (cus5 > cus3) && (cus5 > cus4)) {
			System.out.println("CUSTOMER \' 5 \'IS BEST ");
		} else 
			
		System.out.println();
		System.out.println("\t***** THANK YOU *****");
	}
}
