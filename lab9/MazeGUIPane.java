package lab9;

import java.util.ArrayList;
import java.util.Random;
//import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class MazeGUIPane extends BorderPane {

	//static boolean fool=true;
	static int index=0, k=0;
	static int rowCounter,colCounter;
	Label result=new Label("F");
	Label output=new Label("");
	
	ArrayList<Coordinate> fooltest=new ArrayList<Coordinate>();
	Bool b=new Bool();
	public void start() {
		// TODO Auto-generated method stub
		GridPane gp = new GridPane();
//		Label clickedLabel = new Label("Map Of Pamplona");
//		clickedLabel.getStyleClass().add("clickedLabel");
	
		ArrayList<Coordinate> cord=new ArrayList<Coordinate>();
		//ArrayList<Coordinate> fooltest=new ArrayList<Coordinate>();
		HBox clickedCounterBox = new HBox();

		//clickedCounterBox.getStyleClass().add("clickedBox");
	//	clickedCounterBox.getChildren().add(clickedLabel);
		
		HBox run=new HBox();
		Label title=new Label("");
		title.setText("Map of Pamplona");
		title.setTextFill(Color.GREEN);
		
		run.getChildren().add(title);
		title.getStyleClass().add("title");
		
		//title.setScaleY(2);
		//title.setScaleX(2);
		//title.setLabelPadding(0 0 0 -10);
		Button r=new Button("Run");
		r.setMinWidth(25);
		r.setMinHeight(25);
		run.getChildren().add(output);
		run.getChildren().add(r);
			output.getStyleClass().add("fool");
			
		for (rowCounter = 0; rowCounter < 20; rowCounter++)
		{
			for (colCounter = 0; colCounter < 20; colCounter++) {

		Label b = new Label("");
		b.setMinSize(30, 30);
	
		if(rowCounter==0 || rowCounter==19 || colCounter==0 || colCounter==19)
		{
			if(rowCounter==0 && colCounter==1)
			{
				b.getStyleClass().add("start");
				b.setText("S");
				b.setTextFill(Color.RED);
				b.setAlignment(Pos.CENTER);
				cord.add(new Coordinate(index++,rowCounter,colCounter,'S'));
			}
			else if(rowCounter==19 && colCounter==18)
			{
				b.getStyleClass().add("end");
				b.setText("E");
				b.setTextFill(Color.RED);
				b.setAlignment(Pos.CENTER);
				cord.add(new Coordinate(index++,rowCounter,colCounter,'E'));
			}
			else
			{
			b.getStyleClass().add("wall");
			cord.add(new Coordinate(index++, rowCounter,colCounter,'W'));
			}
			
		}
		else if(rowCounter>0 && rowCounter<3 && colCounter>0 && colCounter<3)
		{
			b.getStyleClass().add("empty");
			cord.add(new Coordinate(index++,rowCounter,colCounter,' '));
		}
		else if(rowCounter>17 && rowCounter<=19 && colCounter>17 && colCounter<=19)
		{
			b.getStyleClass().add("empty");
			cord.add(new Coordinate(index++,rowCounter,colCounter,' '));
		}
		else
		{
			Random random=new Random();
			int min=0,low = 0;
			int high = 2;
			int randomnumber = random.nextInt(high-low) + low;
		
			if(min>20)
			{
				b.getStyleClass().add("empty");
				cord.add(new Coordinate(index++,rowCounter,colCounter,' '));
			}
			else if(randomnumber==0)
			{
				min++;
				b.getStyleClass().add("wall");
				cord.add(new Coordinate(index++,rowCounter,colCounter,'W'));
			}
			else if(randomnumber==1)
			{
				min++;
				b.getStyleClass().add("empty");
				cord.add(new Coordinate(index++,rowCounter,colCounter,' '));
			}
			int row=rowCounter;
			int col=colCounter;
			b.addEventHandler(MouseEvent.MOUSE_CLICKED,
			new EventHandler<Event>() {
				//Boolean clicked=false;
				@Override
				public void handle(Event event) {
					
					//System.out.println(row + " "+ col);
					if(b.getStyleClass().contains("empty"))
					{
						b.getStyleClass().remove("empty");
						b.getStyleClass().add("wall");
						
						for(int i=0;i<cord.size();i++)
		{
			if(cord.get(i).getRow()==row && cord.get(i).getColumn()==col)
			{
				int counter=cord.get(i).getIndex();
				cord.set(counter, new Coordinate(counter,row,col,'W'));
				//System.out.println(cord.get(i).getIndex() + " " + cord.get(i).getC());
				
			}
		}				
}	
					else if(b.getStyleClass().contains("wall"))
					{
						b.getStyleClass().remove("wall");
						b.getStyleClass().add("empty");
					
						//System.out.println(cord.size());
						for(int i=0;i<cord.size();i++)
						{
							//System.out.println(rowCounter + " "+ colCounter);
							//System.out.println(cord.get(i).getColumn());
							if(cord.get(i).getRow()==row && cord.get(i).getColumn()==col)
							{
								int counter=cord.get(i).getIndex();
								//System.out.println(counter);
								cord.set(counter, new Coordinate(counter,row,col,' '));
								//System.out.println(cord.get(i).getIndex() + " " + cord.get(i).getC());
							}
						}
					}
				}
			}  
		);
		}
	    r.setOnAction(e-> { 
			//System.out.println("LOL");
	    	
	    	Coordinate cords=new Coordinate(index++,0,0,'W');
			cords.setRow(0);
			cords.setColumn(1);
			Label f=new Label("");
			f.setMinSize(25, 25);
			f.setText("F");
			f.setTextFill(Color.RED);
			f.setAlignment(Pos.CENTER);
			
		
			
			gp.add(f, cords.getColumn(),cords.getRow());
		
			
			setOnKeyPressed(new EventHandler<KeyEvent>()
				{
				
			@Override
			public void handle(KeyEvent event)
			{
				
				
				//System.out.println(k);
				int map=0;
				if(event.getCode()==KeyCode.DOWN)
				{
					int rows=cords.getRow() + 1;
					int col=cords.getColumn();
					
					for(int i=0;i<cord.size();i++)
					{
						if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()==' ')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),' '));
							//System.out.println(fooltest.size());
							moveFool(gp, rows, col);
							break;
			     		}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							moveFool(gp, rows, col);
							break;
			     		}
					}
				}
				if(event.getCode()==KeyCode.UP)
				{

					int rows=cords.getRow() - 1;
					int col=cords.getColumn();
					for(int i=0;i<cord.size();i++)
					{
						if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()==' ')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),' '));
							moveFool(gp, rows, col);
							break;
						}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);	
							k++;

							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							moveFool(gp, rows, col);
							break;
			     		}
					}
				}
				if(event.getCode()==KeyCode.RIGHT)
				{

					int rows=cords.getRow();
					int col=cords.getColumn() + 1;
					for(int i=0;i<cord.size();i++)
					{
						if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()==' ')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),' '));
							moveFool(gp, rows, col);
						
							break;
						}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							moveFool(gp, rows, col);
							
							break;
			     		}
					}					
				}
				if(event.getCode()==KeyCode.LEFT)
				{

					int rows=cords.getRow();
					int col=cords.getColumn() - 1;
					for(int i=0;i<cord.size();i++)
					{
						if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()==' ')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),' '));
							moveFool(gp, rows, col);
							
							break;
						}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							moveFool(gp, rows, col);
							break;
							
			     		}
						
					}
				}
			}
			
				});
			
			
		});
		
	gp.add(b, colCounter, rowCounter);
	 
			}
		}
		   setTop(clickedCounterBox);
		   setBottom(gp);
		   setRight(run);
	}
	

	  private void moveFool(GridPane gp, int row, int column){
		  
			
		  result.setText("");
		  for (Node label:gp.getChildren()){
			  if(GridPane.getRowIndex(label) == row && GridPane.getColumnIndex(label) == column){
				  result=(Label)label;
				  break;
			  }
		  }
		  result.setText("F");
		  result.setTextFill(Color.RED);
		  result.setAlignment(Pos.CENTER);
		  int[] grids=new int[2];
		  if(k>10)
		  {
			  grids=b.movebool(gp,result,fooltest);
			  grids=b.movebool(gp, result,fooltest);
			
				  if(grids[0]==fooltest.get(fooltest.size()-1).getRow() && grids[1]==fooltest.get(fooltest.size()-1).getColumn())
				  {
					  output.setText("Bool caught the fool");
					  output.setTextFill(Color.RED);
					  
				  }
				  
				  if(fooltest.get(fooltest.size()-1).getRow()==19 && fooltest.get(fooltest.size()-1).getColumn()==18)
				  {
					  output.setText("Fool Wins");
					  output.setTextFill(Color.GREEN);
					 
				  }
			
				
		  }
		  
		  
	  }
}
