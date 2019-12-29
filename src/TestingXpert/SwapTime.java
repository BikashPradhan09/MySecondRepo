package TestingXpert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integers:: ");
		int count=0;
		List<Integer> ls = new ArrayList<Integer>();
		
		while(sc.hasNextInt()) {
			
			ls.add(sc.nextInt());
		}
		for(int i=0;i<ls.size();i++) {
			int arr[]= new int[ls.size()];
			arr[i]= ls.get(i);
			if(i==ls.size()-1) {
				count = countTest(arr);
			}
		}
		
		System.out.println("Minimum number of time required to swap :"+count);
		
		
		
	}
	
	public static int countTest(int[] arr) {
		int count,max,index=0;
		
		for(int i =0; i<arr.length;i++) {
			for(int j= 0; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					index=i;
				}
			}
		}
		
		if(arr.length%2==0) {
			if((Math.abs((arr.length/2)-1-index)) < (Math.abs((arr.length/2)+1-index))){
				count= Math.abs((arr.length/2)-1-index);
			}else {
				count=Math.abs((arr.length/2)+1-index);
			}
			
		}else {
			count= Math.abs(((arr.length+1)/2)-index);
		}
		
		
		
		return count;
	}

}
