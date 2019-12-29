package testJava2;

import java.util.Scanner;

public class ShopX {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		String[] s = new String[tc];

		for (int n = 0; n < tc; n++) {
			s[n] = sc.next();
		}

		for (int i = 0; i < tc; i++) {
			char[] ch = s[i].toCharArray();
			int sum = 0, x;

			int[] num = new int[ch.length];
			for (int j = 0; j <= (ch.length - 1); j++) {
				num[j] = Character.getNumericValue(ch[j]);

			}

			for (int n = num.length - 1; n >= 0; n -= 2) {

				num[n] = num[n] * 2;
				if (num[n] > 9) {
					int rem = num[n] % 10;
					int div = num[n] / 10;
					num[n] = rem + div;
				}
			}

			for (int n = 0; n < num.length; n++) {

				sum += num[n];
			}

			if ((sum % 10) != 0) {
				x = (((sum / 10) + 1) * 10) - sum;
			} else {
				x = 0;
			}
			System.out.println(x);

		}

	}
}