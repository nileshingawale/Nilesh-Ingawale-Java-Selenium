package Exam;

public class SecondOverloading 
{
	int sum =0;

	public void add(int a , int b)
	{
		this.sum = a+b;
		System.out.println(sum);
	}
	
	public void add(int a , int b, int c)
	{
		this.sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		SecondOverloading s = new SecondOverloading();
			s.add(1, 2);
			s.add(1, 2, 3);
			
	}

}
