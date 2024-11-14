package ExceptionPrograms1;

import java.io.IOException;
import java.util.Scanner;

public class throwdsfs {
public static void main(String[] args)  {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value :");
	n=sc.nextInt();
	try 
	{
	if(n<=10)
	{
		throw new ClassNotFoundException(" number should be greater than 10");
	}
	else
	{
		System.out.println("fine");
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
//	e.printStackTrace();
	}
}
}
