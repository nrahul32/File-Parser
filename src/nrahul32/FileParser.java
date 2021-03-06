package nrahul32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentComparator compareBy = null;

		File f = new File("./students.txt");		
		ArrayList<Student> studentList = createObjectsFromFile(f);
		printStudents(studentList);

		OptionToSort option = getOptionFromUser();
		
		switch(option){
		case ROLLNO:
			compareBy = new SortStudentsByRollNo();
			break;
		case NAME:
			compareBy = new SortStudentsByName();
			break;			
		case TOTAL:
			compareBy = new SortStudentsByTotal();
			break;
		default:
			System.out.println("It shouldn't reach this line");
		}
		
		System.out.println("\nSorted by " + option.toString());
		Collections.sort(studentList, compareBy);
		printStudents(studentList);
	}

	private static OptionToSort getOptionFromUser() {
		
		System.out.println("How do you want to sort the students?");
		System.out.println("1 for Roll no, 2 for name and 3 for Total");
		Scanner reader = new Scanner(System.in);

		return OptionToSort.getOption(Integer.parseInt(reader.next()));
	}

	private static void printStudents(ArrayList<Student> studentList) {
		
		System.out.println("Student List");
		System.out.println("Name\tRoll no\tMaths\tScience\tEnglish\tTotal");
		for(Student s : studentList){
			s.printDetails();
		}
		System.out.println("");
	}

	private static ArrayList<Student> createObjectsFromFile(File f) {
		
		int rollNo;
		int maths;
		int science;
		int english;
		String name;
		ArrayList<Student> studentList = new ArrayList<Student>();

		try {
			Scanner reader = new Scanner(f);
			
			// First line has the column names
			String header = reader.nextLine();
			
			while(reader.hasNextLine()){
				String line = reader.nextLine();
				String[] list = line.split(", ");
				if(list.length == 5){
					rollNo = Integer.parseInt(list[0]);
					name = list[1];
					maths = Integer.parseInt(list[2]);
					science = Integer.parseInt(list[3]);
					english = Integer.parseInt(list[4]);
					Student s = new Student(rollNo, name, maths, science, english);
					studentList.add(s);
				}		
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentList;
	}
}

