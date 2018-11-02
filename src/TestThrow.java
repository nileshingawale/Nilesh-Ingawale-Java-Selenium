
public class TestThrow {

	public static void main(String[] args)
	{
			int balance = 0;
			
			
			try {
				if(balance <= 0)
				{
					throw new RuntimeException("Insufficent balance");
				}
			} catch (Exception e)
			{
				String a = e.toString();
			    System.out.println(a);
			}

	}

}
