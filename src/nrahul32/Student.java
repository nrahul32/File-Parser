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
		this.setName(name);
		this.maths = maths;
		this.science = science;
		this.english = english;
		this.setTotal(maths + science + english);
	}
	
	public void printDetails(){
		System.out.println(getName() + "\t" + rollNo + "\t" + maths + "\t" + science + "\t" + english + "\t" + getTotal());
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
