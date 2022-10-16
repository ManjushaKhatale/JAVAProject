package ControlFlowStatement;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int num=153,r,sum=0,temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
		{
			System.out.println("The given number is armstrong number");
		}else
		{
			System.out.println("The given number is not armstrong number");
		}
	}

}
