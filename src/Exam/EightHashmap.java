package Exam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Employee
{
	
	String empID;
	String empName;
	
}

public class EightHashmap
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.empID = "1";
		e1.empName = "A";
		
		Employee e2 = new Employee();
		e2.empID = "2";
		e2.empName = "B";
		
		HashMap<String, Employee> hm = new HashMap<String , Employee>();
		hm.put("ID1", e1);
		hm.put("ID2", e2);
		
		Set<String> s =  hm.keySet();
		
		Iterator<String> iter = s.iterator();
		
		while(iter.hasNext())
		{
			String key =  iter.next();
			Employee emp = hm.get(key);
			System.out.println(emp.empID);
			System.out.println(emp.empName);
			
		}
		       
		       
		       
	}

}
