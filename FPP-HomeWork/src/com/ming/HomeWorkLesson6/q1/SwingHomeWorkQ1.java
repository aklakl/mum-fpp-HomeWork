package com.ming.HomeWorkLesson6.q1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.ming.HomeWorkLesson4.Palindrome;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 7,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson6  Question 1
 *					
 */
import java.awt.event.*;

public class SwingHomeWorkQ1 {

	private JFrame frame = new JFrame("String Utility");
	
	private JPanel panel = new JPanel();
	
	private JLabel labelInput = new JLabel("Input");
	private JLabel labelOutput = new JLabel("Output");
	
	private JTextField fieldInput = new JTextField(20);
	private JTextField fieldOutput = new JTextField(20);
	
	private JButton button1 = new JButton("Count Letter");
	private JButton button2 = new JButton("Reverse Letter");
	private JButton button3 = new JButton("Remove Duplicates");
	
	
	public SwingHomeWorkQ1() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		labelInput.setBounds(250, 30, 100, 25);
		fieldInput.setBounds(250, 55, 200, 25);
		labelOutput.setBounds(250, 75, 100, 25);
		fieldOutput.setBounds(250, 100, 200, 25);
		
		button1.setBounds(50, 30, 180, 25);
		button2.setBounds(50, 70, 180, 25);
		button3.setBounds(50, 110, 180, 25);
		Button1Listener b1l = new Button1Listener();
		button1.addActionListener(b1l);
		Button2Listener b2l = new Button2Listener();
		button2.addActionListener(b2l);
		Button3Listener b3l = new Button3Listener();
		button3.addActionListener(b3l);
		
		panel.add(labelInput);
		panel.add(labelOutput);
		panel.add(fieldInput);
		panel.add(fieldOutput);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.setSize(600,200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class Button1Listener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String inputString = fieldInput.getText();
			fieldOutput.setText(String.valueOf(inputString.length()));
			//System.out.println("Got input: "+inputString);
		}
	}
	
	class Button2Listener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String inputString = fieldInput.getText();
			fieldOutput.setText(Palindrome.reverseString(inputString));
			//System.out.println("Got input: "+inputString);
		}
	}
	
	class Button3Listener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String inputString = fieldInput.getText();
			fieldOutput.setText(SwingHomeWorkQ1.removeDuplicates(inputString));
			//System.out.println("Got input: "+inputString);
		}
	}
	
	
	public static String removeDuplicates(String string){
		StringBuilder sb = new StringBuilder();
		char[] args = string.toCharArray();
		for (int i = 0 ;i<args.length;i++){
			for (int j = i+1; j < args.length; j++) {
				if (args[i] == args[j]){
					args[j]=(Character) ' ';
				}
			}
		}
		for (int i = 0; i < args.length; i++) {
			if (!(args[i] == ' ')){
				sb.append(String.valueOf(args[i]));
			}
		}
		//System.out.println(sb.toString());
		return sb.toString();
	}

	public static void main(String[] args) {
		SwingHomeWorkQ1 window = new SwingHomeWorkQ1();
		window.frame.setVisible(true);
	}

}
