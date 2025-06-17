package Map;

import java.util.*;
public class Map1 {

	public static void main(String[] args) {
		
		Map<String , Integer> map = new HashMap<>();
		map.put("Jihin", 12);
		map.put("Aditya", 1);
		map.put("Rolex", 15);
		map.put("Kavin", 14);
		map.put("Nithish", 18);
		map.put("Jihin",20);
//		System.out.println(map.get("Kavin"));
		map.replace("Rolex", 1234);
		map.replace("Rolex", 12,12);
//		System.out.println(map.containsKey("jihin"));
//		System.out.println(map.containsValue(18));
//		System.out.println(map.size());
//		map.clear();
//		System.out.println(map);
//		System.out.println(map.keySet());
//		for(String s:map.keySet()) {
//			System.out.println(s+" : "+map.get(s));
//		}
//		System.out.println(map.values());
//		for(int i:map.values()) {
//			System.out.println(i);
//		}
//		for(Map.Entry<String, Integer> entry:map.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//		map.putIfAbsent("Jihin",12);
//		System.out.println(map);
//		[1,3,2,5]
		int arr[] = {1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,1,1,1,1,1,7,7,7,7,7};
		Map<Integer,Integer> freq = new HashMap<>();
		for( int i:arr) {
			freq.put(i, freq.getOrDefault(i, 0)+1);
//			System.out.println(freq);
		}
		System.out.println(freq);
		Map<Character,Integer> char_map = new TreeMap<>();
		String s = "aaaasssbbbbaaazzz";
		char ch[] = s.toCharArray();
		for(char c:ch) {
			char_map.put(c, char_map.getOrDefault(c,0)+1);
		}
//		System.out.println(char_map);
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> entry:char_map.entrySet()) {
			sb.append(String.valueOf(entry.getKey())).append(String.valueOf(entry.getValue()));
//			sb.append(String.valueOf(entry.getValue()));
		}
		System.out.println(sb.toString());
	}
}
