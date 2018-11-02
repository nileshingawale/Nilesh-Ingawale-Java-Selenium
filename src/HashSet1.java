import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");

		
	//	System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext())
		{
			String s = iter.next();
			System.out.print(s);
		}
		
	}

}
