import java.util.*;

public class MovieTreeSet {
	public static void main(String[] args) {
		TreeSet<String> songs = new TreeSet<String>();
		songs.add("The Eminem Game");
		songs.add("Rap Game");
		songs.add("Rap Game 1");
		songs.add("Rap Game 2");
		songs.add("Rap Game 3");

		for (String song : songs) {
			System.out.println(song);
		}
	}
}
