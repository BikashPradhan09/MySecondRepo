package testJava2;

public class PalindromeString {

	private static boolean isPalindrome(String word) {

		return reverse(word).equals(word) ? true : false;
	}

	public static void main(String[] args) {

		String first = "anything", second = "abcba";

		System.out.println(first + " is palindrome : " + isPalindrome(first));
		System.out.println(second + " is palindrome : " + isPalindrome(second));

	}

	private static String reverse(String word) {

		return word.length() < 2 ? word : reverse(word.substring(1)) + word.charAt(0);
	}

}
