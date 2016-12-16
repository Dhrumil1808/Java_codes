package Lab7;

public class Course {

	private String course_identifier,course_title;
	
	public Course(String identifier,String title)
	{
		this.course_identifier=identifier;
		this.course_title=title;
	}

	public String getCourse_identifier() {
		return course_identifier;
	}

	public void setCourse_identifier(String course_identifier) {
		this.course_identifier = course_identifier;
	}

	public String getCourse_title() {
		return course_title;
	}

	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	
	public String toString()
	{
		return "Identifier :"+ course_identifier + " title :"+ course_title + "\n"; 
	}
	
}
