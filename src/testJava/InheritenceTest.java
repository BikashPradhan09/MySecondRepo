package testJava;

class ClassA {

	public ClassA() {
		System.out.println("Constructor A");
	}

	public void demo() {
		System.out.println("Method A");
	}

}

class ClassB extends ClassA {

	public ClassB() {
		System.out.println("Constructor B");

	}

	@Override
	public void demo() {
		System.out.println("Method B");
	}

}

class ClassC extends ClassA {

	public ClassC() {
		System.out.println("Constructor C");

	}

	@Override
	public void demo() {
		System.out.println("Method C");
	}
}

public class InheritenceTest {

	public static void main(String[] args) {

		ClassA a = new ClassA(); // Constructor A++
		a.demo();// Method A++
		System.out.println("**********************");
		ClassA a1 = new ClassB();// Constructor B--
		a1.demo();// Method B++
		System.out.println("**********************");
		ClassA a2 = new ClassC();// Constructor B--
		a2.demo();// Method B++
		System.out.println("**********************");
		ClassB b = new ClassB();// Constructor B--
		b.demo();// Method B++
		System.out.println("**********************");
		ClassB b1 = (ClassB) a1;// Constructor A--
		b1.demo();// Method B++
		System.out.println("**********************");
//		ClassB b2 = new ClassC();// Constructor C
//		b2.demo();// Method C
		System.out.println("**********************");
		ClassC c = new ClassC();// Constructor C
		c.demo();// Method C
		System.out.println("**********************");
//		ClassC c1 = (ClassC) b2;// Constructor B
//		c1.demo();// Method C
		System.out.println("**********************");
		ClassC c2 = (ClassC) a2;// Constructor A
		c2.demo();// Method C
		System.out.println("**********************");

	}
}