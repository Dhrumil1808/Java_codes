package midterm2;

public class Mice extends Animals {
	//String voice="Eek!";
	public Mice(String name,double weight)
	{
		super(name,weight);
	}
	
	public void call()
	{
		
		System.out.print("Eek!");
		
	}
	public String toString()
	{
		
		return "Mouse named "+ getName() + " weighs " +getWeightInGrams() + " grams and says "; 
	}
}
