package lec10;

public class arraycopyingexample {

	public static void main(String args[])
{
	String[] mylist=new String[5];
	mylist[0]="Hi ";
	mylist[1]="Good morning";
	mylist[2]= mylist[0] + mylist[1];
	//System.out.println(mylist[2]);
	mylist[3]="How are you?";
	mylist[4]="Hope you are fine";
	
	String[] copyofmylist=new String[mylist.length];
	for(int i=0;i<mylist.length;i++)
	{
		copyofmylist[i]=mylist[i];
	}
	for(String m:copyofmylist)
	{
		//System.out.println(m);
	}
	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	System.out.println("\nNumbers:");
	for(int n: numbers) System.out.println(n);
	int[] numbers2 = numbers;
	System.out.println("\nNumbers2:");
	for(int n: numbers2) System.out.println(n);
	int[] numbers3 = new int[10];
	System.arraycopy(numbers, 0, numbers3, 0, numbers.length); 
	
	numbers2[0] = 500;
	System.out.println("\nNumbers after resetting [0]:");
	for(int n: numbers) System.out.println(n);
	System.out.println("\nNumbers2 after resetting numbers[0]:");
	for(int n: numbers2) System.out.println(n);		
	System.out.println("\nNumbers3 after resetting numbers[0]:");
	for(int n: numbers3) System.out.println(n);

}
}
