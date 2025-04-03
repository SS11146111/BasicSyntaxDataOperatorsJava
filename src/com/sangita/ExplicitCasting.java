package com.sangita;

import java.util.Scanner;

public class ExplicitCasting {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String flag= "y";
		
		while(flag.equals("y"))
		{
			
			System.out.println("\nEnter a double number: ");
			double t1 = scanner.nextDouble();
		    
			System.out.println("\n\nDouble number = " + t1);
			System.out.println("Converted integer = " +(int)t1);
			
			System.out.println("\nDo you wish to continue? y/n");
			flag=scanner.next();
			
		}
		
		scanner.close();
			
			
	}

}
