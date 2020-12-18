package nrahul32;

public class SortStudentsByRollNo extends StudentComparator {

	public int compare(Student s1, Student s2) {
		return s1.getRollNo() - s2.getRollNo();
	}
}
