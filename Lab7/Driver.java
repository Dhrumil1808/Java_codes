package Lab7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Driver {

	public static ArrayList<Course> course=new ArrayList<Course>();
	public static ArrayList<Student> student=new ArrayList<Student>();
	public static ArrayList<FacultyMember> faculty=new ArrayList<FacultyMember>();
	
	public static void  main(String[] args)
	{
		course.add(new Course("CS-12","Intro to Algorithms"));
		course.add(new Course("EE-15","Intro to Electronics"));
		course.add(new Course("CS-16","Intro to Networking"));
		maintain();
	}
	public static void maintain()
	{
		String[] options={"Add a Student","List students","Delete student","Add a Course","List courses","Add a Faculty Member","List faculties","Delete Faculty Member","Quit"};
		int choice;
		do
		{
			choice=JOptionPane.showOptionDialog(null, "Main Menu","Main Menu", 0, JOptionPane.QUESTION_MESSAGE,null, options, null);
			switch(choice)
			{
			case 0:
				addstudent();
				break;
			case 1:
				liststudents();
				break;
			case 2:
				deletestudent();
				break;
			case 3:
				addcourse();
				break;
			case 4: 
				listcourses();
				break;
			case 5: 
				addfacultymember();
				break;
			case 6: 
				listfacultymembers();
				break;
			case 7:
				deletefacultymember();
				break;
			case 8:
				break;
			}
		}while(choice!=8);
	}
	
	public static void addstudent()
	{
		String stringcin=JOptionPane.showInputDialog("Enter the CIN");
		while(stringcin.trim().length()==0)
		{
			stringcin=JOptionPane.showInputDialog("Enter the CIN");
		}
		 int cin=Integer.parseInt(stringcin);

		 String name=JOptionPane.showInputDialog("Enter the Name");
		 while(name.trim().length()==0)
		{
			name=JOptionPane.showInputDialog("Enter the Street Number");
		}
		 
		 String stringnumber=JOptionPane.showInputDialog("Enter the Street number");
		while(stringnumber.trim().length()==0)
		{
			stringnumber=JOptionPane.showInputDialog("Enter the Street Number");
		}
		 int street_number=Integer.parseInt(stringnumber);		
			
		 String streetname=JOptionPane.showInputDialog("Enter the Street Name");
		 while(streetname.trim().length()==0)
		 {
			 streetname=JOptionPane.showInputDialog("Enter the Street Name");
		 }
		 
		 String city=JOptionPane.showInputDialog("Enter the City");
		 while(city.trim().length()==0)
		 {
			 city=JOptionPane.showInputDialog("Enter the City");
		 }
		 
		 String state=JOptionPane.showInputDialog("Enter the State");
		 while(state.trim().length()==0)
		 {
			 state=JOptionPane.showInputDialog("Enter the State");
		 }
	
		 String country=JOptionPane.showInputDialog("Enter the Country");
		 while(country.trim().length()==0)
		 {
			 country=JOptionPane.showInputDialog("Enter the Country");
		 }
		 student.add(new Student(name,new Address(street_number,streetname,city,state,country),cin));
		 String[] addcourses={"add courses"};
			
		 int courses;
	 courses=JOptionPane.showOptionDialog(null, course.toString(),"Add or drop Courses", 0, JOptionPane.QUESTION_MESSAGE,null, addcourses, null);
	 boolean val=true;
	 switch(courses)
		{
		case 0:
			while(val)
			{
			String identifier=JOptionPane.showInputDialog("Enter the course to be added");
			while(identifier.trim().length()==0)
			{
				 identifier=JOptionPane.showInputDialog("Enter the course to be added");
			} 
			//int course_identifier=Integer.parseInt(identifier);
			
			int l=0;
			for(int i=0;i<course.size();i++)
			{
				if(course.get(i).getCourse_identifier().equalsIgnoreCase(identifier))
				{
					l++;
					student.get(student.size()-1).setCourses(course,i);
				}
			}
			
			if(l==0)
			{
				JOptionPane.showMessageDialog(null,"No such course");
				
			}
			else
			{
				val=false;
			}
			}
			break;
			
		
		}
		 
		 
	}
	public static void liststudents()
	{
		JOptionPane.showMessageDialog(null, student.toString());
		if(student.size()>0)
		{
		String[] addcourses={"add courses","drop courses","back"};
		int courses;
		courses=JOptionPane.showOptionDialog(null, " Courses for students","Add or drop Courses", 0, JOptionPane.QUESTION_MESSAGE,null, addcourses, null);
		switch(courses)
		{
		case 0:
			String studentid=JOptionPane.showInputDialog("Enter the CIN for adding courses");
			while(studentid.trim().length()==0)
			{
				 studentid=JOptionPane.showInputDialog("Enter the CIN for adding courses");
			} 
			int sid=Integer.parseInt(studentid);
			int k=0,j=0;
			for(int i=0;i<student.size();i++)
			{
				if(student.get(i).getCIN()==sid)
				{
					k++;
					break;
				}
				j++;
			}
			if(k==0)
			{
				JOptionPane.showMessageDialog(null,"No student with this CIN");
			}
			else
			{
			String identifier=JOptionPane.showInputDialog("Enter the course to be added");
			while(identifier.trim().length()==0)
			{
				 identifier=JOptionPane.showInputDialog("Enter the course to be added");
			} 
			//int course_identifier=Integer.parseInt(identifier);
			
			int l=0;
			for(int i=0;i<course.size();i++)
			{
				if(course.get(i).getCourse_identifier().equalsIgnoreCase(identifier))
				{
					l++;
					int r=0;
					for(int q=0;q<student.get(j).getCourses().size();q++)
					{
					if(student.get(j).getCourses().get(q).getCourse_identifier().equalsIgnoreCase(identifier))
					{
						r++;
						JOptionPane.showMessageDialog(null, "Course is already added");
					}
					}
					if(r==0)
					{
					student.get(j).setCourses(course,i);
					}
					break;
				}
			}
			
			if(l==0)
			{
				JOptionPane.showMessageDialog(null,"No such course");
			}
			
			}
			break;
		case 1:
			String dropid=JOptionPane.showInputDialog("Enter the CIN for droping courses");
			while(dropid.trim().length()==0)
			{
				 dropid=JOptionPane.showInputDialog("Enter the CIN for droping courses");
			} 
			int drop=Integer.parseInt(dropid);
			for(int i=0;i<student.size();i++)
			{
				if(student.get(i).getCIN()==drop)
				{
					String coursess=JOptionPane.showInputDialog("Enter the course identifier");
					while(coursess.trim().length()==0)
					{
						 coursess=JOptionPane.showInputDialog("Enter the course identifier");
					} 
					for(int k1=0;k1<student.get(i).getCourses().size();k1++)
					{
						if(student.get(i).getCourses().get(k1).getCourse_identifier().equalsIgnoreCase(coursess))
						{
							student.get(i).getCourses().remove(k1);
						}
					}
				}
			}
			break;
		case 2:
			break;
			
		}
		}
	}
	public static void deletestudent()
	{
		String deletecin=JOptionPane.showInputDialog("Enter the CIN to be deleted");
		while(deletecin.trim().length()==0)
		{
			 deletecin=JOptionPane.showInputDialog("Enter the CIN to be deleted");
		}
		
		int cin=Integer.parseInt(deletecin);
		
		for(int i=0;i<student.size();i++)
		{
			if(cin==student.get(i).getCIN())
			{
				student.remove(i);
			}
		}
	}
	public static void addcourse()
	{
		String identifier=JOptionPane.showInputDialog("Enter the course identifier");
		while(identifier.trim().length()==0)
		{
			identifier=JOptionPane.showInputDialog("Enter the course identifier");
		}
		String title=JOptionPane.showInputDialog("Enter the course title");
		while(title.trim().length()==0)
		{
			title=JOptionPane.showInputDialog("Enter the course title");
		}
		course.add(new Course(identifier,title));
		
	}
	public static void listcourses()
	{
		JOptionPane.showMessageDialog(null, course.toString());
	}
	public static void addfacultymember()
	{
		String stringemployee=JOptionPane.showInputDialog("Enter the employee ID");
		while(stringemployee.trim().length()==0)
		{
			stringemployee=JOptionPane.showInputDialog("Enter the employe ID");
		}
		 int employee=Integer.parseInt(stringemployee);

		 String name=JOptionPane.showInputDialog("Enter the Name");
		 while(name.trim().length()==0)
		{
			name=JOptionPane.showInputDialog("Enter the Street Number");
		}
		 
		 String stringnumber=JOptionPane.showInputDialog("Enter the Street number");
		while(stringnumber.trim().length()==0)
		{
			stringnumber=JOptionPane.showInputDialog("Enter the Street Number");
		}
		 int street_number=Integer.parseInt(stringnumber);		
			
		 String streetname=JOptionPane.showInputDialog("Enter the Street Name");
		 while(streetname.trim().length()==0)
		    {
			 streetname=JOptionPane.showInputDialog("Enter the Street Name");
		 }
		 
		 String city=JOptionPane.showInputDialog("Enter the City");
		 while(city.trim().length()==0)
		 {
			 city=JOptionPane.showInputDialog("Enter the City");
		 }
		 
		 String state=JOptionPane.showInputDialog("Enter the State");
		 while(state.trim().length()==0)
		 {
			 state=JOptionPane.showInputDialog("Enter the State");
		 }
	
		 String country=JOptionPane.showInputDialog("Enter the Country");
		 while(country.trim().length()==0)
		 {
			 country=JOptionPane.showInputDialog("Enter the Country");
		 }
		 
		 faculty.add(new FacultyMember(name,new Address(street_number,streetname,city,state,country),employee));
		 String[] addcourses={"add courses"};
			
		 int courses;
	 courses=JOptionPane.showOptionDialog(null, course.toString(),"Add or drop Courses", 0, JOptionPane.QUESTION_MESSAGE,null, addcourses, null);
	 boolean val=true;
	 switch(courses)
		{
		case 0:
			while(val)
			{
			String identifier=JOptionPane.showInputDialog("Enter the course to be added");
			while(identifier.trim().length()==0)
			{
				 identifier=JOptionPane.showInputDialog("Enter the course to be added");
			} 
			//int course_identifier=Integer.parseInt(identifier);
			
			int l=0;
			for(int i=0;i<course.size();i++)
			{
				if(course.get(i).getCourse_identifier().equalsIgnoreCase(identifier))
				{
					l++;
					faculty.get(faculty.size()-1).setFaculty_courses(course,i);
				
				}
			}
			
			if(l==0)
			{
				JOptionPane.showMessageDialog(null,"No such course");
				
			}
			else
			{
				val=false;
			}
			}
			break;
			
		
		}
		 		
	}
	public static void listfacultymembers()
	{
		JOptionPane.showMessageDialog(null, faculty.toString());
		if(faculty.size()>0)
		{
		String[] addcourses={"add courses","Drop Courses","back"};
		int courses;
		courses=JOptionPane.showOptionDialog(null, "Add Courses for faculties","Add Courses", 0, JOptionPane.QUESTION_MESSAGE,null, addcourses, null);
		switch(courses)
		{
		case 0:
			String facultyid=JOptionPane.showInputDialog("Enter the employee id for adding courses");
			while(facultyid.trim().length()==0)
			{
				 facultyid=JOptionPane.showInputDialog("Enter the employee id for adding courses");
			} 
			int fid=Integer.parseInt(facultyid);
			int k=0,j=0;
			for(int i=0;i<faculty.size();i++)
			{
				
				if(faculty.get(i).getEmployee_id()==fid)
				{
					k++;
					break;
				}
				j++;
			}
			
			if(k==0)
			{
				JOptionPane.showMessageDialog(null,"No faculty with this EmployeeID");
			}
		
			else
			{
			String identifier=JOptionPane.showInputDialog("Enter the course to be added");
			while(identifier.trim().length()==0)
			{
				 identifier=JOptionPane.showInputDialog("Enter the course to be added");
			} 
			//int course_identifier=Integer.parseInt(identifier);
			
			int l=0;
			for(int i=0;i<course.size();i++)
			{
				if(course.get(i).getCourse_identifier().equalsIgnoreCase(identifier))
				{
					l++;
					int r=0;
					for(int q=0;q<faculty.get(j).getFaculty_courses().size();q++)
					{
					if(faculty.get(j).getFaculty_courses().get(q).getCourse_identifier().equalsIgnoreCase(identifier))
					{
						r++;
						JOptionPane.showMessageDialog(null, "Course is already added");
					}
					}
					if(r==0)
					{
						faculty.get(j).setFaculty_courses(course,i);
					}
					break;
				}
			}
			
			if(l==0)
			{
				JOptionPane.showMessageDialog(null,"No such course");
			}
			
			}
			break;
		case 1:
			String dropid=JOptionPane.showInputDialog("Enter the EmployeeID for droping courses");
			while(dropid.trim().length()==0)
			{
				 dropid=JOptionPane.showInputDialog("Enter the EmployeeID for droping courses");
			} 
			int drop=Integer.parseInt(dropid);
			for(int i=0;i<faculty.size();i++)
			{
				if(faculty.get(i).getEmployee_id()==drop)
				{
					String coursess=JOptionPane.showInputDialog("Enter the course identifier");
					while(coursess.trim().length()==0)
					{
						 coursess=JOptionPane.showInputDialog("Enter the course identifier");
					} 
					for(int k1=0;k1<faculty.get(i).getFaculty_courses().size();k1++)
					{
						if(faculty.get(i).getFaculty_courses().get(k1).getCourse_identifier().equalsIgnoreCase(coursess))
						{
							faculty.get(i).getFaculty_courses().remove(k1);
						}
					}
				}
			}
			break;
		case 2:
			break;
			
		}
		}
	}
	public static void deletefacultymember()
	{
		String deleteemployee=JOptionPane.showInputDialog("Enter the employee ID to be deleted");
		if(deleteemployee.trim().length()==0)
		{
			deleteemployee=JOptionPane.showInputDialog("Enter the employee ID to be deleted");
		}
		int employeeid=Integer.parseInt(deleteemployee);
		for(int i=0;i<faculty.size();i++)
		{
			if(employeeid==faculty.get(i).getEmployee_id())
			{
				faculty.remove(i);
			}
		}
	}
}
