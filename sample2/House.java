package sample2;

public class House extends Building implements area{

	private String feature="";
	
	public House(double sizes,boolean haunted,String feature)
	{
		super(sizes,haunted);
		
		this.feature=feature;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	public void explore()
	{
		System.out.println(getSize() + " " + getFeature());
		if(getisHaunted())
		{
			//count++;
			System.out.println("Watch Out! A Ghost!");
		}
	}
	
}
