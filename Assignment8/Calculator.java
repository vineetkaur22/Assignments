import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operation {
	ADD, SUBTRACT, MULTIPLY, DIVIDE,CLEAR
}
public class Calculator extends JFrame {
	private JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute,clear;
	private JButton numberButtons[];
	private Font font;
	float first = 0;
	float second = 0;
	Operation o = null;

	private void reset() {
		o = null;
		first = second = 0;
	}
	private void clearData() {
		resultTextField.setText(" ");
		reset();
	}

	private void compute() {
		if (o == null) {
			return;
		}
		float result = 0;

		if (o == Operation.ADD) {
			result = first + second;
		}
		if (o == Operation.SUBTRACT) {
			result = first - second;
		}
		if (o == Operation.DIVIDE) {
			if(second == 0) {
				result = 0;
			}
			else{
				result = first * 1f / second;
			}
		}
		if (o == Operation.MULTIPLY) {
			result = first * second;
		}

		resultTextField.setText(result + "");
	}

	
	class OperationListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == clear) {
				resultTextField.setText("");
				reset();
				return;
			}
			
			if(o != null) {
				compute();
				reset();
				first = Float.parseFloat(resultTextField.getText());
				second = 0;
			}
			if (e.getSource() == add) {
				o = Operation.ADD;
			}
			if (e.getSource() == subtract) {
				o = Operation.SUBTRACT;
			}
			if (e.getSource() == multiply) {
				o = Operation.MULTIPLY;
			}
			if (e.getSource() == divide) {
				o = Operation.DIVIDE;
			}
		}
	}

	class ComputeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			compute();
			reset();
		}
	}

	class NumberListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == numberButtons[0]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 0;
				}
				//setting second number
				else{
					second = second + 0;
				}
			}
			else if(e.getSource() == numberButtons[1]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 1;
					resultTextField.setText(String.valueOf(first));
				}
				//setting second number
				else{
					second = second + 1;
					resultTextField.setText(String.valueOf(second));
				}			
			}
			else if(e.getSource() == numberButtons[2]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 2;
					resultTextField.setText(String.valueOf(first));
				}
				//setting second number
				else{
					second = second + 2;
					resultTextField.setText(String.valueOf(second));
				}

			}
			else if(e.getSource() == numberButtons[3]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 3;
					resultTextField.setText(String.valueOf(first));
				}
				//setting second number
				else{
					second = second + 3;
					resultTextField.setText(String.valueOf(second));
				}

			}
			else if(e.getSource() == numberButtons[4]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 4;
					resultTextField.setText(String.valueOf(first));
				}
				//setting second number
				else{
					second = second + 4;
					resultTextField.setText(String.valueOf(second));
				}

			}
			else if(e.getSource() == numberButtons[5]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 5;
					resultTextField.setText(String.valueOf(first));
				}
				//setting second number
				else{
					second = second + 5;
					resultTextField.setText(String.valueOf(second));
				}

			}
			else if(e.getSource() == numberButtons[6]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 6;
					resultTextField.setText(String.valueOf(first));
				}
				//setting second number
				else{
					second = second + 6;
					resultTextField.setText(String.valueOf(second));
				}
			}
			else if(e.getSource() == numberButtons[7]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 7;
					resultTextField.setText(String.valueOf(first));				
				}
				//setting second number
				else{
					second = second + 7;
					resultTextField.setText(String.valueOf(second));
				}
			}
			else if(e.getSource() == numberButtons[8]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 8;
					resultTextField.setText(String.valueOf(first));				
				}
				//setting second number
				else{
					second = second + 8;
					resultTextField.setText(String.valueOf(second));
				}
			}
			else if(e.getSource() == numberButtons[9]) {
				// setting first number
				if(o == null) {
					first = first * 10 + 9;
					resultTextField.setText(String.valueOf(first));
				}
				//setting second number
				else{
					second = second + 9;
					resultTextField.setText(String.valueOf(second));
				}
			}
		}
	}

	public Calculator() {
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}
	private void addBehaviors() {
		ComputeListener cl = new ComputeListener();
		compute.addActionListener(cl);
		OperationListener ol = new OperationListener();
		add.addActionListener(ol);
		subtract.addActionListener(ol);
		multiply.addActionListener(ol);
		divide.addActionListener(ol);
		clear.addActionListener(ol);

		for(int i=0; i < numberButtons.length ; i++) {
			NumberListener nl = new NumberListener();
			numberButtons[i].addActionListener(nl);
		}
	}
	private void display() {
		setSize(600, 600);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void addComponents() {
		Container c = getContentPane();
		c.add(resultTextField);
		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		c.add(panel);
		panel = new JPanel();
		panel.add(compute);
		panel.add(clear);
		c.add(panel);
		JPanel p = new JPanel();
		p.add(numberButtons[1]);
		p.add(numberButtons[2]);
		p.add(numberButtons[3]);
		p.add(numberButtons[4]);
		c.add(p);
		p = new JPanel();
		p.add(numberButtons[5]);
		p.add(numberButtons[6]);
		p.add(numberButtons[7]);
		p.add(numberButtons[8]);
		c.add(p);
		p = new JPanel();
		p.add(numberButtons[9]);
		p.add(numberButtons[0]);
		c.add(p);
	}
	private void setLayout() {
		GridLayout gl = new GridLayout(6, 1);
		Container c = this.getContentPane();
		c.setLayout(gl);
	}
	private void createComponents() {
		font = new Font("TimesRoman", Font.PLAIN, 36);
		resultTextField = new JTextField(10);
		resultTextField.setFont(font);
		add = new JButton("+");
		add.setFont(font);
		subtract = new JButton("-");
		subtract.setFont(font);
		multiply = new JButton("x");
		multiply.setFont(font);
		divide = new JButton("%");
		divide.setFont(font);
		compute = new JButton("=");
		compute.setFont(font);
		clear = new JButton("Clear");
		clear.setFont(font);
		numberButtons = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(i + "");
			numberButtons[i].setFont(font);
		}
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
}
