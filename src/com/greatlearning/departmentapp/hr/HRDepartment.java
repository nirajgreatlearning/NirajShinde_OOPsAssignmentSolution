package com.greatlearning.departmentapp.hr;

import com.greatlearning.departmentapp.superdepartment.SuperDepartment;

public class HRDepartment extends SuperDepartment{
	public String departmentName() {
		return "HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActvity() {
		return "team Lunch";
	}
}
