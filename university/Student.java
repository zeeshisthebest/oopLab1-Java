/*
 * Project done by Muhammad Zeeshan
 */

package university;

class Student {
	private final int OFFSET = 10000;
	private final int MAX_COURSE = 25;
	private String firstName;
	private String lastName;
	private int studentID;
	private Courses[] course = new Courses[MAX_COURSE];
	
	
	int addStudent(String firstName, String lastName, int addedStudents) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = OFFSET + addedStudents;
		return studentID;
	}
	
	String getStudent() {
		return studentID + " " + firstName + " " + lastName;
	}
	
	void addCourseToStudent(Courses course) {
		int i = 0;
		while(this.course[i] != null) {
			++i;
		}
		this.course[i] = new Courses();
		this.course[i] = course;		
	}
	
	String getCoursesEnrolled() {
		String result = "";
		int i = 0;
		while(course[i] != null) {
			result += course[i].getCourse() + "\n";
			++i;
		}
		return result;
	}
}
