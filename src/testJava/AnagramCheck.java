package testJava;

import java.util.Arrays;

public class AnagramCheck {

	public static boolean Anagram(String first, String second) {
		char[] f = first.toCharArray();
		char[] s = second.toCharArray();

		Arrays.sort(f);
		Arrays.sort(s);

		return Arrays.equals(f, s);
	}

	public static void main(String[] args) {

		System.out.println("String \"Bikash\" and \"kashBi\" are anagram ? " + Anagram("Bikashh", "kashBi"));

	}

}
