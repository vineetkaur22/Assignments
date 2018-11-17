package StudentInformationSystem;

import java.util.ArrayList;
import java.util.List;

public class RegistrationController {
	
	public List<Student> students = new ArrayList<>();
	
	private RegistrationView registrationView;
	private HomepageView homepageView;
	private ViewStudentPage viewStudentPage;
	
	RegistrationController(){
		homepageView = new HomepageView(this);
	}
	
	public void startApplication() {
		homepageView.setVisible(true);
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public List<Student> getAllStudents(){
		return students;
	}

	public void addStudentClicked() {
		homepageView.setVisible(false);
		registrationView = new RegistrationView(this);
		registrationView.setVisible(true);
	}

	public void viewStudentClicked() {
		homepageView.setVisible(false);
		viewStudentPage = new ViewStudentPage(this);
		viewStudentPage.setVisible(true);
	}
	
	public void showHomePage() {
		if(viewStudentPage != null) {
			viewStudentPage.dispose();
		}
		if(registrationView != null) {
			registrationView.dispose();
		}		
		homepageView.setVisible(true);
	}
	
	// Start the application
	public static void main (String[] str) {
		RegistrationController rc =  new RegistrationController();
		rc.startApplication();
	}


}
