package lab5;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AttackMonitor {

	ArrayList<MonsterAttack> monster=new ArrayList<MonsterAttack>();
	
	int id,day,month,year,victims,deleteid;
	String name ,location,date,stringid,stringvictim;
	MonsterAttack ma=new MonsterAttack(id,month,day,year,name,location,victims);
	//String[] options={"OK", "Cancel"};
	public void monitor() throws FileNotFoundException
	{
		String[] options={"Add a Monster","List Monsters","Drop A Monster","Write to File","read from file","Quit"};
		int option;
		do
		{
			option=JOptionPane.showOptionDialog(null, "Main Menu","Main Menu", 0, JOptionPane.QUESTION_MESSAGE,null, options, null);
			switch (option)
			{
			case 0:
				addMonsterAttack();
				break;
			case 1:
				listmonsters();
				break;
			case 2:
				dropMonster();
				break;
			case 3:
				writetofile();
				break;
			case 4:
				readfile();
				break;
			case 5:
				break;			
			}
		}while(option!=5);
	}
	
	public void readfile() throws FileNotFoundException
	{
		int id,victims;
		String name,location,lines;
		String[] fields,dates;
		
		monster.clear();
		String file=JOptionPane.showInputDialog("Enter the path of the file");
		while(file.trim().length()==0)
		{
			file=JOptionPane.showInputDialog("Enter the path of the file");
		}
		File inputFile = new File(file);
		Scanner filereader = new Scanner(inputFile);
		
		while(filereader.hasNext())
		{
			lines=filereader.nextLine();
			fields=lines.split(",");
			id=Integer.parseInt(fields[0]);
			//date=fields[1];
			dates=fields[1].split("/");
			month=Integer.parseInt(dates[0]);
			day=Integer.parseInt(dates[1]);
			year=Integer.parseInt(dates[2]);
			name=fields[2];
			location=fields[3];
			victims=Integer.parseInt(fields[4]);
			monster.add(new MonsterAttack(id, day,month,year, name, location, victims));
		}
		
		StringBuilder reader=new StringBuilder();
	for(int i=0;i<monster.size();i++)
	{
		reader.append(monster.get(i).newString());
		reader.append("\n");
	}
	JOptionPane.showMessageDialog(null,reader.toString());
		
		filereader.close();
		
	
	}
	public void writetofile() throws FileNotFoundException
	{
		//System.out.println("Enter the file path");
	String files=JOptionPane.showInputDialog("Enter the path of the file");
	while(files.trim().length()==0)
	{
	files=JOptionPane.showInputDialog("Enter the path of the file");
	}
	File outputfile=new File(files);
		PrintWriter printwriter=new PrintWriter(outputfile);
		StringBuilder writer=new StringBuilder();
		
		
		for(int i=0;i<monster.size();i++)
		{
			writer.append(monster.get(i).getAttackId());
			writer.append(",");
			writer.append(monster.get(i).getAttackDay() + "/" + monster.get(i).getAttackMonth() + "/" + monster.get(i).getAttackYear());
			writer.append(",");
			writer.append(monster.get(i).getAttackName());
			writer.append(",");
			writer.append(monster.get(i).getAttackLocation());
			writer.append(",");
			writer.append(monster.get(i).getAttackVictims());
			writer.append("\n");
		}
		printwriter.write(writer.toString());
		printwriter.close();
	}
	
	
	public void addMonsterAttack()
	{
	
	  stringid=JOptionPane.showInputDialog("Enter the id of the monster");
	 
	  
		while(stringid.trim().length()==0)
		{
			stringid=JOptionPane.showInputDialog("Enter the id of the monster");
				
		}
		
		
		id=Integer.parseInt(stringid);
		
		date=JOptionPane.showInputDialog("Enter the date in MM/DD/YYYY format");
		
		while(date.trim().length()==0)
		{
			date=JOptionPane.showInputDialog("Enter the date in MM/DD/YYYY format");
			
		}
		String seperator="[/]";
		String[] seperate=date.split(seperator);
		month=Integer.parseInt(seperate[0]);
		day=Integer.parseInt(seperate[1]);
		year=Integer.parseInt(seperate[2]);
		
		name=JOptionPane.showInputDialog("Enter the name of the Monster");
		
		while(name.trim().length()==0)
		{
			name=JOptionPane.showInputDialog("Enter the name of the Monster");
		}
		
		location=JOptionPane.showInputDialog("Enter the location");
		while(location.trim().length()==0)
		{
			location=JOptionPane.showInputDialog("Enter the location");
		}
		
		stringvictim=JOptionPane.showInputDialog("Enter the number of victims");
		while(stringvictim.trim().length()==0)			
		{
			stringvictim=JOptionPane.showInputDialog("Enter the number of victims");
		}
		victims=Integer.parseInt(stringvictim);
		monster.add(new MonsterAttack(id,month,day,year,name,location,victims));
		JOptionPane.showMessageDialog(null, new MonsterAttack(id,month,day,year,name,location,victims).toString());
		
	}
	
	public void listmonsters()
	{
	     JOptionPane.showMessageDialog(null,monster.toString());			
	}
	
	
	public void dropMonster()
	{
		String deletestring=JOptionPane.showInputDialog("Enter the id to be deleted");
		while(deletestring.trim().length()==0)
		{
			deletestring=JOptionPane.showInputDialog("Enter the id to be deleted");
		}
		deleteid=Integer.parseInt(deletestring);
		
		 for(int i=0;i<monster.size();i++)
	     {
	    	 if(deleteid==monster.get(i).attackid)
	    	 {
	    		 monster.remove(i);
	    	 }
	     }	
		 
	}
	
	
}
