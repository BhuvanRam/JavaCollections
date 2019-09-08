import java.util.*;

public class SongsHashSet {

	public static void main(String[] args) {
		HashSet<String> songs = new HashSet<String>();
		songs.add("The Eminem Game");
		songs.add("Rap Game");
		songs.add("Rap Game 1");
		songs.add("Rap Game 2");
		songs.add("Rap Game 3");
		songs.add(null);
		
		for(String song: songs)
		{
			System.out.println(song);
		}
	}

}

