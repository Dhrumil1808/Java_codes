package lab9.copy;

import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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
	static int index=0, k=0,l=1;
	static int rowCounter,colCounter;
	Label bool;
	public void start() throws Exception {
		// TODO Auto-generated method stub
		GridPane gp = new GridPane();
//		Label clickedLabel = new Label("Map Of Pamplona");
//		clickedLabel.getStyleClass().add("clickedLabel");
	
		ArrayList<Coordinate> cord=new ArrayList<Coordinate>();
		ArrayList<Coordinate> fooltest=new ArrayList<Coordinate>();
		//ArrayList<Coordinate> fooltest=new ArrayList<Coordinate>();
		HBox clickedCounterBox = new HBox();

		//clickedCounterBox.getStyleClass().add("clickedBox");
	//	clickedCounterBox.getChildren().add(clickedLabel);
		
		HBox run=new HBox();
		Button r=new Button("Run");
		r.setMinWidth(25);
		r.setMinHeight(25);
		run.getChildren().add(r);
		
		for (rowCounter = 0; rowCounter < 20; rowCounter++)
		{
			for (colCounter = 0; colCounter < 20; colCounter++) {

		Label b = new Label("");
		b.setMinSize(25, 25);
	
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
			int low = 0;
			int high = 2;
			int randomnumber = random.nextInt(high-low) + low;
			
			if(randomnumber==0)
			{
				b.getStyleClass().add("wall");
				cord.add(new Coordinate(index++,rowCounter,colCounter,'W'));
			}
			else
			{
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
}					else if(b.getStyleClass().contains("wall"))
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
			
			bool=new Label("");
			bool.setMinSize(25, 25);
			bool.setText("B");
			bool.setTextFill(Color.GREEN);
			bool.setAlignment(Pos.CENTER);
			
			gp.add(f, cords.getColumn(),cords.getRow());
			gp.add(bool, cords.getColumn(), cords.getRow());
			
			setOnKeyPressed(new EventHandler<KeyEvent>()
				{
				
			@Override
			public void handle(KeyEvent event)
			{
				
				
				System.out.println(k);
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
							gp.add(f, col,rows);
							break;
			     		}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							gp.add(f, cords.getColumn(),cords.getRow());
							break;
			     		}
					}
					
					int brow = cords.getRow();
					int lcol = cords.getColumn();
					gp.add(bool, lcol, brow);
					System.out.println("dsfsdfdsfdsdfd 0 "  +brow);
					
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
							gp.add(f, cords.getColumn(),cords.getRow());
							break;
						}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);	
							k++;

							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							gp.add(f, cords.getColumn(),cords.getRow());
							break;
			     		}
					}
					int brow = cords.getRow();
					int lcol = cords.getColumn();
					gp.add(bool, lcol, brow);
					
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
							gp.add(f, cords.getColumn(),cords.getRow());
						
							break;
						}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							gp.add(f, cords.getColumn(),cords.getRow());
							
							break;
			     		}
					}
					int brow = cords.getRow();
					int lcol = cords.getColumn();
					gp.add(bool, lcol, brow);
					
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
							gp.add(f, cords.getColumn(),cords.getRow());
							
							break;
						}
						else if(cord.get(i).getRow()==rows && cord.get(i).getColumn()==col && cord.get(i).getC()=='E')
						{
							cords.setRow(rows);
							cords.setColumn(col);
							k++;
							fooltest.add(new Coordinate(map++,cords.getRow(),cords.getColumn(),'E'));
							gp.add(f, cords.getColumn(),cords.getRow());
							
							break;
							
			     		}
						
					}
					int brow = cords.getRow();
					int lcol = cords.getColumn();
					gp.add(bool, lcol, brow);
					
				}
				if(k>=5)
				{
					
					gp.add(bool, fooltest.get(l).getColumn(),fooltest.get(l).getRow());
					l++;
					
				}
				System.out.println("    kkkkk");
				System.out.println(fooltest.get(l)+"     lllllll");
				
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
	

    public static void main(String[] args)
	{
		Application.launch(args);
	}
	
	
}
