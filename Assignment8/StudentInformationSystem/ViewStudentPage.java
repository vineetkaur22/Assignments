package StudentInformationSystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;

public class ViewStudentPage extends JFrame {

	private  JButton doneButton;
	private RegistrationController rc;
	private JTable studentsTable;
	private DefaultTableModel model ;	
	private JScrollPane sp;
	List<String> list =new ArrayList<String>();
	Object[] columnHeaders= new Object[] {"ID","FirstName","LastName","Email", "Gender"};
	Object[][] rows;

	public ViewStudentPage(RegistrationController rc) {
		this.rc = rc;
		this.setTitle("All Students");
		populateRows();
		createComponents();
		addComponents();
		addBehaviors();
		display();
	}

	private void display() {
		this.setSize(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);		
	}

	private void addComponents() 
	{       
		Container c = getContentPane();
		c.add(new JScrollPane(studentsTable), BorderLayout.CENTER);
		
		JPanel donePanel = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
		donePanel.add(doneButton);
		c.add(donePanel,BorderLayout.SOUTH);
	}

	private void addBehaviors() {
		ButtonListener bl = new ButtonListener();
		doneButton.addActionListener(bl);
	}


	private void createComponents() {
		doneButton = new JButton("Done");
		studentsTable = new JTable(model);
		//studentsTable.setBounds(25, 50, 950, 600);
	}

	private void populateRows() {
		List<Student> listOfStudents = rc.getAllStudents();
		int s = listOfStudents.size();
		rows = new Object[s][5];

		for(int i = 0; i < s ; i++) {
			Student stud = listOfStudents.get(i);
			Object[] row = new Object[5];
			row[0] = stud.getID();
			row[1] = stud.getFirstName();
			row[2] = stud.getLastName();
			row[3] = stud.getEmail();
			row[4] = stud.getGender();
			rows[i] = row;
		}
		model = new DefaultTableModel(rows,columnHeaders);
	}

	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				rc.showHomePage();
		}
	}

}


