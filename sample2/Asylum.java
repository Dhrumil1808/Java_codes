package sample2;

public class Asylum extends Building implements area{

	private String name="";
	
	public Asylum(double size,boolean haunted,String name)
	{
		super(size,haunted);
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void explore()
	{
		System.out.println(getName() + " " + getSize()); 
		if(getisHaunted())
		{
			//count++;
			System.out.println("Watch Out! A Ghost!");
		}
	}
}
