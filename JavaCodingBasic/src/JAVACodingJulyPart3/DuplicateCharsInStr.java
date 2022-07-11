package JAVACodingJulyPart3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharsInStr {
	
	
	//print number of times duplicate chars in String
	public static void main(String[] args) {
		
		String s = "dw dw" ;
		
		CheckStr(s); //to check negative scenarios
		
		
		char c[] = s.toCharArray();
		
		/*
		 * for(int i = 0 ;i < c.length ; i++) { for(int j = i+ 1 ; j < c.length ; j++ )
		 * { if(c[i] == c[j]) { System.out.println(c[i]); }
		 * 
		 * }
		 * 
		 * }
		 */
		
		
		
		System.out.println("!!!!!!!!!!!!!!!Duplicate Words!!!!!!!!!!!!!!!!!!!");
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character ch : c) {
			Integer count = map.get(ch);
			if(count == null) {
				map.put(ch, 1);
			}else {
				map.put(ch, ++count);
			}
}
		
		Set<Entry<Character,Integer>> entryset = map.entrySet();
		
		for(Entry<Character,Integer> mapEntry : entryset) {
			if(mapEntry.getValue() > 1) {
				System.out.println(mapEntry.getKey() + " :  " + mapEntry.getValue());
			}
		}
	

	}
	
	public static void CheckStr(String s) {
		if(s == null ) {
			System.out.println("String is Empty");
			return;
		}
		
		if(s.isEmpty()) {
			System.out.println("String is Empty");
			return;
		}
		
		if(s.length() == 1) {
			System.out.println("single char object");
			return;
		}
		
	}

}
