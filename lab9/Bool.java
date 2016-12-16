package lab9;

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Bool {

	Label bool=new Label();
	int l=0;
	public int[] movebool(GridPane gp,Label result,ArrayList<Coordinate> fooltest)
	{
		int[] grids=new int[2];
		//MazeGUIPane Maze=new MazeGUIPane();
		  bool.setText("");
		  Coordinate tempCoordinate=fooltest.get(l);
		  int r=tempCoordinate.getRow(), c=tempCoordinate.getColumn();
		  
		  for (Node label:gp.getChildren()){
			  if(GridPane.getRowIndex(label) == r && GridPane.getColumnIndex(label) == c){
				  bool=(Label) label;
				  break;
			  }
		  }
		  
		  bool.setText("B");
		  bool.setTextFill(Color.GREEN);
		  result.setAlignment(Pos.CENTER);
		  l++;
		  grids[0]=r;
		  grids[1]=c;
		  return grids;
	}
}
