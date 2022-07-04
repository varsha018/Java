package JAVACodingJulyPart2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {


			ArrayList<String> tvShows = new ArrayList<String>();
			
			tvShows.add("FRIENDS");
			tvShows.add("Game of Thrones");
			tvShows.add("How I met your Mother");
			tvShows.add("Money Heist");
			
			System.out.println("----------1---------");
			
			//1 -- Lambda Expression -->
			
			tvShows.forEach(series -> {System.out.println(series);}   );
			
			System.out.println("----------2---------");
			
			//2 -- Iterator -->
			
			Iterator<String> it = tvShows.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			System.out.println("------------3-------");
			
			//3 -- for each remaining lambda expression
			
			it = tvShows.iterator();
			it.forEachRemaining(show -> {System.out.println(show);}   );
			
			System.out.println("-------4------------");
			
			//4 -- for each loop
			
			for(String str : tvShows) {
				System.out.println(str);
			}
			
			System.out.println("--------5-----------");
			
			//5 -- for loop with index
			for(int i = 0; i < tvShows.size() ; i ++) {
				System.out.println(tvShows.get(i));
			}
			
			System.out.println("--------6-----------");
			
			//6 -- ListIterator backward/forward movement of list
			
			
			ListIterator<String> lTStr = tvShows.listIterator(tvShows.size());
			
			while(lTStr.hasPrevious()) {
			System.out.println(lTStr.previous());
			
			}
			
	}

}
