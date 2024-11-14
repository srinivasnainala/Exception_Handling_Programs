package ExceptionPrograms1;

import java.io.IOException;

public class ExceptionPropagatedCheckedException {
	void add() throws IOException 
	{
		throw new IOException("hello i am  an  checked exception");
	}
	void show() throws IOException
	{
		add();
	}
	void dis() throws IOException
	{
		try
		{
			add();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("welcome");
	}
public static void main(String[] args) throws IOException {
	ExceptionPropagatedCheckedException e=new ExceptionPropagatedCheckedException();
	e.dis();
}
}
