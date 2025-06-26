package ashik.codeforces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemovalofUnattractivePairs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		input.nextLine();
		while (t-- > 0) {
			int n = input.nextInt();
			String s = input.next();

			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {

				int ch = s.charAt(i) - 'a';

				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}

			int max = 0;

//			Comparator.reverseOrder()
			Map<Integer, Integer> sortedMap = map.entrySet().stream()
					.sorted(Map.Entry.<Integer, Integer>comparingByValue()).collect(Collectors
							.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

			int sum = 0;
			int i = 0;
			int size = sortedMap.size();
			for (int key : sortedMap.keySet()) {

				int val = map.get(key);
				i++;
				
				if(size != i) {
					sum += val;
				}
				
				if(size == i) {
					max = val;
				}
			}
			
			if(sum >= max) {
				if(n%2==1) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else {
				System.out.println(max - sum);
			}

		}
		input.close();
	}

}
