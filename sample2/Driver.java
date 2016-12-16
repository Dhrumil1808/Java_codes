package sample2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args)
	{
		 int count=0;
		Building one=new House(165,true,"updated kitchen");
		Building two=new House(174,false,"charming fireplace");
		Building three=new House(190,true,"capacious septic tank");
		Building four=new House(215,true,"great living room");
		
		Asylum five= new Asylum(100,true,"The California Home for Clowns");
		Asylum six=new Asylum(150,false,"State Home for Criminally Insane");
		ArrayList<Building> build=new ArrayList<Building>();
		build.add(one);
		build.add(two);
		build.add(three);
		build.add(four);
		build.add(five);
		build.add(six);
		
		System.out.println("Let's go for a stroll on Maple's Street");
		
		for(int i=0;i<build.size();i++)
		{
			build.get(i).explore();
			if(build.get(i).getisHaunted())
			count++;
		}
		System.out.println(count +" of the buildings on Maple Street are haunted");
		//build.toString();
		
		
	}
}
