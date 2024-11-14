package ExceptionPrograms1;

public class ArrayIndexOutOfBoundsExceptionDemo {
public static void main(String[] args) {
	int a[]= {12,34,565,567623,32434};
	try
	{
		System.out.println(a[10]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}
}
