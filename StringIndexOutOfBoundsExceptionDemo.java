package ExceptionPrograms1;

public class StringIndexOutOfBoundsExceptionDemo {
public static void main(String[] args) {
	String s="vasu nainala";
	try
	{
		System.out.println(s.charAt(16));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}
}
