package com.figmd.session4;
import com.figmd.session3.*;


class protectedAcess extends file3
{
	
	protected int dd;
	
	void method1()
	{
	protectedAcess d = new protectedAcess();
	d.aq();
	
	/*file3 f = new file3();
	f.aq(); not allowed */
	
	}
	
	protected void method2()
	{
		System.out.println("in method 2");
	}
	
}


public class file4  {

	public static void main(String[] args)
	{
		file3 f = new file3();
		f.display3();
		//f.non_public();
		
		protectedAcess as = new protectedAcess();
		as.dd = 123;
	
		

	}

}
