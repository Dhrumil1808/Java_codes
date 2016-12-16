
package quiz10;

public class Complex implements Cloneable {
	private double a;
	private double b;

	public Complex() {
		this(0, 0);
	}
	
	public Complex(double a) {
		this(a, 0);
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;
	}

	public Complex add(Complex second) {
		return new Complex(a + second.a, 
			b + second.b); 
	}

	public Complex subtract(Complex second) {
		return new Complex(a - second.a,
			b - second.b);
	}

	public Complex multiply(Complex second) {
		return new Complex(a * second.a - b * second.b,
			b * second.a + a * second.b);
	}
	
	public Complex divide(Complex second) {
		return new Complex((a * second.a + b * second.b) /
			(Math.pow(second.a, 2) + Math.pow(second.b, 2)),
			(b * second.a - a * second.b) /
			(Math.pow(second.a, 2) +  Math.pow(second.b, 2)));
	}

	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}


	public String toString() {
		if(b==0)
		{
			return "a";
		}
		else
		{
			return " (a " + "+" + " b"+ "i)";
		}
	}
}