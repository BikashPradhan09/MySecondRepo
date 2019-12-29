package testJava2;

import java.util.regex.Pattern;

public class PatternCheck {

	private static void checkPattern(String word) {
		// Pattern p = Pattern.compile(".*\\d.*");
		Pattern p = Pattern.compile(".*[^0-9].*");

		System.out.println(p.matcher(word).matches());
	}

	public static void main(String[] args) {

		String word = "abc112";
		checkPattern(word);

	}

}
