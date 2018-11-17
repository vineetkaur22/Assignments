package StudentInformationSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HomepageView extends JFrame{
	private JButton addStudentButton;
	private JButton viewStudentsButton;
	private JPanel addStudentPanel, viewStudentsPanel;
	private RegistrationController rc;

	public HomepageView(RegistrationController rc) {
		this.rc = rc;
		this.setTitle("Student Information System");
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}

	private void display() {
		setSize(400, 400);
		setVisible(true);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void addBehaviors() {
		ButtonListener abl = new ButtonListener();
		addStudentButton.addActionListener(abl);
		viewStudentsButton.addActionListener(abl);
	}

	private void addComponents() {
		Container container = getContentPane();
		addStudentPanel = new JPanel();
		addStudentPanel.add(addStudentButton);
		container.add(addStudentPanel);

		viewStudentsPanel = new JPanel();
		viewStudentsPanel.add(viewStudentsButton);
		container.add(viewStudentsPanel);

	}

	private void setLayout() {
		GridLayout gl = new GridLayout(3,3);
		Container container = this.getContentPane();
		container.setLayout(gl);

	}

	private void createComponents() {
		addStudentButton = new JButton("Add Student");
		viewStudentsButton = new JButton("View Students");

	}

	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == addStudentButton) {
				rc.addStudentClicked();
			}
			else if (e.getSource() == viewStudentsButton) {
				rc.viewStudentClicked();
			}
		}

	}
}


