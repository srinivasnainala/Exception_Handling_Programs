package ExceptionPrograms1;

import java.util.Scanner;

class AgeEligibilityException extends Exception
{
	AgeEligibilityException(String s)
	{
		super(s);
	}
}
public class CustomException1 {
public static void main(String[] args) {
   int age;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your age :");
   age=sc.nextInt();	
   try
    {
    	if(age<18)
    	{
    	throw new AgeEligibilityException("You are not eligible to vote");
    	}
    	else
    	{
    		System.out.println("You are eligible to vote");
    	}
   	}
    catch(Exception e)
    {
    	System.out.println(e);
    }
}
}
