package ExceptionPrograms1;

import java.util.Scanner;

class OddException extends Exception
{
	OddException(String s)
	{
		super(s);
	}
}
public class ThrowDemo1111 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	try
	{
		if(n%2!=0)
		{
		   throw new OddException("A number must be even number");
		}
		else
		{
			System.out.println("It is a even number");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
