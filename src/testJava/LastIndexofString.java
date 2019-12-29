package testJava;

import java.util.Scanner;

public class LastIndexofString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a line::");
		String s = sc.nextLine();
		
		//Scanner search = new Scanner(System.in);
		System.out.println("Please enter the letter::");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		int index1 = -1, index2=s.lastIndexOf(ch);
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)==ch && s.contains(Character.toString(ch)))
				index1=i;
			
		}
		
		System.out.println("Result from loop:  "+index1);
		System.out.println("Result from method:  "+index2);
	}

}
