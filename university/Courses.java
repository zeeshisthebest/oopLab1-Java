/*
 * Project done by Muhammad Zeeshan
 */

package university;

class Courses {
	private static int codeOffset = 10;
	private String courseTitle;
	private String professor;
	private int courseCode;
	private final int MAX_ATTENDEES = 100;
	private int attendee_count;
	private Student[] student = new Student[MAX_ATTENDEES];
	
	int addCourse(String title, String professor, int courseAdded){
		courseTitle = title;
		this.professor = professor;
		courseCode = courseAdded + codeOffset;
		return courseCode;
	}
	
	String getCourse() {
		return courseCode + ", " + courseTitle + ", " + professor;
	}
	
	void addAttendee(Student attendee) {
		student[attendee_count] = new Student();
		student[attendee_count++] = attendee;
	}
	
	String getAttendees() {
		int i = 0;
		String list = "";
		while (student[i] != null) {
			list += student[i].getStudent() + "\n";
			++i;
		}
		return list;
	}
}
