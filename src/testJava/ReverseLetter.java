package testJava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLetter {

	public static void main(String[] args) {
		String s = "BikashPradhan";
		char[] ca = s.toCharArray();
		List<Character> ch = new LinkedList<>();

		for (char c : ca) {
			ch.add(c);
		}
		Collections.reverse(ch);

		@SuppressWarnings("rawtypes")
		ListIterator li = ch.listIterator();

		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

		System.out.println("\n\nRecusrsive string reverse______ \n" + stringReverse(s));

	}

	private static String stringReverse(String s) {
		if (s.isEmpty()) {
			return s;
		}

		return stringReverse(s.substring(1)) + s.charAt(0);
	}

}
