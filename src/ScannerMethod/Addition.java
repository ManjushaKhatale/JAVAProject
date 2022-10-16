package ScannerMethod;

import java.util.Scanner;

public class Addition 
{
	int n1, n2, result;
	
	public void Addition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		n1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		n2 = sc.nextInt();
		
		sc.close();
		
		result = n1+n2;
		System.out.println("Addition is:"+result);
	}
	
	public static void main (String[] args)
	{
		Addition obj= new Addition();
		obj.Addition();
	}
	
	
}
