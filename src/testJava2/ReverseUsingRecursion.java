package testJava2;

public class ReverseUsingRecursion {

	public static void main(String[] args) {

		String s = "Bikash";

		System.out.println("Reverse - " + new ReverseUsingRecursion().reverseWord(s));

	}

	public String reverseWord(String word) {
//		if (word.length() < 2) {
//			return word;
//		}

		return word.length() < 2 ? word : (this.reverseWord(word.substring(1)) + word.charAt(0));

	}

}
