import java.util.*;

public class AvengersStack {
	public static void main(String[] args)
	{
		Stack<String> avengers = new Stack<String>();
		avengers.push("Hulk");
		avengers.push("Black Panther");
		avengers.push("Captain America");
		
		System.out.println(avengers.peek());
		
	}
}
