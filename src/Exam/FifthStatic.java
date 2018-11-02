package Exam;

public class FifthStatic
{
	int Age;
	String name;
	static String collname;
	
	FifthStatic(int Age , String name)
	{
		this.Age = Age;
		this.name = name;
		
	}
	
	public static void CollInfo()
	{
		collname = "Dy";
	}
	
	public void displayInfo()
	{
		System.out.println(Age+ "  "+ name + "  "+collname);
	}
	
	
	
	public static void main(String[] args)
	{
	
		FifthStatic f = new FifthStatic(2,"Nilesh");
		f.CollInfo();
		f.displayInfo();

	}

}
