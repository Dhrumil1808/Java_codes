package lec12;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String deptName;

	private List<Course> courses;

	public Department(String deptNameIn) {
		courses = new ArrayList<Course>();
		deptName = deptNameIn;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptNameIn) {
		this.deptName = deptNameIn;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void dropCourse(Course course) {
		courses.remove(course);
	}

	public String toString() {
		return deptName;
	}
}
