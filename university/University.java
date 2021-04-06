/*
 * Project done by Muhammad Zeeshan
 */
package university;

public class University {
	//adding static method was the mistake
	private final int MAX_STUDENTS = 1000;
	private final int MAX_COURSES = 50;
	private final int STUDENT_OFFSET = 10000;
	private final int COURSE_OFFSET = 10; 
	private int numberOfStudents = 0;
	private int coursesAdded = 0;
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
	public String getName() {
		return universityName;
	}
	
	public String getRector() {
		return rector;
	}

	//Methods to enroll the student
	public int enroll(String firstName, String lastName){
		student[numberOfStudents] = new Student(); //This initializes each new array item.
		//The addStudent return ID offset by 10,000, numberOfStudents is the index for array and is class attribute
		int id = student[numberOfStudents].addStudent(firstName, lastName, numberOfStudents);
		++numberOfStudents; // incremented to store next student in the next item in array.
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
	public void register(int studentID, int courseCode) {
		Student attendee = new Student();
		attendee = student[studentID - STUDENT_OFFSET];
		attendee.addCourseToStudent(courses[courseCode - COURSE_OFFSET]) ;
		courses[courseCode - COURSE_OFFSET].addAttendee(attendee);
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






