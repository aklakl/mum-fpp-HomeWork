package com.ming.HomeWorkLesson5Day1.q1;

import java.util.Date;

/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 3,2016
 * 
 * @description:    Test for com.ming.HomeWorkLesson5Day1 Question 1
 *
 */
public class TestQuestion1 {
 
	public TestQuestion1() {
		 
	}
 
	public static int getRandom(int start,int end) {
        int number = 0;
        int seed = end*10;
        while (true) {
        	java.util.Random random=new java.util.Random();// å®šä¹‰éš�æœºç±»
        	//number = random.nextInt(7);// è¿”å›ž[0,10)é›†å�ˆä¸­çš„æ•´æ•°ï¼Œæ³¨æ„�ä¸�åŒ…æ‹¬10
            number = (int) (Math.random() * seed);
            if (number >= start && number <= end) {
                break;
            }
        }
        return number;
    }
	
	public static void main(String[] args) {
		System.out.println("==================test for class student==================");
		//test for class student 
		Student[] studentList = new Student[10]; 
		for(int i = 0 ; i<studentList.length ;i++){
			Student student = new Student();
			
			//System.out.println("=================Base Information=============================");
			student.setName("FirstName LastName"+i);
			student.setAge(TestQuestion1.getRandom(20,50));
			student.setAddress("No "+i +" xxx Street Default Address ");
			student.setSsn(String.valueOf(TestQuestion1.getRandom(111111111,933333339)));
			student.setTelephone(String.valueOf(TestQuestion1.getRandom(641000000,641999999)));
			if (i%3 == 0)
				student.setGender("Male");
			else
				student.setGender("Female");
			//System.out.println("=================Base Information=============================");
			
			
			student.setGraduation("no");
			student.setAverage(TestQuestion1.getRandom(50,100));
			student.setMajor("major"+i);
			student.setYear(String.valueOf(TestQuestion1.getRandom(1999,2016)));
			studentList[i] = student;
		}
		
		for( Student student :studentList){
			System.out.println("====================================");
			student.display();
		}
		
		
		System.out.println("==================test for class employee==================");
		//test for class employee 
		Employee[] employeeList = new Employee[10]; 
		for(int i = 0 ; i<employeeList.length ;i++){
			Employee employee = new Employee();
			
			//System.out.println("=================Base Information=============================");
			employee.setName("FirstName LastName"+i);
			employee.setAge(TestQuestion1.getRandom(20,50));
			employee.setAddress("No."+i +" xxx Street Default Address ");
			employee.setSsn(String.valueOf(TestQuestion1.getRandom(111111111,933333339)));
			employee.setTelephone(String.valueOf(TestQuestion1.getRandom(641000000,641999999)));
			if (i%2 == 0)
				employee.setGender("Male");
			else
				employee.setGender("Female");
			//System.out.println("=================Base Information=============================");
			
			
			employee.setAddition("addition"+i);
			employee.setAnnualSalary(TestQuestion1.getRandom(50000,100000));
			employee.setDepartment("department"+i);
			employee.setHireDate(new Date());
			employee.setHourlyFate(100.00/i);
			employee.setHoursWorked(i+1);
			employee.setJobTitle("jobTitle"+i);
			employee.setUnionDues(80.00/i);
			employeeList[i] = employee;
		}
		
		for( Employee employee :employeeList){
			System.out.println("====================================");
			employee.display();
		}
		
		
		
		
		
	}

}
