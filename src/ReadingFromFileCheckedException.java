import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromFileCheckedException 
{

	public static void main(String[] args) throws IOException 
	{
		
		read();
	}
	
	static void read() throws IOException
	{
		File file = new File("C:/Users/admin/Desktop/Sample.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int val = fis.read();
		
		System.out.println(val);
		System.out.println((char)val);
	}
}
