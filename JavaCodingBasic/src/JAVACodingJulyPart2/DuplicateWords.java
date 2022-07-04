package JAVACodingJulyPart2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void FindDuplicate(String inputStr) {

		// Split the given String with Space

		String str[] = inputStr.split(" ");

		// Create HashMap for storing values

		Map<String, Integer> map1 = new HashMap<String, Integer>();

		// start a for loop to store values in map1 with put keyword

		for (String strInArray : str) {

			if (map1.containsKey(strInArray)) {
				map1.put(strInArray.toLowerCase(), map1.get(strInArray) + 1); // if word already present in HashMap >>increase count
																// by 1
			} else {
				map1.put(strInArray, 1); // if adding for first time >> count =1
			}
		}

		// what ever values are stored in map1 now, we will extract those by keySet

		Set<String> ExtractWord = map1.keySet();

		// start the for loop and check if word has wordCount > 1

		for (String ExWord : ExtractWord) {

			if (map1.get(ExWord) > 1) {			//if the word extracted is greater than 1 , get the word count in integer side
				System.out.println(ExWord + " : " + map1.get(ExWord));
			}

		}

	}

	public static void main(String[] args) {

		FindDuplicate("sa re ga ma pa dha ni sa re ga pa dha ni sa ");

	}

}
