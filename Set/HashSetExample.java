package Set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
//		Set<Integer> set1 = new HashSet<>();
//		set.add(12);
//		set.add(10);
//		set.add(12);
//		set.add(15);
//		set.add(15);
//		set1.add(15);
//		set.remove(12);
//		set.clear();
		System.out.println(set.isEmpty());
//		System.out.println(set.contains(12));
//		if(!set.contains(12)) {
//			System.out.println("Hello");
//		}
//		System.out.println(set.size());
//		System.out.println(set1);
//		System.out.println(set);
//		set.retainAll(set1);
//		System.out.println(set);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Random rd = new Random();
		for(int i=0; i<n ;i++) {
			int num = rd.nextInt(100);
			set.add(num);
		}
		System.out.println(set);
		int arr[] = new int[set.size()];
		int index =0;
		for(int i:set) {
			arr[index] = i;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
