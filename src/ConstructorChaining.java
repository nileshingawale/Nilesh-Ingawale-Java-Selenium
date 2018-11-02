

class Parent{
	Parent(){
		System.out.println("I am Parent...");
	}
}

class Child extends Parent{
	Child() {
		System.out.println("I am child...");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		Child c = new Child();
	}
}