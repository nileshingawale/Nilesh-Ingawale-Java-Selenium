


abstract class shape1 
{

	abstract public  void Draw();
	
	public void display()
	{
		System.out.println("In PArent display");
	}
	
}



public class circle1 extends shape1
{
	
	public void display()
	{
		System.out.println("In PArent display");
	}

	@Override
	public void Draw() {
		System.out.println("IN draw");
		
	}
	
	public static void main(String[] args)
	{
		
		shape1 s = new circle1();
		
		s.Draw();
	}
	
}
