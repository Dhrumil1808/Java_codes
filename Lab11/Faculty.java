package Lab11;

import java.util.Date;

public class Faculty extends Person {
	private double monthlySalary;
	
	private String Status;

	public Faculty(String firstName, Date birthdate, double monthlySalaryIn,String Status) {
		
		super(firstName, birthdate);
		monthlySalary = monthlySalaryIn;
		this.Status=Status;
	}

	@Override
	public Double getSalary() {
		
		return monthlySalary * 9.0;
	}

	public String getStatus() {
		
		return Status;
	
	}

	public String toString() {
	
		return " " + fName + " was born on " + bdate + ":" + "fulltime";
	
	}
}

