package Lab4;
import java.util.Scanner;

public class lab4 {
	 public enum Player {
	        X , O 
	    }
	 
	 Player turn;
	 
	 public lab4(Player turn)
	 {
		 this.turn=turn;
	 }
	 static Scanner sc=new Scanner(System.in);
	 int row,col;
	 static char [][] board = new char[3][3];
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]=' ';
			}
		}
		
		
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
            //System.out.println(board[0].length);
        }
       
        lab4 Xchance=new lab4(Player.X);
        lab4 Ochance=new lab4(Player.O);
        
        for(int i=0;i<9;i++)
        {
        	
        		if(i%2==0)
        		{
        		Xchance.game();
        		}
        		else
        		{
        			Ochance.game();
        		}
        
    	//System.out.println("-------------");
        		
        }
      	}
	
	public void game()
	{
		switch(turn)
		{
		case X:
			//System.out.println("Where do you want to place your next move?");
			System.out.println("Enter the row");
			while(!sc.hasNextInt())
			{
				System.out.println("Enter a number");
				sc.next();
			}
			row=sc.nextInt();
			 while(row > 2 || row < 0)
			 {
				 System.out.println("Please enter coordinates between 0 and 2");
				 while(!sc.hasNextInt())
					{
						System.out.println("Enter a number");
						sc.next();
					}
				 row=sc.nextInt();
			 }
			System.out.println("Enter the column"); 
			while(!sc.hasNextInt())
			{
				System.out.println("Enter a number");
				sc.next();
			}
		 col=sc.nextInt();
		 while(col > 2 || col < 0)
		 {
			 System.out.println("Please enter coordinates between 0 and 2");
			 //row=sc.nextInt();
			 while(!sc.hasNextInt())
				{
					System.out.println("Enter a number");
					sc.next();
				}
			 col=sc.nextInt();
		 }
		 while(board[row][col]!=' ')
			{
				System.out.println("please choose another move");
				System.out.println("Enter the row");
				while(!sc.hasNextInt())
				{
					System.out.println("Enter a number");
					sc.next();
				}
				row=sc.nextInt();
				 while(row > 2 || row < 0)
				 {
					 System.out.println("Please enter coordinates between 0 and 2");
					 while(!sc.hasNextInt())
						{
							System.out.println("Enter a number");
							sc.next();
						}
					 row=sc.nextInt();
				 }
				System.out.println("Enter the column"); 
				while(!sc.hasNextInt())
				{
					System.out.println("Enter a number");
					sc.next();
				}
			 col=sc.nextInt();
			 while(col > 2 || col < 0)
			 {
				 System.out.println("Please enter coordinates between 0 and 2");
				 //row=sc.nextInt();
				 while(!sc.hasNextInt())
					{
						System.out.println("Enter a number");
						sc.next();
					}
				 col=sc.nextInt();
			 }
			}
		
		 strategy(row,col,'X');
			break;
		case O:
			//System.out.println("Where do you want to place your next move?");
			System.out.println("Enter the row");
			while(!sc.hasNextInt())
			{
				System.out.println("Enter a number");
				sc.next();
			}
			row=sc.nextInt();
			while(row > 2 || row < 0)
			 {
				 System.out.println("Please enter coordinates between 0 and 2");
				 row=sc.nextInt();
				 //col=sc.nextInt();
			 }
			System.out.println("Enter the column"); 
			while(!sc.hasNextInt())
			{
				System.out.println("Enter a number");
				sc.next();
			}
		 col=sc.nextInt();
			 while(col > 2 || col < 0)
			 {
				 System.out.println("Please enter coordinates between 0 and 2");
				 //row=sc.nextInt();
				 col=sc.nextInt();
			 }
			 while(board[row][col]!=' ')
				{
					System.out.println("please choose another move");
					row=sc.nextInt();
					 col=sc.nextInt();
				}
			
			 strategy(row,col,'O');
			break;
		}
	}
	
	public void strategy(int row, int col,char player)
	{
	  board[row][col]=player;
	  
	  for (int k = 0; k < 3; k++) {
          System.out.print("| ");
          for (int j = 0; j < 3; j++) {
              System.out.print(board[k][j] + " | ");
          }
          System.out.println();
          System.out.println("-------------");
          //System.out.println(board[0].length);
      }
	  
	  /* Diagonal win*/
	  if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=' ')
	  {
		  if(board[0][0]=='X')
		  {
			  System.out.println("Player X wins");
			  System.exit(0);
		  }
		  if(board[0][0]=='O')
		  {
			  System.out.println("Player O wins");
			  System.exit(0);
		  }
	  }
	  /* Column win*/
	  for(int i=0;i<board.length;i++)
	  {
			  if(board[i][0]==board[i][1] && board[i][1]==board[i][2] && board[i][1]!=' ')
			  {
                				  if(board[i][0]=='X')
                				  {
                					  System.out.println("Player X wins");
                					  System.exit(0);
                				  }
                				 if(board[i][0]=='O')
                				 {

                					  System.out.println("Player O wins");
                					  System.exit(0);
                				 }
			  }		  
	  }
	  if(board[2][0]==board[0][2] && board[0][2]==board[1][1] && board[0][2]!=' ')
	  {
		  if(board[0][2]=='X')
		  {
			  System.out.println("Player X wins");
			  System.exit(0);
		  }
		  if(board[0][2]=='O')
		  {
			  System.out.println("Player O wins");
			  System.exit(0);
		  }
	  }
	  
	  /* Row win*/
	  for(int i=0;i<board.length;i++)
	  {
			  if(board[0][i]==board[1][i] && board[1][i]==board[2][i] && board[0][i]!=' ')
			  {
                				  if(board[0][i]=='X')
                				  {
                					  System.out.println("Player X wins");
                					  System.exit(0);
                				  }
                				 if(board[0][i]=='O')
                				 {

                					  System.out.println("Player O wins");
                					  System.exit(0);
                				 }
			  }
			  
		  
	  }
	  int k=0;
	  
	  for(int i=0;i<board.length;i++)
	  {
		  for(int j=0;j<board[i].length;j++)
		  {
			  if(board[i][j]==' ')
			  {
				k++;  
			  }
		  }
	  }
	  if(k==0)
	  {
		  System.out.println("Game ends in draw");
		  System.exit(0);
	  }
	 
	}

}
