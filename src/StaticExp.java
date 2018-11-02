
public class StaticExp
{
	static 
	{
		System.out.println("In Static");
	}
	
	StaticExp()
	{
		System.out.println("In constructor...");
	}
	public static void main(String[] args)
	{
		StaticExp s = new StaticExp();
		
	}

}
