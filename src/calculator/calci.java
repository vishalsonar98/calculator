package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(51, 204, 204));
		frame.setForeground(Color.WHITE);
		frame.setBounds(100, 100, 338, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(10, 10, 302, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace =str.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		btnBackspace.setForeground(Color.BLACK);
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(10, 120, 74, 67);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 189, 74, 67);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 260, 74, 67);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 330, 74, 67);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 400, 74, 67);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("c");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(86, 120, 74, 67);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(86, 189, 74, 67);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(86, 260, 74, 67);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(86, 330, 74, 67);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setForeground(Color.BLACK);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(86, 400, 74, 67);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setForeground(Color.BLACK);
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(162, 120, 74, 67);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(162, 189, 74, 67);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(162, 260, 74, 67);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(162, 330, 74, 67);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(162, 400, 74, 67);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setForeground(Color.BLACK);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(238, 120, 74, 67);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setForeground(Color.BLACK);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(238, 189, 74, 67);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setForeground(Color.BLACK);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(238, 260, 74, 67);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setForeground(Color.BLACK);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(238, 330, 74, 67);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setForeground(Color.BLACK);
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(238, 400, 74, 67);
		frame.getContentPane().add(btnPercent);
	}
}
