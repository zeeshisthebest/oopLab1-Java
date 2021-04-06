/*
 * Project done by Muhammad Zeeshan
 */

import university.University;

public class TestClass {

	public static void main(String[] args) {
		University university = new University("Virtual University");
		university.setRector("M", "Zee");
		
		int id1 = university.enroll("student", "one");
		int id2 = university.enroll("student", "two");
		
		int course1 = university.activate("Object Oriented Program", "prof1");
		int course2 = university.activate("Database", "prof2");
		System.out.println(course1 + " " + course2 + " "+ id1 + " " + id2);
		
		System.out.println("**********************************************************************");
		
		university.register(id1, course1);
		university.register(id1, course2);
		university.register(id2, course1);
		
		
		System.out.println("University Name: " + university.getName());
		System.out.println("Name of the Rector: " + university.getRector());
		System.out.println(university.student(id1));
		System.out.println(university.student(id2));
		System.out.println(university.course(course1));
		System.out.println(university.course(course2));
		System.out.println(university.listAttendees(course1));
		System.out.println(university.listAttendees(course2));
		System.out.println(university.studyPlan(id1));
		System.out.println(university.studyPlan(id2));
		System.out.println("**********************************************************************");
	}
}
