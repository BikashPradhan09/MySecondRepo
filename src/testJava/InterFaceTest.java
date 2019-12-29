package testJava;

class clC implements In, In2 {

	@Override
	public void A1() {
		System.out.println("A1 MAa Ki AAKH");
	}

	@Override
	public void A2() {
		System.out.println("A2 MAa Ki AAKH");
	}

	@Override
	public void B1() {
		System.out.println("A3 MAa Ki AAKH");
	}

	@Override
	public void B2() {
		System.out.println("A4 MAa Ki AAKH");
	}

}

public class InterFaceTest extends clC {

	public static void main(String[] args) {

		In it = new InterFaceTest();
		In2 innn = (In2) it;

		innn.B1();

	}

}
