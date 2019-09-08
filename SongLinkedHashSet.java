import java.util.*;

public class SongLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> songs = new LinkedHashSet<String>();
		songs.add("The Eminem Game");
		songs.add("Rap Game");
		songs.add("Rap Game 1");
		songs.add("Rap Game 2");
		songs.add("Rap Game 3");
		songs.add(null);

		for (String song : songs) {
			System.out.println(song);
		}
	}
}
