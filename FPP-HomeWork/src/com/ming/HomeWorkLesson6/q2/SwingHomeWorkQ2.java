package com.ming.HomeWorkLesson6.q2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 7,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson6  Question 2
 *					
 */
import java.awt.event.*;
import java.lang.reflect.Field;

public class SwingHomeWorkQ2 {

	private JFrame frame = new JFrame("Rainbow colors Franme");
	
	private JPanel panel = new JPanel();
	
	
	public SwingHomeWorkQ2() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		Class cls = Color.class;
		Field[] fields = cls.getDeclaredFields();  
		for(int i=0; i<fields.length; i=i+2){  
            Field f = fields[i];  
            f.setAccessible(true);
            try {
            	//System.out.println(f.getType()+"|attributeName:" + f.getName() + "	|attributeValue:" + f.get(this));
            	if (f.getType() != java.awt.Color.class){
            		continue;
            	}
            	JButton button = new JButton("Button"+i);
            	button.setBackground((Color) f.get(this));
            	Dimension preferredSize = new Dimension(100,100);//设置尺寸
            	button.setPreferredSize(preferredSize );
            	ButtonlListener buttonListener = new ButtonlListener( f.getName());
            	button.addActionListener(buttonListener);
            	panel.add(button);
			} catch (Exception e) {
				e.printStackTrace();
			}  
		}
		frame.add(panel);
		frame.setSize(1000,300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class ButtonlListener implements ActionListener {
		private String color;
		ButtonlListener(String color){
			this.color = color;
		}
		public void actionPerformed(ActionEvent evt) {
			String msg = color + " signifies passion, vitality, enthusiasm and security";
			System.out.println("Got input: "+evt.getSource() +"|"+msg);
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, msg, "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
			//System.out.println("Got input: "+inputString);
		}


	}
	
	
	
 
	public static void main(String[] args) {
		SwingHomeWorkQ2 window = new SwingHomeWorkQ2();
		window.frame.setVisible(true);
	}

}
