package nrahul32;

public class SortStudentsByTotal extends StudentComparator {

	public int compare(Student s1, Student s2) {
		return s1.getTotal() - s2.getTotal();
	}
}
