package ControlFlowStatement;

import java.util.Scanner;

public class PositiveNegativeNum 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println(num+"is positive");
		}else
		{
			System.out.println(num+"is negative");
		}
		System.out.println("Program done");
		sc.close();
	}

}
