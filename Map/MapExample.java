package Map;

import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		
		Map<String , Integer> mp = new HashMap<>();
		mp.put("Jihin", 12);
		mp.put("Akash", 1);
		mp.put("Abi", 2);
		mp.put("kesavan", 8);
		mp.put("Sun",20);
		mp.put("Rijo", 20);
		mp.put("RK", 12);
		mp.put("Rahul", 10);
		mp.put("Thiru", 15);
//		System.out.println(mp);
		mp.put("Rijo", 30);
//		mp.put(null, null);
//		System.out.println(mp);
//		System.out.println(mp.get("Jebash"));
//		System.out.println(mp.containsKey("akash"));
//		System.out.println(mp.containsValue(12));
//		mp.remove("Rijo"); // key 
//		mp.replace("Jihin", 13); // key --> updated value
//		mp.replace("Jihin", 13,12); // key , old value , new value
//		System.out.println(mp);
//		System.out.println(mp.size());
//		mp.clear();
//		System.out.println(mp.isEmpty());
//		for(String s:mp.keySet()) {
//			System.out.print(s+" "+ mp.get(s)+" ");
//		}
//		System.out.println();
//		for(int i:mp.values()) {
//			System.out.print(i+" ");
//		}
//		for(Map.Entry<String, Integer> entry:mp.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		mp.putIfAbsent("Jino", 15);
//		System.out.println(mp);
		Map<Integer,Integer> map = new HashMap<>();
		int arr[] = {1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,6,1,1,1,1,1,1,1,1};
		for(int i:arr) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		System.out.println(map.getOrDefault(9,0));
		System.out.println(map);
		Map<Character,Integer> char_map = new LinkedHashMap<>();
		String s = "aaabbbbcccaaaddddffffcccczzzzhhh";
		for(char c:s.toCharArray()) {
			char_map.put(c, char_map.getOrDefault(c, 0)+1);
		}
		System.out.println(char_map);
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> entry: char_map.entrySet()) {
			sb.append(String.valueOf(entry.getKey())).append(String.valueOf(entry.getValue()));
		}
		System.out.println(sb);
	}

}
