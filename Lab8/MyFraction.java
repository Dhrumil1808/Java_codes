package Lab8;

public class MyFraction {

	private int numerator;
	private int denominator;
	private char sign;
	
	
	public MyFraction(int numerator,int denominator,char sign)
	{
		this.numerator=numerator;
		this.denominator=denominator;
		//this.sign=sign;
	}
	
	public MyFraction add(MyFraction my)
	{
		if(this.denominator==my.denominator)
		{
			numerator=this.numerator + my.numerator;
			return new MyFraction(numerator,denominator,'-');
		}
		else
		{
			numerator=this.numerator * my.denominator + this.denominator * my.numerator;
			denominator=this.denominator * my.denominator;
			
			return new MyFraction(numerator,denominator,sign);
		}
		
	}
	
	public MyFraction subtract(MyFraction my)
	{
		if(this.denominator==my.denominator)
		{
			numerator=this.numerator - my.numerator;
			return new MyFraction(numerator,denominator,sign);
		}
		else
		{
			numerator=this.numerator * my.denominator - this.denominator * my.numerator;
			denominator=this.denominator * my.denominator;
			return new MyFraction(numerator,denominator,sign);
		}
		
	}
	public MyFraction multiply(MyFraction my)
	{
			numerator=this.numerator * my.numerator;
			denominator=this.denominator * my.denominator;
			return new MyFraction(numerator,denominator,'+');
			
			
	}
	
	public MyFraction divide(MyFraction my)
	{
			numerator=this.numerator * my.denominator;
			denominator=this.denominator * my.numerator;
			
				return new MyFraction(numerator,denominator,'+');
		
	}
	
	public int gcd(int a,int b)
	{
		if(a<0)
			a=-a;
		if(b<0)
			b=-b;
	if(a>b)
	{
		if(a%b==0)
		{
			return b;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	else 
	{
		if(b%a==0)
		{
			return a;
		}
		else
		{
			return gcd(a,b%a);
		}
	}
	
	}
	
	public String toString()
	{
		int gcd=gcd(numerator,denominator);
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		
		if(denominator<0)
		{
			denominator=-denominator;
			if(numerator<0)
			{
				numerator=-numerator;
				return  numerator + "/" + denominator;
			}
			else
			{
			return "-" + numerator + "/" + denominator;
			}
			}
		else
		{
			return  numerator + "/" + denominator;
		}
	}
	
}
