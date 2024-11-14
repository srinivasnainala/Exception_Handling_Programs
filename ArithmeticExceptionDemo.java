package ExceptionPrograms1;

public class ArithmeticExceptionDemo {
public static void main(String[] args) {
	int a=10,b=0;
	try
	{
	int c=a%b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("Hello world");
	}
	System.out.println("my name is vasu");
}
}
