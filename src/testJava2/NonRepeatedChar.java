package testJava2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class NonRepeatedChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something::\n");

		String s = sc.nextLine();
		sc.close();

		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> re = new LinkedHashMap<Character, Integer>();

		for (char ch : s.toCharArray()) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		for (char ch : s.toCharArray()) {
			re.put(ch, re.containsKey(ch) ? re.get(ch) + 1 : 1);
		}
		System.out.println(hm.toString() + "\n" + re.toString());

		for (Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
				break;
			}

		}
		for (Entry<Character, Integer> entry : re.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
				break;
			}

		}

	}
}
