package Exam;

class A
{
	int sum =0;
	
	public void add(int a , int b)
	{
		this.sum = a+b;
		System.out.println("Parent class"+sum);
	}
	
}

public class ThirdOverridding extends A
{
	
	public void add(int a , int b)
	{
		sum = a+b;
		System.out.println("child class"+sum);
	}

	public static void main(String[] args)
	{
		ThirdOverridding o = new ThirdOverridding();
		o.add(1,2);
		
		A o1 = new ThirdOverridding();
		o1.add(1,3);
		
		

	}

}
