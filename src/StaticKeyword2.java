

class Student1{
	String name;
	static String trainer="Abc";
	
	public void attendTraining(){
		System.out.println("attendTraining...");
		System.out.println(name);
		System.out.println(trainer);
	}
	
	public static void m2()
	{
		//System.out.println(name);
		System.out.println(trainer);
	}
}

public class StaticKeyword2 {
	public static void main(String[] args) {
					
		Student1 s1 = new Student1();
		s1.name = "student1";
		s1.trainer  = "Naresh";
		
		Student1 s2 = new Student1();
		s1.name = "student2";
		System.out.println(s2.trainer);
		s2.trainer = "Naresh Chaurasia";

	
		System.out.println(s1.trainer);
		
		
		System.out.println(Student1.trainer);
	}
}
