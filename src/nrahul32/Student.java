package nrahul32;

public class Student {
	private int rollNo;
	private int maths;
	private int science;
	private int english;
	private int total;
	private String name;

	public Student(int rollNo, String name, int maths, int science, int english){
		this.rollNo = rollNo;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
		this.total = maths + science + english;
	}
	
	public void printDetails(){
		System.out.println("Name: " + name);
		System.out.println("rollNo: " + rollNo);
		System.out.println("maths: " + maths);
		System.out.println("science: " + science);
		System.out.println("english: " + english);
		System.out.println("total: " + total);
	}
}
