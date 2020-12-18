package nrahul32;

public class SortStudentsByName extends StudentComparator {

	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
