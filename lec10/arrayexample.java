package lec10;
import java.util.Scanner;
public class arrayexample {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int x=1;
	int y=2;
	add(x,y);
	String[] mylist=new String[5];
	System.out.println(mylist.length);
	mylist[0]="Hi ";
	mylist[1]="Good morning";
	mylist[2]= mylist[0] + mylist[1];
	System.out.println(mylist[2]);
	mylist[3]="How are you?";
	mylist[4]="Hope you are fine";

	for(int i=0;i<mylist.length;i++)
	{
		System.out.println(mylist[i]);
	}
	
	System.out.println("Enter your input");
	
	int[] mylist1=new int[3];
	int total=0;
	int max=mylist1[0];
	for(int i=0;i<mylist1.length;i++)
	{
		mylist1[i]=sc.nextInt();
		System.out.println("Your input for "+ (i+1) + " index " + mylist1[i]);
		total+= mylist1[i];
	}
	
	for(Integer m:mylist1)
	{
		System.out.println(m);
	}
	
	System.out.println("Total is " + total);
	
}
public static void add(int x,int y)
{
	int total=x+y;
	System.out.println(total);
}

}
