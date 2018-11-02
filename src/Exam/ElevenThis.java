package Exam;

public class ElevenThis 
{
	int a ;
	
	ElevenThis()
	{
		this(4);
		System.out.println(this);
		
	}
	
	ElevenThis(int a)
	{
		this.a = a;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		ElevenThis e = new ElevenThis();
		System.out.println(e);
			
	}

}
