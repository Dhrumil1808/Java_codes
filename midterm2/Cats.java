package midterm2;

public class Cats extends Animals {

	//String voice="meow!";
	public Cats(String name,double weight)
	{
		super(name,weight);
	}
	
	public void call()
	{
		System.out.print("meow!");
	}
	public String toString()
	{	
		return "Cat named "+ getName() + " weighs " +getWeightInGrams() + " grams and says "; 
	}
	
}
