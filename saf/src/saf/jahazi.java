package saf;

import java.util.Scanner;

public class jahazi {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int choice;
		System.out.println("0:Sh20(30mins,3hrs)");
		System.out.println("1:Sh10(15Mins,1hr)");
		System.out.println("2:Sh20(15Mins,midnight)");
		System.out.println("3:Okoa 50");
		System.out.println("4:Okoa 20");
		System.out.println("5:Okoa 10");
		System.out.println("6:Okoa 5");
		System.out.println("7:Okoa 20(900MB,1hr)");
		System.out.println("8:Okoa Internet");
		System.out.println("98:More");
		
		choice=input.nextInt();
		System.out.println("________________________________________________");
		if (choice==0) {
			
			int debt=20;
			int totaldebt=20 +debt;
			int opinion;
			
			System.out.println("Existing unpaid Okoa:"+debt);
			System.out.println("New Okoa request:20");
			System.out.println("TOTAL DEBT will be:"+totaldebt);
			System.out.println("1:Accept");
			System.out.println("2:Decline");
			System.out.println("0:BACK 00:HOME");
			
			opinion=input.nextInt();
			System.out.println("________________________________________________");
			if(opinion==0) {
				System.out.println("0:Sh20(30mins,3hrs)");
				System.out.println("1:Sh10(15Mins,1hr)");
				System.out.println("2:Sh20(15Mins,midnight)");
				System.out.println("3:Okoa 50");
				System.out.println("4:Okoa 20");
				System.out.println("5:Okoa 10");
				System.out.println("6:Okoa 5");
				System.out.println("7:Okoa 20(900MB,1hr)");
				System.out.println("8:Okoa Internet");
				System.out.println("98:More");
					
				
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
