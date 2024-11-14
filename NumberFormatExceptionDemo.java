package ExceptionPrograms1;

public class NumberFormatExceptionDemo {
public static void main(String[] args) {
	String s="vasu nainala";
	int n=790;
	try
	{
		s=Integer.toString(n);
		System.out.println(s);
//		 n=Integer.parseInt(s);
	}
	catch(Exception e)
	{
		System.out.println(e);
//		System.out.println(n);
	}
}
}
