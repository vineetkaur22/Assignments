
class Student{
	
	private String name;
	private int id ;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}

	Student ( String name , int id ){
		this.name=name;
		this.id=id;
	}

}
class Course{
		
	private int noOfStudents=0;
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	private String title;	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	private Student[] students = new Student[10];
	
	Course(String title){
		this.title = title;
	}
	
	boolean isFull() {	
		if(noOfStudents ==10) {
			return true;
		}
		else {
			return false;
		}
	}
		
	void registerStudent (Student student) {
		if (isFull()==false) {
			students[noOfStudents]=student;
			noOfStudents++;
			System.out.println("Registration Sucessfull for " + student.getName() + " with ID: " + student.getId() + " in " + title);
		}
		else {
			System.out.println("Cannot register " +  student.getName() + " to the course");
		}
	}
}

public class Question1 {

	public static void main(String[] args) {
		
		//java is object of class Course 
		Course java  = new Course ("Java");		
		String courseTitle = java.getTitle();		
				
		// to print how many students are already registered in course1
		System.out.println("Number of Students in " + courseTitle + ": "+ java.getNoOfStudents());

		//register a student
		java.registerStudent(new Student ("Jane", 100));		
		java.registerStudent(new Student("Jerry", 200));
		java.registerStudent(new Student("Rob", 300));
		java.registerStudent(new Student("Miles", 400));
		java.registerStudent(new Student("Mike", 500));
		java.registerStudent(new Student("Harry", 600));
		java.registerStudent(new Student("Ram", 700));
		java.registerStudent(new Student("James", 800));
		java.registerStudent(new Student("Walter", 900));
		java.registerStudent(new Student("White", 1000));
		java.registerStudent(new Student("Potter", 1100));
		
		// to print how many students are already registered in course1
		System.out.println("Number of Students in " + courseTitle + ": "+ java.getNoOfStudents());

	}
}
