package TestingXpert;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3,9,4,99,66,98};
		
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				int temp;
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++)
		System.out.print(arr[i] +"  ");
	}

}
