package quiz7;

import java.util.ArrayList;
import lab2.lab2;
import java.util.Random;

public class CourseRoll {

	int nextCIN=0;
	static ArrayList<Student> student=new ArrayList<Student>();
	lab2 simulator=new lab2();
	Random random=new Random();
    double[] grades=new double[30];
    
    
	public void OfferClass()
	{
		for(int i=0;i<30;i++)
		{   
			nextCIN++;
			grades[i]=getgaussianData(2,4);
			student.add(new Student(nextCIN,grades[i]));
		}
	}
	
	public Double getgaussianData(double min, double max)
	{
		//lab2.main(null);
		return min + (max-min) * random.nextDouble();
	}
	
	public static void main(String[] args)
    {
		 CourseRoll courseroll=new CourseRoll();
	    courseroll.OfferClass();
		
    	for(Student s:student)
    	{
    		System.out.println(s.toString());
    	}
    }
	
}
