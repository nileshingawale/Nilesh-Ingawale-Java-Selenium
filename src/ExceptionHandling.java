
public class ExceptionHandling {

	public static void main(String[] args)
	{
	
		int a = 0;
		int b= 20;
		int division = 0;
		int arr[] = {10,20};
		
		System.out.println(a);
		
		System.out.println(b);
		try
		{
			System.out.println(arr[5]);
		
			
			System.out.println("hello111");
	
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		try
		{
		division = b/a;
		System.out.println("divide by zero");
		}catch(Exception e)
		{
			System.out.println(e);
		}finally{
			System.out.println("In finally");
		}
	
		
		System.out.println("Hello");
     }
}