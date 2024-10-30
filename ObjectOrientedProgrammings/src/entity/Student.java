package entity;

import java.time.LocalDate;

public class Student extends Object {

	// Data hiding using private access modifier
	private int studentId;
	private String studentName;  
	private String course;
	private LocalDate dob = LocalDate.now();

	public Student() {
		super(); // Object();

	}

	public Student(int studentId, String studentName, String course, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.dob = dob;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", dob="
				+ dob + "]";
	}

	
	
	
	
}
