package Exam;


class emp
{
	String A= "ANC";
}


public class TenAnonymous
{
	 emp e = new emp();
	  int x = 10;
	  public void display()
	  {
	    System.out.println("Hello 1");
	  }
	  public static void main(String args[])
	  {
		 
		  
	    System.out.println((new TenAnonymous()).e.A);
	    System.out.println(new TenAnonymous().x);
	    System.out.println(new TenAnonymous().x);
	    new TenAnonymous().display();
	    new TenAnonymous().display();
	  }

}
