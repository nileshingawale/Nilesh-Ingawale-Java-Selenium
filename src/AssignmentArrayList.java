import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentArrayList {

	public static void main(String[] args)
	{
			ArrayList<String> str = new ArrayList<String>();
			str.add("Blue");
			str.add("Black");
			str.add("Red");
			
			for(int i = 0 ; i < str.size();i++ )
			{
				String color = str.get(i);
				System.out.println(color);
			}
			
			System.out.println("--------------");
			
			Iterator<String> iter = str.iterator();
			String color1=null;
			
			while(iter.hasNext())
			{
				color1 = iter.next();
				
				if(color1.equals("Blue"))
				{
					//System.out.println("Hello");
					iter.remove();
					
					//str.remove(iter);
				}
				
				//System.out.println(color1);
			}
			 str.add(0, "orange");
			
			
			System.out.println(str);

			
			
	}

}
