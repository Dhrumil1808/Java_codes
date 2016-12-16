package quiz10;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.print("Enter the first number: ");
		Scanner input = new Scanner(System.in);
		double[] c = new double[2];
		for (int i = 0; i < c.length; i++)
		 	c[i] = input.nextDouble(); 
		Complex complex1=new Complex(c[0],c[1]);
	
		System.out.print("Enter the second number: ");
		double[] b = new double[2];
		for (int i = 0; i < c.length; i++)
		 	b[i] = input.nextDouble(); 
		Complex complex2=new Complex(b[0],b[1]);
		
		System.out.print(complex1.toString() + " + " + complex2.toString() + " = ");
		print(complex1.add(complex2));
		System.out.print(complex1.toString() + " - " + complex2.toString() + " = "); 
		print(complex1.subtract(complex2));
		System.out.print(complex1.toString() + " * " + complex2.toString() + " = "); 
		print(complex1.multiply(complex2));
		System.out.print(complex1.toString() + " / " + complex2.toString() + " = "); 
		print(complex1.divide(complex2));
		System.out.println("|" + complex1.toString() + "| = " + 
	    complex1.abs());
		input.close();
	}

	public static void print(Complex number) {
		if (number.getImaginaryPart() == 0)
			System.out.println(number.getRealPart());
		else
			System.out.println(number.getRealPart() + " + " + 
			number.getImaginaryPart() + "i");
	}

}
