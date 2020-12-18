package nrahul32;

import java.util.Comparator;

public class SortStudentsByRollNo implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return s1.getRollNo() - s2.getRollNo();
	}
}

