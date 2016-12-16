package lecinheritance;

public class ChildClass extends ParentClass{

	public void childmethod()
	{
		System.out.println("Hi! This is child method");
	}
	public static void main(String[] args)
	{
		ParentClass obj=new ParentClass();
		obj.ParentMethod();
	}
}
