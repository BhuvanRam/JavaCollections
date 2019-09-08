import java.util.*;

public class MoviePriorityQueue {
	public static void main(String[] args)
	{
		PriorityQueue<String> movies = new PriorityQueue<String>();
		movies.add("Avengers, The End Game");
		movies.add("The Imitation Game");
		movies.add("Shutter Island");
		movies.add("The Terminal");
		
		// Gives the head value. If the queue is empty throws exception
		System.out.println(movies.element());
		
		// Gives the head value. If the queue is empty returns null.
		System.out.println(movies.peek());
		
		// Removes the head, if queue is empty throws exception
		movies.remove();
		
		// Removes the head, if queue is empty returns null;
		movies.poll();
		
		for(String movie : movies) {
			System.out.println(movie);
		}
	}
}
