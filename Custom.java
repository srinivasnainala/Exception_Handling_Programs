package ExceptionPrograms1;

class NaveenException extends Exception
{
	NaveenException(String s)
	{
		super(s);
	}
}
public class Custom {
public static void main(String[] args) {
	try
	{
		throw new NaveenException("i am naveen");
	}
	catch(Exception e)
	{
		System.out.println(e);
//		System.out.println(e+" gfvsdgdg");
//		e.printStackTrace();
//		System.out.println(e.getMessage());
	}
}
}
