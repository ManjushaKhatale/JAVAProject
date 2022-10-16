package ControlFlowStatement;

import java.util.Scanner;

public class EvenOddFind 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}else
		{
			System.out.println(num+" is odd number");
		}
		System.out.println("Program done");
		sc.close();
	}

}
