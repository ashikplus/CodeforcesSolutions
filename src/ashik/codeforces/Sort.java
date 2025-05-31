package ashik.codeforces;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			int n = input.nextInt();
			int q = input.nextInt();

			input.nextLine();

			String a = input.next();
			String b = input.next();

			List<Map<Character, Integer>> list1 = new ArrayList<>();
			Map<Character, Integer> map1 = new LinkedHashMap<>();
			
			List<Map<Character, Integer>> list2 = new ArrayList<>();
			Map<Character, Integer> map2 = new LinkedHashMap<>();

			for (int i = 0; i < n; i++) {

				char ch = a.charAt(i);
				char ch1 = b.charAt(i);
				map1.put(ch, map1.getOrDefault(ch, 0) + 1);
				map2.put(ch1, map2.getOrDefault(ch1, 0) + 1);

				list1.add(new LinkedHashMap<>(map1));
				list2.add(new LinkedHashMap<>(map2));
			}
			
			for(int i=0; i<q; i++) {
				
				int l = input.nextInt();
				int r = input.nextInt();
				
//				System.out.println("l "+l +"r "+r);
				
				Map<Character, Integer> map3 = list1.get(l-1);
				Map<Character, Integer> map4 = list2.get(r-1);
				
//				System.out.println("there");
				
				int c1=0;
				int c2=0;
				for(Character car : map3.keySet()) {
					c1 += map3.get(car);
				}
				
				for(Character car : map4.keySet()) {
					c2 += map4.get(car);
				}
				
				System.out.println(Math.abs(c1-c2));
			}
		}
		input.close();
	}

}
