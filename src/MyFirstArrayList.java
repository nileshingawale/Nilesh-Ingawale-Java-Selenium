import java.util.ArrayList;
import java.util.Iterator;

public class MyFirstArrayList {

	public static void main(String[] args)
	{
			ArrayList<String> al = new ArrayList<String>();
			al.add("A");
			al.add("B");
			al.add("C");
			al.add("A");

			for(int i =0 ; i<al.size();i++)
			{
				String val = al.get(i);
			}
			
			System.out.println(al);
			
			Iterator<String> iter = al.iterator();
			
			while(iter.hasNext())
			{
				String s = iter.next();
				System.out.print(s);
			}
			
			
			
			boolean bool = al.contains("A1");
			System.out.println(bool);
			
			String val = al.get(2);
			System.out.println(val);
			
			int i = al.indexOf("C");
			System.out.println(i);
			
			al.clear();
			
			System.out.println(al);
			
	}

}
