package lab5;
import java.util.Scanner;

public class Lab5 {
  
public static void main(String args[])
{ 
	Scanner sc=new Scanner(System.in);
	
	int[][] matrix1=new int[3][3];
	int[][] matrix2=new int[3][3];
	int[][] matrix3=new int[3][3];

    
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			matrix1[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < 3; i++) {
        System.out.print("| ");
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix1[i][j] + " | ");
        }
        System.out.println();
        System.out.println("-------------");
        //System.out.println(board[0].length);
    }
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			matrix2[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < 3; i++) {
        System.out.print("| ");
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix2[i][j] + " | ");
        }
        System.out.println();
        System.out.println("-------------");
        //System.out.println(board[0].length);
    }
	int k=0;
	for(int i=0;i<4;i++)
	{
		if(k<=2 && i!=0)
		{
		i--;
		//System.out.println("i= " + i);
		}
		int sum=0;
		for(int j=0;j<3;j++)
		{
		sum+=matrix1[i][j] * matrix2[j][k];
		}
		matrix3[i][k]=sum;
		//System.out.println("i= "+ i + " k= "+ k +"  "  + matrix3[i][k]);
		if(k<2)
		{
			k++;
			//System.out.println("k= "+ k);
		}
		else if(k>=2)
		{
			k=0;
			i++;
			
		}
			}
	
	
	
	System.out.println("                     ");
	System.out.println("                     ");
	System.out.println("                     ");
	
	for (int i = 0; i < 3; i++) {
        System.out.print("| ");
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix3[i][j] + " | ");
        }
        System.out.println();
        System.out.println("-------------");
        //System.out.println(board[0].length);
    }
	
	
	
	
	
	int[] array={2,45,7,3,5,1,8,9};
	int sum=0;
	for(int i=0;i<array.length;i++)
	{
	
		if(array[i]>12)
		{
			continue;
		}
		else
		{
			sum=12-array[i];
			for(int j=i+1;j<array.length;j++)
			{
				if(sum==array[j])
				{
					System.out.println(array[j] +" " + array[i]);
				}
			}
		}
	}
	
}
}
