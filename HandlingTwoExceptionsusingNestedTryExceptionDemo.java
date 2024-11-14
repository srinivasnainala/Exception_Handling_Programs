package ExceptionPrograms1;

public class HandlingTwoExceptionsusingNestedTryExceptionDemo {
public static void main(String[] args) {
	int a=10,b=0;
	int c;
	try
	{
		try
		{
			int n=Integer.parseInt("vasu");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		c=a/b;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
