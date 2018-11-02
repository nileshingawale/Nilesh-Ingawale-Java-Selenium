
public class StringExample {

	public static void main(String[] args)
	{
	
		String s1= "ab";
		String s2= "ae";
		
		String s = "Tomorrow i have to study for written exam";
		
		char c = s.charAt(2);
		System.out.println(c);

		int comp = s2.compareTo(s1);
		System.out.println(comp);

		boolean bool = s1.equals(s2);
		System.out.println(bool);
		
		String s3 = s1+s2;
		System.out.println(s3);
		
		String s4 = s1.concat(s2);
		System.out.println(s4);
		
	}

}
