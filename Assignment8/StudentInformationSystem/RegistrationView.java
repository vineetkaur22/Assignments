package StudentInformationSystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class RegistrationView  extends JFrame{
	private JLabel fname, lname , gLabel, emailLabel, IDLabel;
	private JFrame frame;
	private JTextField ftextField, ltextField, emailTextField,IDTextField;
	private JRadioButton female , male ;
	private SpringLayout layout;
	private JPanel firstNamePanel, lastNamePanel, genderPanel,emailPanel,IDPanel;
	private RegistrationController rc;
	private JButton submit, cancel;
	private ButtonGroup genderGroup;

	public RegistrationView(RegistrationController rc) {
		this.rc = rc;
		this.setTitle("Add Student");
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}

	private void display() {
		setSize(500,500);
		setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void showDialog(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	private void addBehaviors() {
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ftextField.getText().isEmpty() || ltextField.getText().isEmpty()) {
					// Error dialog
					return;
				}
				if(e.getSource()== submit) {
				Student s = new Student(IDTextField.getText(), ftextField.getText(), ltextField.getText(), genderGroup.getSelection().getActionCommand(), emailTextField.getText());
				rc.addStudent(s);
				//show success dialog box
				showDialog("Student Added successfully: " + ftextField.getText() + ", " + ltextField.getText() );
				
				rc.showHomePage();
				}
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rc.showHomePage();
			}
		});

	}

	private void addComponents() {
		Container c = getContentPane();		
		firstNamePanel = new JPanel();
		firstNamePanel.add(fname);
		firstNamePanel.add(ftextField);
		c.add(firstNamePanel);

		
		lastNamePanel = new JPanel();
		lastNamePanel.add(lname);
		lastNamePanel.add(ltextField);
		c.add(lastNamePanel);

		
		emailPanel = new JPanel();
		emailPanel.add(emailLabel);
		emailPanel.add(emailTextField);
		c.add(emailPanel);
		
		IDPanel = new JPanel();
		IDPanel.add(IDLabel);
		IDPanel.add(IDTextField);
		c.add(IDPanel);
		
		genderPanel = new JPanel();
		genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		genderPanel.add(gLabel);
		genderPanel.add(female);
		genderPanel.add(male);
		c.add(genderPanel);
		
		JPanel submitPanel = new JPanel();
		submitPanel.add(submit);
		submitPanel.add(cancel);
		c.add(submitPanel);
		FlowLayout fl = new FlowLayout();
		submitPanel.setLayout(fl);

	}

	private void setLayout() {
		GridLayout gl = new GridLayout(6,1,1,1);
		Container c = this.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));		
	}

	private void createComponents() {
		fname = new JLabel("First Name : ");
        lname = new JLabel("Last Name : " );
		emailLabel = new JLabel("Email : ");
		gLabel = new JLabel("Gender");
		IDLabel = new JLabel("ID ");
		IDTextField = new JTextField(20);
		ftextField = new JTextField(20);
		ltextField = new JTextField(20);
		emailTextField = new JTextField(30);
		female = new JRadioButton("Female");
		female.setActionCommand("Female");
		male = new JRadioButton("Male");
		male.setActionCommand("Male");
		male.setSelected(true);
		submit = new JButton("Submit");
		cancel = new JButton("Cancel");
	}
	
}
