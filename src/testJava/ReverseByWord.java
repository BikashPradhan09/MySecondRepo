package testJava;

import java.util.Scanner;

//import com.sun.tools.javac.code.Attribute.Array;

public class ReverseByWord {

	static{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence  ");
		String line = sc.nextLine();
		Scanner sc2 = new Scanner(line);
		int i = WordCount.wordcount(line);
		String arr[] = new String[i];
		
		for(i=i-1;i>=0 && sc2.hasNext();i--) {
			arr[i]=sc2.next();
		}
		for(String a:arr) {
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		
	}

}
