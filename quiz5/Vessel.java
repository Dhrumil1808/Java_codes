package quiz5;

public abstract class Vessel {


	public abstract double getVolumeinML();
	
	public double getAmountSpilled(double amountPouredIn)
	{
		if(amountPouredIn - getVolumeinML() <=0)
			return 0;
		else
			return amountPouredIn - getVolumeinML();
	}
	
	public void pourIn(double amountPouredIn)
	{
		
		if(amountPouredIn <=getVolumeinML())
			System.out.println(amountPouredIn + " CCs poured into vessel");
		else
			System.out.println(amountPouredIn + " CCs poured into vessel; " + getAmountSpilled(amountPouredIn) +" CCs spilled" );
	}
	
	public void consume(double amountconsumed)
	{
		double diff=amountconsumed-getVolumeinML();
		if(amountconsumed<=getVolumeinML())
		{
			System.out.println("You consume " + amountconsumed + " MLs of your favourite beverage");
		}
		else
		{
			System.out.println("You consume " + diff + " MLs of your favourite beverage");
		}
	}
	
}
