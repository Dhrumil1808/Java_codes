package Lab11;

import java.util.Date;

public class Staff extends Person {

	double annualSalary;
	int exp;
	
	public Staff(String fName, Date bdate , double annualSalary ,  int exp) {
		
		super(fName, bdate);
		
		this.annualSalary = annualSalary;
		
		this.exp = exp ; 
	}

	@Override
	public Double getSalary() {
	
		return annualSalary + annualSalary * (30.0 - exp) / 60.0;
	
	}

	public double getAnnualSalary() {
	
		return annualSalary;
	
	}

	public int getExperience() {
			return exp;
	
	}
	public String toString() {
	   return " " + fName + " was born on " + bdate + ":" + getExperience();
	
	}
}
