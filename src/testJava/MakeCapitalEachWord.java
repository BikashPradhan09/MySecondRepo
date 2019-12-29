package testJava;

import java.util.Scanner;

public class MakeCapitalEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a line::");
		String s = sc.nextLine();
		String upper_case_line = "";
		int count = 0;
		
		Scanner lineScan = new Scanner(s);
		
		while(lineScan.hasNext()) {
			String wrd = lineScan.next();
			
			upper_case_line += Character.toUpperCase(wrd.charAt(0)) + wrd.substring(1) + " ";
			
			count ++;
		}
		
		System.out.println("Result:: \n"+upper_case_line.trim()+"\nNo of words:: "+count);
		
		System.out.println("Not by using inbuilt functions:: \n"+capitalWords(s));
	}
	static String capitalWords(String s) {
		
		char[] ch = s.toCharArray();
		
		for(int i =0; i<ch.length;i++) {

			if((i!=0 && ch[i-1]==' ') || (i==0)) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		
		}
		
		
		return new String(ch);
	}

}
