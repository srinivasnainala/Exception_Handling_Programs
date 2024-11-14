package ExceptionPrograms1;

import java.rmi.AlreadyBoundException;

public class MultipleExceptionsInOneCatchblock {
public static void main(String[] args) throws AlreadyBoundException {
	int a=10,b=0;
	int c;
	String s="vasu";
	try
	{
		System.out.println(s.length());
		try
		{
		c=a/b;
		}
		catch(Exception z)
		{
			System.out.println(z);
		}
		System.out.println(s.charAt(7));
	}
	catch(NumberFormatException | NullPointerException |ArithmeticException | StringIndexOutOfBoundsException e)
	{
	System.out.println(e);	
	}
	System.out.println("vasu");
}
}
