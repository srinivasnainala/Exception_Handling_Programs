package ExceptionPrograms1;



public class ExceptionPropagatedUnCheckedException {
	void add() 
	{
		int a=10,b=0;
		int c=a/b;
//	    throw new java.io.IOException("device error");
	}
	void show() 
	{
	add();
	}
	void dis()
	{
		try
		{
			add();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("vasu");
		}
		System.out.println("Exception handled");
	}
public static void main(String[] args) {
	ExceptionPropagatedUnCheckedException h=new ExceptionPropagatedUnCheckedException();
	h.dis();
	System.out.println("hello");
}
}
