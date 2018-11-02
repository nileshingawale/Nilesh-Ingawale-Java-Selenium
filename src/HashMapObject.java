import java.util.HashMap;


class FigEmployee
{
	String name;
	String empID;
}


public class HashMapObject
{

	public static void main(String[] args)
	{
		HashMap<String, FigEmployee> hm = new HashMap<String, FigEmployee>();
		
		FigEmployee e1 = new FigEmployee();
		e1.empID = "100";
		e1.name = "emp1";
		
		FigEmployee e2 = new FigEmployee();
		e2.empID = "100";
		e2.name = "emp1";

		hm.put("id1",e1);
		hm.put("id2",e2);
		
		
		
		FigEmployee emp = hm.get("id1");
		System.out.println(emp.empID);
		System.out.println(emp.name);
		
		
		
	}

}
