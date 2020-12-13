package nrahul32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File f = new File("./students.txt");		
		ArrayList<Student> studentList = createObjectsFromFile(f);
		printStudents(studentList);
	}

	private static void printStudents(ArrayList<Student> studentList) {
		
		for(Student s : studentList){
			s.printDetails();
		}
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

