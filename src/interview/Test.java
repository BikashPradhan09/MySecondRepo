package interview;

import java.util.Scanner;

public class Test {

	private static int getSumofDigits(int i) {

		int rem = i % 10;
		if (i == 0) {
			return 0;
		}

		return rem + getSumofDigits(i / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int S = sc.nextInt();
		int start = 1, count = 0;

		for (int i = 1; i < R; i++) {
			start *= 10;
		}

		for (int i = start; i < (start * 10); i++) {
			if (S == getSumofDigits(i)) {
				System.out.println(i);
				count++;
			}
		}

		System.out.println(count);

	}

}
