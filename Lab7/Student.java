package Lab7;

import java.util.ArrayList;

public class Student extends Person{

	private int CIN;
	private ArrayList<Course> student_courses;
	private ArrayList cour=new ArrayList();
	
	public Student(String name, Address address,int CIN) {
		super(name, address);
		this.CIN=CIN;
		student_courses=new ArrayList<Course>();
		// TODO Auto-generated constructor stub
	}
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
		CIN = cIN;
	}
	public ArrayList<Course> getCourses() {
		
		return student_courses;
	}
	
	
	public void setCourses(ArrayList<Course> courses,int i) {
		for(int j=0;j<courses.size();j++)
		{
			if(j==i)
			{
				cour.add(0,courses.get(j));
			}
		}
		this.student_courses = cour;
	}
	
	public String toString()
	{
		return  "Name: "+getName() + " "+ getAddress() + " "+ "CIN: "+ getCIN() + " "+ "Courses " + getCourses() + "\n";
	}
	
	

	
}
