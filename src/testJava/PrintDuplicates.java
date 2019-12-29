package testJava;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something:: \n");

		String str = sc.nextLine();
		sc.close();

		Set<Character> set1 = new LinkedHashSet<Character>();

		Set<Character> set3 = new LinkedHashSet<Character>();

		Set<Character> set2 = new LinkedHashSet<Character>();

		char ch[] = str.toCharArray();

		for (char c : ch) {

			set3.addAll(set1);
			set1.add(c);

			if (set3.equals(set1)) {

				set2.add(c);

			}

			set3.clear();

		}

		System.out.println(set1.toString());

		System.out.println(set2.toString());

		printDuplicateCharacters(str);

	}

	public static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();

		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}

}
