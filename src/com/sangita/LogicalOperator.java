package com.sangita;

import java.util.Scanner;

public class LogicalOperator {
	
	int num;
	
	public LogicalOperator(int num)
	{
		this.num = num;
	}
	
	public void display()
	{
		if((this.num>0) && (this.num%2==0))
		{
			System.out.println("Number is positive and even");
		}
		else
		{
			System.out.println("Number does not satisfy the conditions");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String flag= "y";
		
		while(flag.equals("y"))
		{
			
			System.out.println("\nEnter a number: ");
			int t1 = scanner.nextInt();
			
			LogicalOperator obj = new LogicalOperator(t1);
			
			obj.display();
			
			System.out.println("Do you wish to continue? y/n");
			flag=scanner.next();
			
			
		}
		
		scanner.close();
	}
	
}
