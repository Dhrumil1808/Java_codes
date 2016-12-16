package midterm2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animals a=new Cats("Tom",100);
		Animals b=new Mice("Jerry",50);
		a.eat(23);
		b.eat(20);
		System.out.print(a.toString());
		a.call();
		System.out.println();
		System.out.print(b.toString());
		b.call();
	}

}
