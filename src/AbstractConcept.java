

abstract class Shape
{
	abstract public void draw();
	
}

class circle extends Shape
{
	public void draw()
	{
		System.out.println("I am circle....");
	}
	
}

public class AbstractConcept 
{
	public static void main(String[] args)
	{
		Shape s = new circle();
		s.draw();
		
	}
	

}
