

class CarFIGmd1{
	public void startEngine(){
		System.out.println("startEngine....");
	}
}

class MarutiFIGmd1 extends CarFIGmd1{
	
}

class BmwFIGmd1 extends CarFIGmd1{
	public void startEngine(){
		System.out.println("startEngine with more power....");
	}
}

public class CarInheritance1 {

	public static void main(String[] args) {

		CarFIGmd1 bmw = new BmwFIGmd1();
		bmw.startEngine();
	
	}
}
