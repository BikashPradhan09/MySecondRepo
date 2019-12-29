package testJava;

import java.util.Scanner;

public class StringClassTest {

	static {
		String a = new String("Bikash");
		String b = "Kumar";

		System.out.println(b + "  " + a);

		a = "pradhan";
		b = "Sbp";

		System.out.println(b + "  " + a);
	}

	public static void main(String[] args) {
		System.out.println("Enter some string:::\n");

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		sc.close();

		char[] ch = s.toCharArray();
		for (char cht : ch) {
			if ((cht <= 90) && (cht >= 65)) {
				System.out.println(cht + "-" + (byte) cht + " - Upparcase");
			} else if ((cht <= 122) && (cht >= 97)) {
				System.out.println(cht + "-" + (byte) cht + " - Lowercase");
			} else if ((cht <= 57) && (cht >= 48)) {
				System.out.println(cht + "-" + (byte) cht + " - Numeric");
			} else {
				System.out.println(cht + "-" + (byte) cht + " - Special characters");
			}
		}

	}

}
