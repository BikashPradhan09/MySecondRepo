package testJava;

public class ConversionTest {

	public static void main(String[] args) {
		double d = 100.293;
		long l = (long) d;
		int i = (int) l;
		float f = i;
		
		System.out.println(l+"  "+d+"  "+i+"  "+f);
	}

}
