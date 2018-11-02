

class CarFIGmd2{
	public void startEngine(){
		System.out.println("startEngine....");
	}
}

class MarutiFIGmd2 extends CarFIGmd2{
	
}

class BmwFIGmd2 extends CarFIGmd2{
	public void startEngine(){
		System.out.println("startEngine with more power....");
	}
}

public class CarInheritance2 {

	public static void main(String[] args) {

		
		int price = 20;
		
		CarFIGmd2 car = null;
		
		if(price>=20){
			car = new BmwFIGmd2();
		}else{
			car = new MarutiFIGmd2();
		}
				
		car.startEngine();
	
	}
}
