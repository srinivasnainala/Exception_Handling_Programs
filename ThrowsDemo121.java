package ExceptionPrograms1;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo121 {
	static int c=12+10;
	void add() throws IOException
	{
		throw new IOException("we performing addition");
	}
public static void main(String[] args) {
	ThrowsDemo121 t=new ThrowsDemo121();
	try 
	{
	t.add();
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println(c);
	}
	System.out.println("hello world");
}
}
