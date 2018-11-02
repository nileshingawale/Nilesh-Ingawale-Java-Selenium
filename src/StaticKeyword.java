

class Student{
	String name;
	static String trainer;
	
	public void attendTraining(){
		System.out.println("attendTraining...");
	}
}

public class StaticKeyword {
	public static void main(String[] args) {
					
		Student s1 = new Student();
		s1.name = "student1";
		s1.trainer  = "Naresh";
		
		Student s2 = new Student();
		s2.name = "student2";
		System.out.println(s2.trainer);
		s2.trainer = "Naresh Chaurasia";

	
		System.out.println(s1.trainer);
		
		
		System.out.println(Student.trainer);
	}
}
