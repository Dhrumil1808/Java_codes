package Lab7;

public class Person {

	private String name;
	Address address;
	
	public Person(String name, Address address)
	{
		this.name=name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "Name: "+getName() + getAddress() + "\n";
	}
}
