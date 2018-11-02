import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) 
	{
	
		File file = new File("C:/Users/admin/Desktop/Sample.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			int val = fis.read();
			
			System.out.println(val);
			System.out.println((char)val);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
