package ControlFlowStatement;

import java.util.Scanner;

public class SwitchCasePerformance 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Performance Id");
		int id= sc.nextInt();
				
		switch(id)
		{
		case 1:
			System.out.println("Poor Performance");
			break;
		
		case 2:
			System.out.println("Need to Improve");
			break;
			
		case 3:
			System.out.println("Good Performance");
			break;
			
		case 4:
			System.out.println("Excellent Performance");
			break;
			
		case 5:
			System.out.println("Employee of the year");
			break;
			
		default:
			System.out.println("Enter valid Performance Id");
		}
		sc.close();
	}
}
