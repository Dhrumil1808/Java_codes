package Lab10;

public class Cowboy extends Character{
	
	public static int count;
	double accuracy;
	
	public Cowboy(Double accuracy){
		super();
		count++;
		name = "Cowboy #" + count;
		this.accuracy = accuracy;
	}

	@Override
	public void shoot(Character c) {
		System.out.println(this.name + " attempts to shoot "+c.name+" in the back like a coward");
		Double shot = r.nextDouble();
		if(shot<accuracy){
			c.receiveInjury(shot);
		}else{
			System.out.println("The shot misses!");
		}
	}

}
