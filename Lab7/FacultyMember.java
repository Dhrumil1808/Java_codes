package Lab7;

import java.util.ArrayList;

public class FacultyMember extends Person {

	private int employee_id;
	private ArrayList<Course> faculty_courses;
	private ArrayList cour=new ArrayList();
	
	public FacultyMember(String name, Address address,int employee_id) {
		super(name, address);
		this.employee_id=employee_id;
		faculty_courses=new ArrayList<Course>();
		// TODO Auto-generated constructor stub
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public ArrayList<Course> getFaculty_courses() {
		return faculty_courses;
	}
	public void setFaculty_courses(ArrayList<Course> courses,int i) {
		for(int j=0;j<courses.size();j++)
		{
			if(j==i)
			{
				cour.add(0,courses.get(j));
			}
		}
		this.faculty_courses = cour;
	}
	

	public String toString()
	{
		return "Name: "+getName() + " "+ getAddress() + " "+ "Employee ID: "+ getEmployee_id() + " "+ "Faculty Courses: "+getFaculty_courses() + "\n";
	}
	
}
