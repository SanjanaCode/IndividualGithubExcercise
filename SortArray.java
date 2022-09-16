package IndividualGithubExcercise;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr1[] = {100,-10,90,40,4};
		int arr2[] = {-5,-9,5,10,0,8};
        
		System.out.println(Arrays.toString(sortInt(arr1)));
		
	}
	
	public static int[] sortInt(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		return arr;	
	}
	
}

