package nrahul32;

import java.util.Comparator;

public class SortStudentsByTotal implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return s1.getTotal() - s2.getTotal();
	}
}
