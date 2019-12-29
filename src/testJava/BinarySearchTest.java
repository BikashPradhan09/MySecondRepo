package testJava;

import java.util.Arrays;

public class BinarySearchTest {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 22, 35 }; 
        Arrays.sort(arr);
        for(int a:arr) {
        	System.out.println(a);
        }
        
        int key = 22;
        
        int res = Arrays.binarySearch(arr, key);
        
        System.out.println(key +" found in index " +(res+1));
        
        
        
        
        }

}
