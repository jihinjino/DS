package List;

import java.util.*;

public class Reversse {
	public static int[] reverse(int arr[]) {
		int start =0;
		int end = arr.length-1;
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	public static int add(int n , int a) {
		int sum = n+a;
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr)); //
		int neArr[] = reverse(arr);
		System.out.println(Arrays.toString(neArr));
		int a = add(5,7);
		System.out.println(a);
	}

}
