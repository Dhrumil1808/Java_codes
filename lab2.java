package lab2;

import java.text.DecimalFormat;
//import java.util.Scanner;
import java.util.*;

public class lab2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       DecimalFormat df=new DecimalFormat("#.#");
       DecimalFormat sf=new DecimalFormat("#.##");
     double gradepoint = 0.0;
     int credits=0;
       //System.out.println(gpa.matches(("\\d+(\\.\\d+)*")));
      boolean check=true;
      boolean str=true;
      while(check) 
      {	
    	  System.out.println("Enter your present GPA");
          String gpa=in.nextLine();
          System.out.println("enter the total number of units you have taken");
          String units=in.nextLine();
         
     	  if(gpa.matches(("(-)*\\d+(\\.\\d+)*")) && units.matches(("(-)*\\d+(\\.\\d+)*")))
    			  {
    		   gradepoint=Double.parseDouble(gpa);
    	       //System.out.println(gradepoint.hasNextDouble());
    	        credits=Integer.parseInt(units);
    	       
    	      while(gradepoint< 0.0 || gradepoint>4.0 || credits<0.0)
    	      {
    	    	  if(str)
    	    	  System.out.println("GPA should be between 0 and 4.0 and credits should not be less than 0");
    	    	  System.out.println("Enter your present GPA");
    	          String gpaa=in.nextLine();
    	          System.out.println("enter the total number of units you have taken");
    	          String unitss=in.nextLine();
    	          if(gpaa.matches(("(-)*\\d+(\\.\\d+)*")) && unitss.matches(("(-)*\\d+(\\.\\d+)*")))
    	          {
    	        	  
    	          str=true;
    	         gradepoint=Double.parseDouble(gpaa);
       	       //System.out.println(gradepoint.hasNextDouble());
       	        credits=Integer.parseInt(unitss);
    	          }
    	          else
    	    	  {
    	    		  System.out.println("Entered values should be numeric");
    	    		  str=false;
    	    	  }
    	      }
    		  int CS2011=3;
        	  double newgpa=0.0;
        	  double grade=4.0;
        	  System.out.println("Grade                 New GPA                  Difference(NewGPA-OldGPA) ");
        	 // double oldgpa=newgpa;
        	  while(Math.abs(grade)>=2.0)
        	  {
        		  
        	  //System.out.println(grade);
       if(Math.abs(grade)==4.0 || Math.abs(grade)==3.3 || Math.abs(grade)==3 || Math.abs(grade)==2.3 || Math.abs(grade)==2.0)
       {
        		  //System.out.println("grade= "+ grade);
        		 newgpa=((gradepoint * credits) + (CS2011* grade))/(credits + CS2011);
        		newgpa=Double.parseDouble(sf.format(newgpa));
        	
        		//System.out.println("newgpa="+ newgpa);
        		double difference=newgpa-gradepoint;
        		difference=Double.parseDouble(sf.format(difference));
        		//System.out.println("change="+ difference);
        		System.out.printf("%.2f\t\t\t%.2f\t\t\t%.2f\n",grade,newgpa,difference);
      		    
        		grade-=0.3;
        		  grade=Double.parseDouble(df.format(grade));
        		 // System.out.println("");
        		  
       }
       else if(Math.abs(grade)==3.7 || Math.abs(grade)==2.7)
       {
    	   //System.out.println("grade= "+ grade);
    	   newgpa=((gradepoint * credits) + (CS2011* grade))/(credits + CS2011);
    		newgpa=Double.parseDouble(sf.format(newgpa));
    		//System.out.println("newgpa="+ newgpa);
    		double difference=newgpa-gradepoint;
    		
    		difference=Double.parseDouble(sf.format(difference));
    		//System.out.println("change="+ difference);
    		System.out.printf("%.2f\t\t\t%.2f\t\t\t%.2f\n",grade,newgpa,difference);
    	        
    		grade-=0.4;
    		  grade=Double.parseDouble(df.format(grade));
    		  //System.out.println("");
    		   }
        	  
        	  }
        	  check=false;
    	        
    			  }
    	  else
    	  {
    		  System.out.println("Entered values should be numeric");
    		  
    	  }
    	  
    
      }
          
      in.close();
      
      
	}
}