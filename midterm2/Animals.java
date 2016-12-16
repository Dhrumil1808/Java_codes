package midterm2;

public abstract class Animals {
   protected String name;
   protected double weightInGrams;
   
   public Animals(String name, double weightInGrams)
   {
	   this.name=name;
	   this.weightInGrams=weightInGrams;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getWeightInGrams() {
	return weightInGrams;
}

public void setWeightInGrams(double weightInGrams) {
	this.weightInGrams = weightInGrams;
}
   
public void eat(double foodWeight)
   {
	   weightInGrams +=foodWeight;
   }

public abstract void call();
   
}
