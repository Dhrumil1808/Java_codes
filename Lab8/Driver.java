package Lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Driver {
	
	public static void main(String args[])
	{
	  MyFraction o_add=new MyFraction(2,4,'+');
	  MyFraction p_add=new MyFraction(3,14,'-');
	 MyFraction result_add=o_add.add(p_add);
	 System.out.println(result_add.toString());
	
	 MyFraction o_subtract=new MyFraction(-2,4,'+');
	  MyFraction p_subtract=new MyFraction(-3,-4,'-');
	 MyFraction result_subtract=o_subtract.subtract(p_subtract);
	 System.out.println(result_subtract.toString());
	
	 MyFraction o_multiply=new MyFraction(2,-5,'+');
	  MyFraction p_multiply=new MyFraction(-3,4,'+');
	 MyFraction result_multiply=o_multiply.multiply(p_multiply);
	 System.out.println(result_multiply.toString());
	  
	 MyFraction o_divide=new MyFraction(2,-4,'+');
	  MyFraction p_divide=new MyFraction(3,-14,'-');
	 MyFraction result_divide=o_divide.divide(p_divide);
	 System.out.println(result_divide.toString());
	  
	 int[] myarray={1,2,3,4,5};
	 int[] myarray1={1,3,4,5,6,7};
	 MySet my=new MySet(myarray);
	 MySet my1=new MySet(myarray1);
	 MySet result=my.divide(my1);
	 System.out.println(result.toString());
	 
	 System.out.println("union");
	 int[] myarray45={-1,-2,-3,-4,-5};
		int[] myarray46={1,2,-3,-4};
	
		MySet my22=new MySet(myarray45);
		MySet my33=new MySet(myarray46);
		MySet my2=my22.subtract(my33);
		System.out.println(my2.toString());
	 
		int[] myarray2={1,3,4,5,6,7,5,4};
		//int[] my5={1,3,6,7};
		MySet my6=new MySet(myarray2);
		//MySet my4=new MySet(my3);
		System.out.println(my6.toString());
		
	}

}
