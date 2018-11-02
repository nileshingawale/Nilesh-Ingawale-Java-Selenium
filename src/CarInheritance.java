

class CarFIGmd
{
	public void startEngine(){
		System.out.println("startEngine....");
	}
}

class MarutiFIGmd extends CarFIGmd
{
	
}

public class CarInheritance {

	public static void main(String[] args) {
		MarutiFIGmd maruti = new MarutiFIGmd();
		maruti.startEngine();
	}
}