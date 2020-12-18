package nrahul32;

public class Student {
	private int rollNo;
	private int maths;
	private int science;
	private int english;
	private int total;
	private String name;

	public Student(int rollNo, String name, int maths, int science, int english){
		this.setRollNo(rollNo);
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
		this.total = maths + science + english;
	}
	
	public void printDetails(){
		System.out.println(name + "\t" + rollNo + "\t" + maths + "\t" + science + "\t" + english + "\t" + total);
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
