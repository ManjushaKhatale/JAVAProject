package ControlFlowStatement;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		switch (num) 
		{
		
		case 10:
			System.out.println("Number is equal to 10");
			break;
			
		case 50:
			System.out.println("Number is equal to 50");
			break;
			
		case 100:
			System.out.println("Number is equal to 100");
			break;
			
		default:
			System.out.println("Enter the valid number");	
		}
		sc.close();
	}

}
