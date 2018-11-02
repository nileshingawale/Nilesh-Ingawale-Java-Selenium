
public class StudentInfo
{
	String Name;
	int Age, RollNo;
	static String CollName;
	

	
	public void studInfo(String Name , int Age , int RollNo , String CollName )
	{
		
		this.Name = Name;
		this.Age=Age;
		this.RollNo = RollNo;
		this.CollName = CollName;	
	}
	
	public static void coll()
	{
		CollName = "xyz";
	}
	
	public void display()
	{
		
		System.out.println(Name + " "+Age+ " "+RollNo+ " "+CollName);
	}
	
	public static void main(String[] args) 
	{
			StudentInfo s= new StudentInfo();
			s.studInfo("nil", 28, 1, "figmd");
			s.coll();
			s.display();

	}

}
