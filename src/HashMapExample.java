import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args)
	{
	
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("key1", "value1");
		hm.put("key2", "value2");
		hm.put("key2", "value2");
		System.out.println(hm);
		
		Set<String> s = hm.keySet();
		
		Iterator<String> iter = s.iterator();
		
		while(iter.hasNext())
		{
			String Key = iter.next();  // will return key
			String Value = hm.get(Key); // will return value for the key
			
			System.out.println("Key "+Key);
			System.out.println("Value "+Value);
			System.out.println("-----------------");
		}
		
		
		
		
		

	}

}
