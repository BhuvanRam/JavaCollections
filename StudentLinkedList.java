import java.util.*;

public class StudentLinkedList {
	public static void main(String args[]) {
		LinkedList<String> studentList= new LinkedList<String>();
		studentList.add("Mark");
		studentList.add("Hulk");
		studentList.add("SpiderMan");
		
		/*
		Iterator<String> studentIterator = studentList.iterator();
		while(studentIterator.hasNext())
		{
			System.out.println(studentIterator.next());
		}
		*/
		
		for(int index = 0; index < studentList.size(); index++ )
		{
			System.out.println(studentList.get(index));
		}
	}
}
