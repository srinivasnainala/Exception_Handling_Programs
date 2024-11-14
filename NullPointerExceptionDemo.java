package ExceptionPrograms1;

public class NullPointerExceptionDemo {
public static void main(String[] args) {
	String s=null;
	try
	{
		System.out.println("Hello world");
		System.out.println(s.length());
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	System.out.println("Exception found");
}
}
