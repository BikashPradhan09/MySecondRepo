package testJava;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	public RemoveDuplicates(String s) {
		
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		
		for (int i = 0; i<s.length();i++) {
			lh.add(s.charAt(i));
			
		}
		for(Character ch : lh) {
			System.out.print(ch);
		}
		
	}

	public static void main(String[] args) {
		String str = "Bikash Kumar Pradhan"; 
        RemoveDuplicates r = new RemoveDuplicates(str);

	}

}
