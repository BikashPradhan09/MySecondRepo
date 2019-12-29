package testJava;

import java.util.Scanner;

public class ReverseWordNotSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence:: ");
		String s = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		String[] st = s.split(" ");

		for (String ss : st) {
			if (!ss.equals("")) {
				sb.append(reverseWord(ss) + " ");
			}
		}

		System.out.println("Reverse of word:: \n" + sb.toString());
	}

	public static String reverseWord(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

}
