package testJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountNumbers {

	public static void countNumbers(List<String> ls) {
		int count = 0;
		List<Integer> sumPerWord = new ArrayList<Integer>();
		for (String ts : ls) {
			int sum = 0;
			for (int i = 0; i < ts.length(); i++) {
				if ((ts.charAt(i) >= '0') && (ts.charAt(i) <= '9')) {
					sum = sum + Integer.parseInt(String.valueOf(ts.charAt(i)));
					count++;
				}
			}
			sumPerWord.add(sum);

		}
		if (count == 0) {
			System.out.println("None");
		} else {
			int i = 0;
			for (String ts : ls) {
				System.out.println(ts + " " + sumPerWord.get(i));
				i++;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter String:: ");
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] sb = s.split(" ");
		List<String> ls = new ArrayList<String>();

		for (String st : sb) {
			if (!st.equals(" ")) {
				ls.add(st);
			}
		}

		countNumbers(ls);

	}

}
