package Exam;

abstract class parent
{
	abstract void play();
	
	public void display()
	{
		System.out.println("In display");
	}
	
}

class Mp3Player extends parent
{

	@Override
	void play() 
	{
		System.out.println("In Mp3Player Play");
		
	}
	
}

class Mp4Player extends parent
{

	@Override
	void play() 
	{
		System.out.println("In Mp4Player Play");
		
	}
	
}



public class SixAbstract {

	public static void main(String[] args) 
	{
		
		parent p = new Mp3Player();
		p.play();
		p.display();
		
		parent p1 = new Mp4Player();
		p1.play();
	}

}
