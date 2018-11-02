package Exam;


interface parent1
	{
		 public void play();
		
		
		
	}

	class Mp3Player1 implements parent1
	{

		@Override
		public void play() 
		{
			System.out.println("In Mp3Player Play");
			
		}
		
	}

	class Mp4Player1 implements parent1
	{

		@Override
		public void play() 
		{
			System.out.println("In Mp4Player Play");
			
		}
		
	}


public class sevenInterface
{
	
	public static void main(String[] args)
	{
		parent1 p = new Mp3Player1();
		p.play();
		
		
		parent1 p1 = new Mp4Player1();
		p1.play();

	}

}
