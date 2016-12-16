package lab3;
import java.util.*;

public class lab3 {

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter a string");
		String word=in.nextLine();
		char[] word_char=word.toCharArray();
		String newword="";
	
	
	//System.out.println(k);
	ArrayList<Character> words=new ArrayList<Character>();
	ArrayList<Integer> newwords=new ArrayList<Integer>();
	for(int i=0;i<word_char.length;i++)
	{
		words.add(word_char[i]);
	}
	
	
	for(int j=0;j<words.size()-1;j++)
	{
		///k=0;
		for(int l=j+1;l<words.size();l++)
		{
			if(words.get(j)==words.get(l))
			{
				
				//newwords.add(words.get(l));
				//newwords.add(words.get(j));
				//words.remove(j);
				newwords.add(l);
				newwords.add(j);
		
			}
			
			
		}
	
	}
	for(int m=0; m < words.size();m++)
	{
		int sum=0;
		for(int n=0;n<newwords.size();n++)
		{
			if(m!=(int) newwords.get(n))
			{
				sum++;
				//words.remove(words.get(m));
			}
		}
		if(sum==newwords.size())
		{
			newword+=words.get(m);
		}
		
	}
	
		System.out.println("Output: "+ newword);
		
	}
}