package JAVACodingJulyPart4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateinArray {

	public static void main(String[] args) {
		String infra[] = { "Amazon", "Azure", "Amazon", "Azure", "Micrsoft" };

		// 1.using HashSet
		Set<String> i1 = new HashSet<String>();

		System.out.println("These are the duplicate words");

		for (String str : infra) {

			if (i1.add(str) == false) {
				System.out.println(str);
			}

		}

		// 2.Using HashMap

		Map<String, Integer> m1 = new HashMap<String, Integer>();

		// get values in HashMap
		for (String s1 : infra) {
			Integer Count = m1.get(s1);
			if (Count == null) {
				m1.put(s1, 1);
			} else {
				m1.put(s1, ++Count);
			}

		}
			// extract values from HashMap

			Set<Entry<String, Integer>> set = m1.entrySet();

			for (Entry<String, Integer> entry : set) {
				if (entry.getValue() > 1) {
					System.out.println("duplicatee element is : " + entry.getKey());
				}

			}
			
			
			//3.Stream >> create HashSet and use Stream
			
			Set<String> Set1 = new HashSet<String>();
			
			Set<String> DupSet = Arrays.asList(infra).stream().filter(e -> ! Set1.add(e)).collect(Collectors.toSet());
			
			System.out.println(DupSet);
	}

}
