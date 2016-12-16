package lec12;

public class Course {
		private int courseNum;
		private String instructorName;

		public Course(int courseNumIn, String instructorNameIn){
			courseNum = courseNumIn;
			instructorName = instructorNameIn;
		}

		public int getCourseNum() {
			return courseNum;
		}

		public void setCourseNum(int courseNum) {
			this.courseNum = courseNum;
		}

		public String getInstructorName() {
			return instructorName;
		}

		public void setInstructorName(String instructorName) {
			this.instructorName = instructorName;
		}

		public String toString(){
			return courseNum + "; Instructor: " + instructorName;
		}
}
