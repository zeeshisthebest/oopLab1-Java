/*
 * Project done by Muhammad Zeeshan
 */

import university.University;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University university = new University("Virtual University");
		university.setRector("M", "Zee");
		
		int id1 = university.enroll("Muhammad", "Zeeshan");
		int id2 = university.enroll("Zeeshan", "Muhammad");
		
		int course1 = university.activate("Object Oriented Program", "Zecho");
		int course2 = university.activate("Database", "Hello");
		
		System.out.println(university.register(id1, course1));
		System.out.println(university.register(id1, course2));
		System.out.println(university.register(id2, course1));
		
		
		System.out.println("University Name: " + university.getUniversityName());
		System.out.println("Name of the Rector: " + university.getRector());
		System.out.println(university.student(id1));
		System.out.println(university.student(id2));
		System.out.println(university.course(course1));
		System.out.println(university.course(course2));
		System.out.println(university.listAttendees(course1));
		System.out.println(university.listAttendees(course2));
		System.out.println(university.studyPlan(id1));
		System.out.println(university.studyPlan(id2));
		
	}
}
