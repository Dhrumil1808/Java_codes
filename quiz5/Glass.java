package quiz5;

public class Glass extends Vessel{

	double radius,height;
	public Glass(double radius,double height)
			{
		if(radius<0)
		{
			radius=0;
			System.out.println("invalid volume received");
		}
		else if(height<0)
		{
			height=0;
			System.out.println("invalid volume received");
		}
		else
		{
		this.radius=radius;
		this.height=height;
			}
			}
	
	
	public double getVolumeinML()
	{
		double pi=3.14;
		double volume= pi * radius * radius * height;
		
		return volume;
	}
}
