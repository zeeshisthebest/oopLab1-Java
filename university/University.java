/*
 * Project done by Muhammad Zeeshan
 */
package university;

public class University {
	private static final int MAX_STUDENTS = 1000;
	private static final int MAX_COURSES = 50;
	private static final int STUDENT_OFFSET = 10000;
	private static final int COURSE_OFFSET = 10; 
	private static int numberOfStudents = 0;
	private static int coursesAdded = 0;
	private String universityName;
	private String rector;
	private Student[] student = new Student[MAX_STUDENTS]; 
	private Courses[] courses = new Courses[MAX_COURSES];
	
	public University(String universityName){
		this.universityName = universityName;
	}
	
	//Setters
	public void setRector(String firstName, String lastName) {
		rector = firstName + " " + lastName;
	}
	
	//Getters
	public String getUniversityName() {
		return universityName;
	}
	
	public String getRector() {
		return rector;
	}

	//Methods to enroll the student
	public int enroll(String firstName, String lastName){
		student[numberOfStudents] = new Student();
		int id = student[numberOfStudents].addStudent(firstName,
				lastName, numberOfStudents);
		numberOfStudents++;
		return id; 	
	}
	
	//Method to fetch the student
	public String student(int id){
		return student[id - STUDENT_OFFSET].getStudent();		 
	}
	
	//Adding a new course
	public int activate(String title, String professor) {
		courses[coursesAdded] = new Courses();
		int courseCode = courses[coursesAdded].addCourse(title, professor, coursesAdded);
		coursesAdded++;
		return courseCode;
	}
	
	//Getting the course details
	public String course(int code) {
		return courses[code - COURSE_OFFSET].getCourse();
	}
	
	//Adding a attendee to the course
	public String register(int studentID, int courseCode) {
		Student attendee = new Student();
		attendee = student[studentID - STUDENT_OFFSET];
		attendee.addCourseToStudent(courses[courseCode - COURSE_OFFSET]);
		String result = courses[courseCode - COURSE_OFFSET].addAttendee(attendee);
		return result;
	}
	
	public String listAttendees(int courseCode) {
		courseCode -= COURSE_OFFSET;
		String result = courses[courseCode].getAttendees();
		return result;
	}
	
	public String studyPlan(int studentID) {
		studentID -= STUDENT_OFFSET;
		String result = student[studentID].getCoursesEnrolled();
		return result;
	}
	
}






