class Car
{
	String color;
	final int fuelCapacity = 30;
	
	final public void awesomeStartEngineAlgo()
	{
		System.out.println("awesomeStartEngineAlgo...");
	}
}

class MyCar extends Car{
	/*public void awesomeStartEngineAlgo(){
		System.out.println("awesomeStartEngineAlgo...");
	}*/
}


public class FinalConcept {
	public static void main(String[] args)
	{
		
		Car c = new Car();
		c.color = "red";
		
		c.color = "passion red";
		
		//c.fuelCapacity = 35;

	}
}
