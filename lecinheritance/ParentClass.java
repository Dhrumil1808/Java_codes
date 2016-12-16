package lecinheritance;

public class ParentClass {

	public void ParentMethod()
	{
		System.out.println(" This is Parent Method ");
	}
	
	public static void main(String[] args)
	{
		ChildClass obj1=new ChildClass();
		obj1.childmethod();
		obj1.ParentMethod();
	}
}
