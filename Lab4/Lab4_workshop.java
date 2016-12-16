package lab4;
import java.util.Scanner;
import java.util.Stack;
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fibonacci=new int[10];
		fibonacci[0]=0;
		fibonacci[1]=1;
		
		for(int i=2;i<10;i++)
		{
			fibonacci[i]=fibonacci[i-1]+ fibonacci[i-2];
		}
		System.out.println("Fibonaaci Series");
		for(int m:fibonacci)
		{
			System.out.println(m);
		}
		
		
		System.out.println("enter a  positive number");
		Scanner sc=new Scanner(System.in);
		
		while(!sc.hasNextInt())
		{
			System.out.println("Enter a number");
			sc.next();
		}
		int decimal=sc.nextInt();
		while(decimal<0)
		{
			System.out.println("Enter a number greater than 0");
			while(!sc.hasNextInt())
			{
				System.out.println("Enter a number");
				sc.next();
			}
		   decimal=sc.nextInt();
		}
		
		//System.out.println(decimal);;
		int remainder=0;
		Stack<Integer> s=new Stack<Integer>();
		int i=0;
		while(decimal!=0)
		{
			remainder=decimal % 2;
			//System.out.println(remainder);
			decimal=decimal/2;
			s.push(remainder);
			i++;
		}
		//System.out.println(Arrays.toString(s.toArray()));

		System.out.println("Binary representation");
		for(int j=0;j<i;j++)
		{
			System.out.println(s.pop());
		}
		
		
	/*Bubble Sort*/
		
	System.out.println("enter the number of elements");
	while(!sc.hasNextInt())
	{
		System.out.println("Enter numbers only");
		sc.next();
	}
	int n=sc.nextInt();
	
	while(n<0)
	{
		System.out.println("Enter a number greater than 0");
		while(!sc.hasNextInt())
		{
			System.out.println("Enter a number");
			sc.next();
		}
		n=sc.nextInt();
	}
	
	System.out.println("Enter the elements");
	int[] bubble=new int[n];
	for(int j=0;j<n;j++)
	{
		while(!sc.hasNextInt())
		{
			System.out.println("Enter numbers only");
			sc.next();
		}
		bubble[j]=sc.nextInt();
	}
	int temp;
	for(int l=0;l<bubble.length;l++)
	{
	for(int k=0;k<bubble.length-1;k++)
	{
		if(bubble[k]<bubble[k+1])
		{
			temp=bubble[k];
			bubble[k]=bubble[k+1];
			bubble[k+1]=temp;
		}
		
	}
	}
	System.out.println("Sorted Array(in descending order)");
	for(int h:bubble)
	{
		System.out.println(h);
	}
	
	}

}