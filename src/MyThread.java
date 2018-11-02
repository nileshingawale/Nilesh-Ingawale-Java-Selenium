class MineThread extends Thread{
	public void run(){
		for(int i =0 ; i< 10 ; i++)
		{
			long l2 = Thread.currentThread().getId();
			System.out.println("li2="+l2);
			
		}
	}
}

public class MyThread 
{
	
	
	public static void main(String[] args)
	{
		MineThread t = new MineThread();
		//t.run();
		t.start();
		
		for(int i =0 ; i< 10 ; i++)
		{
			long l1 = Thread.currentThread().getId();
			System.out.println("li1="+l1);
			
		}

	}

}
