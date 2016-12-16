package lec13;

public class ParseDemo {
	public static void main(String args[]) {
		StudentParser parser = new StudentParser();
		try{
			parser.readFile();
		}

		catch (Exception e){e.printStackTrace();}

		parser.showGrades();
	}

}
