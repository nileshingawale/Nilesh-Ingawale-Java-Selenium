interface Remote{
	public void powerOnOff();
	abstract public void volume();
}

 abstract class TvRemote implements Remote{
	public void powerOnOff(){
		System.out.println("power on");
	}
	
	public void volume(){
		System.out.println("volume");
	}
}

 class abc extends TvRemote
 {
	 
 }
 


public class IntefaceConcepts {
	public static void main(String[] args) {
		// TvRemote r = new TvRemote();
		//r.powerOnOff();
	}
}