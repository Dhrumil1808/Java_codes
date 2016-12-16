package lab3;

import java.util.Scanner;


public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab3 lab3=new Lab3();
		lab3.context();
	//sc.nextLine();
		}

	public void context()
	{
		Lab3 lab3=new Lab3();
		
		boolean loop=true;
		double min=0.0,max=0.0,radius=0;
		double max_perimeter=0.0,max_vol_sphere=0.0,max_vol_cylinder=0.0;
		int i=0,j=0,k=0,options=0,option=0;radius=0;
		while(loop)
		{
                option++;
                //System.out.println(options);
			boolean loops=true;
			Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string");
		String word=sc.nextLine();
		//System.out.println(word.isEmpty());
		
		//System.out.println(word);
	
		boolean check=true;
		
		System.out.println("Please enter a min value");
		
		while(check)
		{
			if(sc.hasNextDouble())
			{
				min=sc.nextDouble();
				if(min>0)
				{
				//min=sc.nextDouble();
				check=false;
				}
				else
				{
					System.out.println("Please enter a non negative value");
					sc.nextLine();
				}
			}
			else
			{
				System.out.println("Please enter a numeric value");
				sc.nextLine();
			}			
		}
		
		System.out.println("Please enter a max value");
		while(!check)
		{
			
			if(sc.hasNextDouble())
			{
				max=sc.nextDouble();
				if(max > min)
				{
				check=true;
				}
				else
				{
					System.out.println("Maximum value should be greater than minimum value");
					sc.nextLine();
				}
			}
			else
			{
				System.out.println("Please enter a numeric value");
				sc.nextLine();
			}			

		}
		
		
		radius=lab3.input(word,min,max);	
		System.out.println("You entered "+ radius);
		
			while(loops)
			{
				if(option!=0)
				{
					
				
			System.out.println("Select one of the options");
			System.out.println("1. Press 1 to exit");
			System.out.println("2. Calculate Perimeter of Circle");
			System.out.println("3. Calculate Volume of Sphere");
			System.out.println("4. Calculate Volume of Cylinder");
			options=sc.nextInt();	
				}
				
			switch (options)
			{
			case 1:
				//System.out.println("Press 1 to exit");
				loops=false;
				loop=false;
				break;
			case 2:
				//System.out.println("Calculate Perimeter of Circle");
			if(option==-1)
			{
			options=2;	
			loops=false;	
			}
			else 
			{
				double perimeter=lab3.circle(radius);
				System.out.println("Perimeter of Circle: "+ perimeter);
				i++;
				if(i==1)
				{
				 max_perimeter=perimeter;
				}
				else
				{
						if(max_perimeter<perimeter)
						{
							max_perimeter=perimeter;
						}
				}
				option=-1;
	
			}
		  
				//loops=false;
				break;
			case 3: 
				//System.out.println("Calculate Volume of Sphere");
				if(option==-1)
				{
					options=3;
				loops=false;	
				}
				else
				{
					
				
				double volume_sphere=lab3.sphere(radius);
				System.out.println("Volume of Sphere: "+ volume_sphere);
				j++;
				if(j==1)
				{
				 max_vol_sphere=volume_sphere;
				}
				else
				{
						if(max_vol_sphere < volume_sphere)
						{
							max_vol_sphere=volume_sphere;
						}
				}
				}
				option=-1;
				//loops=false;
				break;
			case 4:
				//System.out.println("Calculate volume of cylinder");
				if(option==-1)
				{
					options=4;
					loops=false;
				}
				else
				{
				System.out.println("Please enter the height of cylinder");
				double height=0.0;
				boolean bool=true;
				while(bool)
				{
					if(sc.hasNextDouble())
					{
						height=sc.nextDouble();
						if(height>=0)
						{
						bool=false;
						}
						else
						{
							System.out.println("Enter a positive value");
							sc.nextLine();
						}
						
					}
					else
					{
						System.out.println("Please enter a numeric value");
						sc.nextLine();
					}
				}
				double volume_cylinder=lab3.cylinder(radius, height);
				System.out.println("Volume of Cylinder: "+ volume_cylinder);
				k++;
				if(k==1)
				{
				 max_vol_cylinder=volume_cylinder;
				}
				else
				{
						if(max_vol_cylinder < volume_cylinder)
						{
							max_vol_cylinder=volume_cylinder;
						}
				}
				}
				option=-1;
				//loops=false;
				break;
			}
			}
			
			}
		System.out.println("Max perimeter of Circle: "+ max_perimeter);
		System.out.println("Max volume of Sphere: "+ max_vol_sphere);
		System.out.println("Max volume of Cylinder: "+ max_vol_cylinder);
	
	}
	public Double input(String words,Double min,Double max)
	{
		Scanner num=new Scanner(System.in);
		 System.out.println("Please enter a value between "+ min +" and "+ max + " for the "+words);
		boolean range=true;
		Double number=0.0;
		while(range)
		{
			if(num.hasNextDouble())
			{
				number=num.nextDouble();
				if(number>= min && number <= max)
				{
					//System.out.println("You entered "+ number);
					range=false;
				}
				else
				{
					System.out.println("Number entered should be between "+ min + " and "+ max);
					num.nextLine();
				}
					
			}
			else
			{
				System.out.println("please enter a numeric value");
				num.nextLine();
			}
		}
		
		
		return number;
	}
	
	public double circle(double radius)
	{
		double PI=3.14;
		double perimeter= 2 * PI * radius;
		
		return perimeter;
	}
	
	public double sphere(double radius)
	{
		double PI=3.14;
		double volume=(4/3) * PI * radius;
		return volume;
	}
	
	public double cylinder(double radius, double height)
	{
		double PI=3.14;
		double volume = PI * radius * radius * height;
		return volume;
	}

}
