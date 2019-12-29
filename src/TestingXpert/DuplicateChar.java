package TestingXpert;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateChar {

	public static void main(String[] args) {

		String s = "abbccc";
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (char ch : s.toCharArray()) {
			hm.put(ch, hm.containsKey(ch) ? hm.get(ch) + 1 : 1);
		}

		System.out.println(hm);

		for (Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() > 1) {
				System.out.print(e.getKey() + " ");
			}
		}

	}

}
