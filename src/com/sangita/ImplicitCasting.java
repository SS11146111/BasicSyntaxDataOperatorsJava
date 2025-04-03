package com.sangita;

import java.util.Scanner;

public class ImplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String flag= "y";
		
		while(flag.equals("y"))
		{
			
			System.out.println("\nEnter an integer number: ");
			int t1 = scanner.nextInt();
			
			double d = t1;
		    
			System.out.println("\n\nDouble number = " + d);
			
			System.out.println("\nDo you wish to continue? y/n");
			flag=scanner.next();
			
		}
		
		scanner.close();
	}

}
