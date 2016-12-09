package com.ming.HomeWorkLesson7;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 8,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson7  Question 1
 *					
 */
public class HomeWorkLesson7Q1 {

	private JFrame frame = new JFrame("Metric Conversion Assistant ");
	
	private JPanel panel = new JPanel();
	
	private JPanel panelTop = new JPanel();
	
	private JTextField[] textField = new JTextField[8];
	
	private String string = "mile,Kilometer,Pound,Kilogram,Gallon,Liter,Fahrenheit,Centigrade";
	
	public HomeWorkLesson7Q1() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panelTop.setBorder(new LayoutBorder());
		panel.setLayout(null);
		//panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		String[] strings = string.split(",");
		int x =100, y= 50;
		JButton button = new JButton("Convert");
		button.setBounds(380, 200, 100, 25);
		for(int i = 0; i <strings.length/2;i++){//
			JLabel label1 = new JLabel(strings[i*2]);
			label1.setBounds(x, y+(30*i), 90, 25);
			label1.setHorizontalAlignment(SwingConstants.RIGHT);
			JTextField field1 = new JTextField(20);
			field1.setBounds(x+90, y+(30*i), 100, 25);
			/*
			field1.getDocument().addDocumentListener(
				evt1 -> {
					for (int i = 0;i<panel.getComponentCount();i++){
						Component component = panel.getComponent(i);
						System.out.println("Process Print:"+component.getClass().getSimpleName());  
					}
				},
				evt2 -> {
					for (int i = 0;i<panel.getComponentCount();i++){
						Component component = panel.getComponent(i);
						System.out.println("Process Print:"+component.getClass().getSimpleName());  
					}
				},
				evt3 -> {
					for (int i = 0;i<panel.getComponentCount();i++){
						Component component = panel.getComponent(i);
						System.out.println("Process Print:"+component.getClass().getSimpleName());  
					}
				}
			 );
			
			field1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
				@Override
				public void changedUpdate(DocumentEvent e) {//这是更改操作的处理
			      String s = field1.getText().trim();//trim()方法用于去掉你可能误输入的空格号
			      System.out.println("changedUpdate:"+s);  
			       }
				@Override
			    public void insertUpdate(DocumentEvent e) {//这是插入操作的处理
			       String s = field1.getText().trim();
			       System.out.println("insertUpdate:"+s);
			       }  
				@Override
			    public void removeUpdate(DocumentEvent e) {//这是删除操作的处理
			        String s = field1.getText().trim();
			        System.out.println("removeUpdate:"+s);
			       }
				
			}
			 );
			
			field1.addActionListener(new java.awt.event.ActionListener() {
			    public void actionPerformed(java.awt.event.ActionEvent e) {
			    	 System.out.println("actionPerformed:");
			        if (Integer.parseInt(field1.getText())<=0){
			            JOptionPane.showMessageDialog(null,
			                    "Error: Please enter number bigger than 0", "Error Message",
			                    JOptionPane.ERROR_MESSAGE);
			        }       
			    }
			});
		
			field1.getDocument().addDocumentListener( evt -> {
				System.out.println("Process Print");  
			    // Your code here
			});
			 */
			JLabel label2 = new JLabel(strings[i*2+1]);
			label2.setBounds(x+190, y+(30*i), 90, 25);
			label2.setHorizontalAlignment(SwingConstants.RIGHT);
			JTextField field2 = new JTextField(20);
			field2.setBounds(x+280, y+(30*i), 100, 25);
			textField[i*2] = field1;
			textField[i*2+1] = field2;
			panel.add(label1);
			panel.add(field1);
			panel.add(label2);
			panel.add(field2);
		}
		button.addActionListener(
				evt -> {
					int j = 0;
					JTextField[] jTextField = new JTextField[8];
					for (int i = 0;i<panel.getComponentCount();i++){
						Component component = panel.getComponent(i);
						String type = component.getClass().getSimpleName();
						if (type.equals("JTextField")){
							jTextField[j] = (JTextField)component;
							j++;
						}
						//System.out.println("Process Print:"+component.getClass().getSimpleName());  
					}
					buttonClick(jTextField);
				}
		);
		
		panel.add(button);
		panelTop.setLayout(null);
		JLabel label = new JLabel("convert is base on the first column, if you want to convert the second column,please put the first column set space");
		label.setBounds(40,0,800, 30);
		panelTop.setSize(800, 30);
		panelTop.setBackground(Color.cyan);
		panelTop.add(label);
		frame.add(panelTop);
		frame.add(panel);
		frame.setSize(800,300);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void buttonClick(JTextField[] jTextFields){
		for(int i = 1; i<=jTextFields.length ;i=i+2){
			Object[] objs = check(jTextFields[i-1],jTextFields[i]);
			//System.out.println(i+" buttonClick:"+Arrays.toString(objs)+"|"+(i/2+1));
			switch(i/2+1){
				case 1:
					//1. miles and kilometers, 
					if(objs[0].equals("first")){
						double kilometers = (double)objs[1]*1.609344;
						jTextFields[i].setText(String.valueOf(kilometers));
					}else{
						double miles = (double)objs[1]*0.6213712;
						jTextFields[i-1].setText(String.valueOf(miles));
					}
					break;
				case 2:
					//2. pounds and kilograms, 
					if(objs[0].equals("first")){
						double kilograms = (double)objs[1]*0.4535924;
						jTextFields[i].setText(String.valueOf(kilograms));
					}else{
						double pounds = (double)objs[1]*2.2046226;
						jTextFields[i-1].setText(String.valueOf(pounds));
					}
					break;	
				case 3:
					//3. gallons and liters, 
					if(objs[0].equals("first")){
						double liters = (double)objs[1]*3.7854118;
						jTextFields[i].setText(String.valueOf(liters));
					}else{
						double gallons = (double)objs[1]*0.2641721;
						jTextFields[i-1].setText(String.valueOf(gallons));
					}
					break;	
				case 4:
					//4. Fahrenheit and Centigrade 华氏度 = 32 + 摄氏度 × 1.8  , 摄氏度 = (华氏度 - 32) ÷ 1.8
					if ((double)objs[1] == 0 ){
						jTextFields[i].setText(String.valueOf(0));
						jTextFields[i-1].setText(String.valueOf(0));
						break;
					}
					if(objs[0].equals("first")){
						double Centigrade =  ((double)objs[1]-32)/1.8;
						jTextFields[i].setText(String.valueOf(Centigrade));
					}else{
						double Fahrenheit = 32 + (double)objs[1]*1.8;
						jTextFields[i-1].setText(String.valueOf(Fahrenheit));
					}
					break;
				default :
					System.out.println("default");
					break;	
			}
		}
	}
	
	public static Object[] check(JTextField first, JTextField second){
		Object[] obj = {"second",0.00};
		if (first == null){
			obj[0] = "first";
			return obj;
		}
		if (first.getText().trim().equals("")){
			return check(second,null);
		}else{
			if (second != null) obj[0] = "first";
			try{
				obj[1] = Double.parseDouble(first.getText());
			}catch(Exception e ){
				System.out.println(e.getMessage());
				obj[1] = 0.00;
			}
		}
		return obj;
		
	}
	
	/*
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
	*/
 
	public static void main(String[] args) {
		HomeWorkLesson7Q1 window = new HomeWorkLesson7Q1();
		window.frame.setVisible(true);
	}

}
