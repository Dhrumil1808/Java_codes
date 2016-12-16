package sample2;

public abstract class Building implements area{
	protected  double size;
	protected  boolean haunted;
	protected  int count=0;
	
	
	public Building(double size,boolean haunted)
	{
		this.size=size;
		this.haunted=haunted;
		
	}
	public abstract void explore();
	
	protected void calculate()
	{
		
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public boolean getisHaunted() {
		return haunted;
	}
	public void setHaunted(boolean haunted) {
		this.haunted = haunted;
	}
	
	
	
	

}
