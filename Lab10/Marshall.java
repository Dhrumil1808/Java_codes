package Lab10;

public class Marshall extends Character{
	
	double accuracy;
	public Marshall(String nameIn, Double accuracy){
		super();
		name=nameIn;
		this.accuracy=accuracy;
	}
	@Override
	public void shoot(Character c) {
		System.out.println( this.name + " steadfastly stands up to "+ c.name + " and draws!");
		Double shoots = r.nextDouble();
		if(shoots<accuracy){
			c.receiveInjury(shoots);
		}else{
			System.out.println("The shot misses!");
		}	
	}

}
