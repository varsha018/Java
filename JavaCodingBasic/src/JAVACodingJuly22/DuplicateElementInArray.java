package JAVACodingJuly22;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInArray {


	// 1. >> 2 for loops with i =0 and j =i+1 till the end of array ..compare and check
	// 2 for loops so time complexity is O(N^2) >>> WORST SOLUTION

	public static void main(String[] args) {
		
		DuplicateElementInArray ob = new DuplicateElementInArray();
		ob.DuplicateRemoveByHashSet();
		
		
		ob.RemoveDuplicateByHashMap();
		
		
		String s[] = { "sa", "re", "ga", "ma", "pa", "dha", "ni", "sa", "re" };

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i].equals(s[j])) {
					System.out.println("Duplicate value ===> " + s[i]);
				}

			}

		}

	}
	
	
	public void DuplicateRemoveByHashSet() {    //HashSet allows only unique values
												//Time Complexity O(n) >>> good solution
		
		String s[] = { "sa1", "re1", "ga1", "ma", "pa", "dha", "ni", "sa1", "re1" , "ga1"};
		
		Set<String> set = new HashSet<String>();
		
		
		for(String keys  : s) {
			
			if (set.add(keys) == false) {
				System.out.println("Duplicate values ===> " + keys);
			}
			
		}
		
		
		

		}
		
	

public void RemoveDuplicateByHashMap() { //time complexity O(2n) 
											//BEST solution

	String s[] = { "sa2", "re2", "ga2", "ma", "pa", "dha", "ni", "sa2", "re2" , "ga2"};
	
	Map<String, Integer > map = new HashMap<String, Integer >();
	
	
			
	//put values in HashMap		
			
	for(String keyname : s) {
		Integer count = map.get(keyname);
		if(count == null) {
			map.put(keyname, 1);
		}else
			map.put(keyname, ++count);
	}
	
	//Get value from HashMap
	
	Set<Entry<String, Integer>> entry = map.entrySet();
	for(Entry<String , Integer> entryset : entry ) {
		if(entryset.getValue()> 1) {
			System.out.println("Duplicate element is ===> " + entryset.getKey());
		}
		
		
	}
	
	
	

}


}
