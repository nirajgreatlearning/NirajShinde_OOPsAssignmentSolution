package com.greatlearning.departmentapp.main;

import com.greatlearning.departmentapp.admin.AdminDepartment;
import com.greatlearning.departmentapp.hr.HRDepartment;
import com.greatlearning.departmentapp.tech.TechDepartment;

public class DriverClass {
	public static void main(String[] args) {
		/* Admin Department */
		AdminDepartment adminDepartment = new AdminDepartment();
		
		System.out.println("Welcome To "+ adminDepartment.departmentName()); 
		System.out.println(adminDepartment.getTodaysWork()); 
		System.out.println(adminDepartment.getWorkDeadline()); 
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println("");
		
		/* HR Department */
		HRDepartment hrDepartment = new HRDepartment();
		
		System.out.println("Welcome To "+ hrDepartment.departmentName());
		System.out.println(hrDepartment.doActvity());
		System.out.println(hrDepartment.getTodaysWork()); 
		System.out.println(hrDepartment.getWorkDeadline()); 
		System.out.println(hrDepartment.isTodayAHoliday());
		
		System.out.println("");
		
		/* Tech Department */
		TechDepartment techDepartment = new TechDepartment();
		
		System.out.println("Welcome To "+ techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline()); 
		System.out.println(techDepartment.getTechStackInformation()); 
		System.out.println(techDepartment.isTodayAHoliday());
	}
}
