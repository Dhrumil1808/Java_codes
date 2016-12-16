package quiz5;

public class Cup extends Vessel {
	double radius;
	
	public Cup(double radius)
	{
		if(radius<0)
		{
			radius=0;
			System.out.println("invalid volume received");
		}
		else
		{
		this.radius=radius;
		}
	}
	
	
	
	public double getVolumeinML()
	{
		double pi=3.14;
		double volume= (0.5 * pi * Math.pow(radius, 3) * 4)/3;
		return volume;
	}
	
}
