package IndividualGithubExercise;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr1[] = {100,-10,90,40,4};
		int arr2[] = {-5,-9,5,10,0,8};
		System.out.println(Arrays.toString(sortInt(arr1)));

		String arr3[] = {"March", "January", "February", "December","July","February"};
		System.out.println(Arrays.toString(sortString(arr3)));
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
    
    public static String[] sortString(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
			if(arr[j].compareToIgnoreCase(arr[j+1])>0) {	
				String temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}

