package Lab11;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) {

		Person[] ps = new Person[5];

		ps[0] = new Faculty("Andy", new java.util.Date(11 / 12 / 1980), 4000.0,"full time");
		
		ps[1] = new Faculty("Barry", new java.util.Date(1 / 2 / 1973), 6000.0,"part time");
		
		ps[2] = new Staff("Cathy", new java.util.Date(8 / 19 / 1968), 2000.0, 3);
		
		ps[3] = new Staff("Don", new java.util.Date(4 / 17 / 1969), 4000.0, 2);
		
		ps[4] = new Staff("Edith", new java.util.Date(10 / 28 / 1979), 5000.0, 1);

		// add code here

		 Arrays.sort(ps);
	        for(Person p:ps)
	        	System.out.println(p.toString());
	        
	        System.out.println("\nList of Staff members with their annual salary:");
	        for(Person p:ps){
	        	if(p instanceof Staff)
	        		System.out.println(p.getName()+" "+p.getSalary());
	        }
	       
	        System.out.println("\nList of Faculty members with their annual salary:");
	        for(Person p:ps){
	        	if(p instanceof Faculty)
	        		System.out.println(p.getName()+" "+p.getSalary());
	        }
	}

}
