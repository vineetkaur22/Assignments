package StudentInformationSystem;

import java.awt.*;

import javax.swing.*;

public class oldController {
	private JLabel fname, lname , gLabel;
	private JFrame frame;
	private JTextField ftextField, ltextField;
	private JRadioButton female , male ;
	private SpringLayout layout;
	private JPanel firstNamePanel, lastNamePanel, genderPanel;

	public oldController() {

		addComponent();
		setLayout();
		addConstraints();
	}
	
	public void createComponent() {
		
	}
	
	public void addComponent() {
		frame = new JFrame("Student Information System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fname = new JLabel("First Name : ");
        fname.setBounds(65, 31, 46, 14);
        lname = new JLabel("Last Name : ");
        lname.setBounds(65,31,46,14);
		gLabel = new JLabel("Gender");
		ftextField = new JTextField(20);
		ltextField = new JTextField(20);
		female = new JRadioButton("Female");
		male = new JRadioButton("male");
		
		firstNamePanel = new JPanel();
		frame.add(firstNamePanel);
		firstNamePanel.add(fname);
		firstNamePanel.add(ftextField);
		
		lastNamePanel = new JPanel();
		frame.add(lastNamePanel);
		lastNamePanel.add(lname);
		lastNamePanel.add(ltextField);
		
		genderPanel = new JPanel();
		frame.add(genderPanel);
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(female);
		genderGroup.add(male);
		genderPanel.add(gLabel);
		genderPanel.add(female);
		genderPanel.add(male);
	}

	public void setLayout() {
		
	    layout = new SpringLayout();
		//GridLayout gl = new GridLayout();
		Container c = frame.getContentPane();
		frame.setLayout(layout);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public void addConstraints() {
		layout.putConstraint(SpringLayout.WEST, fname,5, SpringLayout.WEST, firstNamePanel);
	    layout.putConstraint(SpringLayout.NORTH, fname,5, SpringLayout.NORTH, firstNamePanel);

	    layout.putConstraint(SpringLayout.WEST, ftextField ,200, SpringLayout.WEST, firstNamePanel);
	    layout.putConstraint(SpringLayout.NORTH, ftextField,5, SpringLayout.NORTH, firstNamePanel);
	      
	}
	
	public static void main(String[] args) {

		oldController student = new oldController();
	}
}

