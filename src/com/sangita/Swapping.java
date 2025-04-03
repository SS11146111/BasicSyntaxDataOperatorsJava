package com.sangita;

import java.util.Scanner;

public class Swapping {
	
	int x;
	int y;
	
	Swapping(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void swapFunction()
	{
		
		this.y=this.y+this.x;
		this.x=this.y-this.x;
		this.y=this.y-this.x;
	}
	
	public String toString()
	{
		return "x = "+this.x+" , "+"y = "+this.y;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String flag= "y";
		
		while(flag.equals("y"))
		{
			
			System.out.println("\nEnter for x: ");
			int t1 = scanner.nextInt();
			
			System.out.println("\nEnter for y: ");
			int t2 = scanner.nextInt();
		
			Swapping obj1 = new Swapping(t1,t2);
			
			System.out.println("\nInitial values... ");
	
			System.out.println(obj1);
			
			obj1.swapFunction();
			
			System.out.println("\nSwapped values... ");
			
			System.out.println(obj1);
			
			System.out.println("Do you wish to continue? y/n");
			flag=scanner.next();
		

		}
		
		scanner.close();

	}
	
}

