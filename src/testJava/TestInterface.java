package testJava;

public class TestInterface {

	public static void main(String[] args) {
		A a = new B();
		a.display();
	}

}



class B extends A {
	void display() {
		System.out.println("B");
	}
}
class A  {
	void display() {
		System.out.println("A");
	}
}