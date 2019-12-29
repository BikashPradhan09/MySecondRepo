package testJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		
		hashSet();
	}

	static void hashSet() {
		HashSet hs = new HashSet();
		hs.contains(1);
		TreeSet ss = new TreeSet(new MyComparator());
		
		ss.add(new StringBuffer("B"));
		ss.add(new StringBuffer("A"));
		ss.add(new StringBuffer("a"));
		ss.add(new StringBuffer("d"));
		ss.add(new StringBuffer("A"));
		ss.add(new StringBuffer("Z"));
		
		StringBuilder s;
		
		System.out.println(ss);
		
		
		
		
		
	}
}

class MyComparator<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		//return s2.compareTo(s1);
		return -s2.compareTo(s1);
	}
	
}
