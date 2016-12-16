package quiz5;

public class Driver {

	public static void main(String[] args)
	{
		System.out.println("Cup 1");
		Vessel cup=new Cup(12);
		double volume=cup.getVolumeinML();
		System.out.println(volume);
		cup.consume(12);
		double spilled=cup.getAmountSpilled(12);
		System.out.println(spilled);
		cup.pourIn(12);
		System.out.println("Cup 2");
		Vessel cups=new Cup(-1);
		 volume=cups.getVolumeinML();
		System.out.println(volume);
		cups.consume(12);
		 spilled=cups.getAmountSpilled(12);
		System.out.println(spilled);
		cups.pourIn(12);
		
		System.out.println("Glass 1");
		Vessel Glass=new Glass(1,12);
	     volume=Glass.getVolumeinML();
		System.out.println(volume);
		Glass.consume(12);
		spilled=Glass.getAmountSpilled(12);
		System.out.println(spilled);
		Glass.pourIn(12);
		
		System.out.println("Glass 2");
		Vessel glasses=new Glass(1,-10);
		 volume=glasses.getVolumeinML();
		System.out.println(volume);
		glasses.consume(12);
		spilled=glasses.getAmountSpilled(12);
		System.out.println(spilled);
		glasses.pourIn(12);
		
			
	}
}
