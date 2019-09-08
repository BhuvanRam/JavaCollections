import java.util.*;

public class WatchListQueue {
	public static void main(String[] args)
	{
		// Double Ended Queue - Deque
		ArrayDeque<String> watchList = new ArrayDeque<String>();
		watchList.addFirst("The Imitation Game");
		watchList.add("Green Mile");
		watchList.add("Forrest Gump");
		
		System.out.println("A".hashCode());
		System.out.println("B".hashCode());
		System.out.println(watchList.hashCode());
		
		for(String movie : watchList)
		{
			System.out.println(movie);
		}
		
		watchList.removeLast();
	
	}
}

