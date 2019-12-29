package testJava;

import java.util.HashMap;

public class OccuranceWord {

	public static void main(String[] args) {
		String s1 = "This is what it is what";
		String[] s2 = s1.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String s : s2) {

			if (hm.containsKey(s)) {
				hm.put(s, hm.get(s) + 1);
			} else {
				hm.put(s, 1);
			}

		}

		System.out.println("occurance is\n" + hm);

	}

}
