package testJava2;

public class VowelCount {

	private static void count(String vowel) {
		int count = 0;

		for (char ch : vowel.toCharArray()) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				// System.out.println();

			}

		}
		System.out.println(vowel + "-- No of vowels are/is ==" + count);
	}

	public static void main(String[] args) {

		String vowel = "bikash";
		count(vowel);
	}

}
