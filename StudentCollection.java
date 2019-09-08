import java.util.*;

public class StudentCollection {
	public static void main(String args[]) {

		ArrayList<String> students = new ArrayList<String>();

		students.add("John");
		students.add("Ram");
		students.add("Mark");

		System.out.println(students.size());

		Iterator itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (int index = 0; index < students.size(); index++) {
			System.out.println(students.get(index));
		}

		for (String student : students) {
			System.out.println(student);
		}

	}
}
