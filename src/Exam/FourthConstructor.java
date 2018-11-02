package Exam;

public class FourthConstructor
{
	
	FourthConstructor()
	{
		this(5);
		System.out.println("In default constructor");
	}
	
	FourthConstructor(int a)
	{
		System.out.println("In parameter constructor --> "+a);	
	}
	

	public static void main(String[] args)
	{
	 
		FourthConstructor f = new FourthConstructor();

	}

}
