package testJava;

import java.util.*;

public class FirstTest {
	 int x;
	 FirstTest(int x){
		 this.x=x;
		 
	 }
	
//	public void x() {
//		x=10;
//		
//	}
	
	void display() {
		System.out.println("x is "+x);
	}
	
	public static void main(String[] args) {
		
		FirstTest obj = new FirstTest(10);
		obj.display();
		
		
	}
	
	
}
