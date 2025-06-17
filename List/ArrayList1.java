package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//adding elements
//		list.add(12); //0th index
//		list.add(10); // 1st index
//		list.add(15); // 2nd index
//		list.add(2,20);
//		list.set(2, 10);
//		list.add(10.0);
//		list.add(true);
//		list.add(null);
//		list.add('c');
//		System.out.println(list.size());
////		list.remove(Integer.valueOf(12));
//		list.add("String");
////		list.clear();
////		System.out.println(list.isEmpty());
//		System.out.println(list);
//		for(int i =0; i < list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println();
//		for(Object i : list) {
//			System.out.print(i + " ");
//		}
//		list.add(10);
//		System.out.println();
//		System.out.println(list.contains("c"));
//		System.out.println(list);
////		System.out.println(list.indexOf(10));
////		System.out.println(list.lastIndexOf(10));
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =1; i<=10 ;i++) {
			list.add(i);
		}
//		Collections.reverse(list);
//		System.out.println(list);
		int arr[] = new int[list.size()];
		for(int i =0 ;i<list.size();i++) {
			arr[i] = list.get(i);
		}
//		System.out.println(Arrays.toString(arr));
//		for(int i=0; i<arr.length ;i++) {
//			list.add(arr[i]);
//		}
//		Collections.sort(list);
		list.add(1);
		System.out.println(list);
		System.out.println(list.indexOf(11));
		System.out.println(list.lastIndexOf(1));
//		Collections.rotate(list, -5);
//		System.out.println(list);
	}

}
