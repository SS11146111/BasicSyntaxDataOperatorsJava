package com.sangita;

import java.util.Scanner;

public class Rectangle {

	
	double length;
	double breadth;
	double area;
	double perimeter;
	
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public double area()
	{
		
		return length*breadth;
		
	}
	
	public double perimeter()
	{
		
		return 2*(length+breadth);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String flag= "y";
		
		while(flag.equals("y"))
		{
			
			System.out.println("\nEnter the length: ");
			double t1 = scanner.nextDouble();
			
			System.out.println("\nEnter the breadth: ");
			double t2 = scanner.nextDouble();
			
			System.out.println("\nArea = " +  new Rectangle(t1,t2).area());
			System.out.println("\nPerimeter = " +  new Rectangle(t1,t2).perimeter());
			
			System.out.println("Do you wish to continue? y/n");
			flag=scanner.next();
			
			
		}
		
		
		
		scanner.close();

	}

}

