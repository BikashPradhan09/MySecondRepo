package testJava;

public class SwapTest {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		System.out.println("Strings before swap: a = " +  
                a + " and b = "+b);
		
		a= a+b;
		b= a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println("Strings after swap: a = " +  
                a + " and b = "+b);
		
		StringBuilder s= new StringBuilder();
		s.append(a);
		s= s.reverse();
		
		System.out.println("Reversed \n"+s);
		
		char[] ch = b.toCharArray();
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
