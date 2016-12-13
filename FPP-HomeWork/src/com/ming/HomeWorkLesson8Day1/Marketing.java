package com.ming.HomeWorkLesson8Day1;

import java.util.ArrayList;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Dec 12,2016
 * 
 * @description:    Solution for com.ming.HomeWorkLesson8Day1 Quesetion 2 
 *
 */
public class Marketing {
	
	private String employeename;
	
	private String productname;
	
	private int salesamount;

	public Marketing(String employeename, String productname, int salesamount) {
		super();
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(int salesamount) {
		this.salesamount = salesamount;
	}

	


}
