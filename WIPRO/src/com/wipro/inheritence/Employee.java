package com.wipro.inheritence;

public class Employee {
	double salary;
	int year;
	String NationalInsuranceNumber;
	void setName(String n){
		set(n);
	}
	private void set(String n) {
		// TODO Auto-generated method stub
		
	}
	void setAnnualSalary(double s){
		salary = s;
	}
	void setYearOfWorkStarted(int y){
		year = y;
	}
	void setNationalInsuranceNumber(String i){
		NationalInsuranceNumber = i;
	}
	void getEmployeedetails() {
		String name = null;
		System.out.println("Employee name : " + name); 
		System.out.println("Annualsalary :" + salary + "lakhs");
		System.out.println("Year of Started working :" + year);
		System.out.println("National Insurance Number : " + NationalInsuranceNumber);
		
	}
}