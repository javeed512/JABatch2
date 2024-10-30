package entity;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {

		Student student1 = new Student(10, "king", "Java", LocalDate.of(2001, 6, 19));

		
		System.out.println(student1.getStudentId() +" "+ student1.getStudentName()+" "+student1.getCourse() +"  "+student1.getDob());
		
		
		
		Student student2 = new Student();

		student2.setStudentId(20);
		student2.setStudentName("tom");
		student2.setCourse("SQL");

		
		System.out.println(student2.getStudentId() +" "+ student2.getStudentName()+" "+student2.getCourse() +"  "+student2.getDob());
		
		
			System.out.println(student1.toString());
			
			System.out.println(student2);  // toString() is called implicitly
			
			
			//String s1 = new String("hello");
			
			//System.out.println(s1.toString()); // String class toString() prints data
			
			
		
		
		
	}

}
