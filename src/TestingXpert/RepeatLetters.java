package TestingXpert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RepeatLetters {

	public static void main(String[] args) {
		String s = "Automaaaaation rrrrrocks mmmy wwwworld";
		s=s.toLowerCase();
		countRepeat(s);
	}

	private static void countRepeat(String s) {
		Set<Character> rd = new LinkedHashSet<Character>();
		
		for(int i =0;i<s.length();i++)
			if(s.charAt(i)!=' ')
				rd.add(s.charAt(i));
		
		System.out.println(rd);
		
		Map<Character, Integer> countLetters = new LinkedHashMap<Character, Integer>();
		Iterator<Character> itr = rd.iterator();
		
		while(itr.hasNext()) {
			int count =0;
			char chTemp=itr.next();
			for(Character ch:s.toCharArray()) {
				if(ch==chTemp) {
					count++;
					 					
				}
			}
			countLetters.put(chTemp, count);
		}
		
		//while(countLetters.entrySet().iterator().hasNext())
		System.out.println(countLetters);
		
	}	

}
