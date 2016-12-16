package lab12;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class RecursiveProbs extends Application {

	int i=0,j=0;
	
		public boolean recursiveContains(char c, String s){
		if(s.length() == 0) return false;
		if(s.charAt(s.length()-1)==c) return true;
		else return recursiveContains(c, s.substring(0, s.length() -1));		
	}
	
	public boolean recursiveAllCharactersSame(String s)
	{
		i++;
		if((s.length()==0 || s.length()==1) && i==1) 
			return true;
		
		if((s.length()==1) && i!=1)
		{
			if(j==i-1)
				return true;
			else
				return false;
		}
		if(s.length()>=2)
		{
		if(s.charAt(s.length()-1)==s.charAt(s.length()-2)) 
		{
			j++;	
			return recursiveAllCharactersSame(s.substring(0, s.length() -1));
		}
		else return recursiveAllCharactersSame(s.substring(0, s.length() -1));
		}
		return false;
		
	}
	
	String reverse = "";
	public String recursiveReverse(String s)
	{
		if(s.length()==0)
			return reverse;
		else
		{
			reverse+=s.charAt(s.length()-1);
			return recursiveReverse(s.substring(0, s.length()-1));
		}
	
	}
	
	int k=0;
	public int recursiveCount(char c, String s)
	{
		if(s.length()!=0)
		{
		if(s.charAt(s.length()-1)==c)
		{
				k=k+1;
				return recursiveCount(c,s.substring(0, s.length()-1));
		}
		else
			return recursiveCount(c,s.substring(0, s.length()-1));
		}
		
		if(s.length()==0)
			return k;
	
		return k;
	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane gp = new GridPane();		
		Scene sc = new Scene(gp);
	//	sc.getStylesheets().add("style.css"); 
		//RecursiveProbs pc = new RecursiveProbs();
		Label string = new Label("Enter the string:");
		TextField side = new TextField();		
		Label answer = new Label(" Enter the character: ");
		TextField character = new TextField();
		Label contains=new Label("character in the string");
		Label contains_ans=new Label();
		Label allsame=new Label("all characters same");
		Label allsame_ans=new Label();
		Label reverse=new Label("Reverse String");
		Label reverse_ans=new Label();
		Label count=new Label("character count");
		Label count_ans=new Label();
		RecursiveProbs rp=new RecursiveProbs();
		
		Button btnCalc = new Button("Find");	
		btnCalc.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				String string = side.getText();
				String c=character.getText();
				boolean contain;
				int length;

				if(c.length()==0)
				{
					 contain=rp.recursiveContains(' ', string);
					 length=rp.recursiveCount(' ',string);
				}
				else
				{
					 contain=rp.recursiveContains(c.charAt(0), string);
					 length=rp.recursiveCount(c.charAt(0),string);
				}
			    boolean occurences=rp.recursiveAllCharactersSame(string);
				String rev=rp.recursiveReverse(string);
				contains_ans.setText(String.valueOf(contain));
				allsame_ans.setText(String.valueOf(occurences));
				reverse_ans.setText(rev);
				count_ans.setText(String.valueOf(length));
			}			
		});	
		
		gp.getStyleClass().add("pane");
		gp.add(string, 0, 0);
		gp.add(side, 2, 0);
		gp.add(answer, 0, 1);
		gp.add(character, 2, 1);
		gp.add(contains,0 , 2);
		gp.add(contains_ans, 2, 2);
		gp.add(allsame, 0, 3);
		gp.add(allsame_ans, 2, 3);
		gp.add(reverse, 0, 4);
		gp.add(reverse_ans, 2, 4);
		gp.add(count, 0, 5);
		gp.add(count_ans, 2, 5);
		gp.add(btnCalc, 1, 6);
        primaryStage.setScene(sc);
        primaryStage.show();
	
	}
	public static void main(String[] args)
	{
		launch(args);
	}
	
}
