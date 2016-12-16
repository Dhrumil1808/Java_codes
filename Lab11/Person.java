package Lab11;

public abstract class Person implements Comparable<Person> {
	protected String fName;
	
	protected java.util.Date bdate;

	public Person(String fName, java.util.Date bdate) {
	
		this.fName = fName;
		
		this.bdate = bdate;
	}

	public java.util.Date getBirthdate() {
	
		return bdate;
	
	}

	public String getName() {
	
		return fName;
	
	}

	public String toString() {
		
		return getName() + " was born on " + bdate;
	
	}

	public abstract Double getSalary();

	public int compareTo(Person person) {
		// complete this method
		if (getSalary() < person.getSalary())
	
			return 1;

		if (getSalary() > person.getSalary())
			
			return -1;
		
		else
			
			return 0;
	}

}