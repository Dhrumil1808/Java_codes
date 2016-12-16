package lab6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class Lab6 {

	public void writefile() throws FileNotFoundException {
		// TODO Auto-generated method stub
          
		
		Scanner in=new Scanner(System.in);
		PrintWriter printwriter=new PrintWriter(new File("C:/Users/DHRUMIL/Desktop/test.csv"));
		StringBuilder build=new StringBuilder();
	
		build.append("account Id");
		build.append(",");
		build.append("Branch Name");
		build.append(",");
		build.append("Applicant's Name");
		build.append(",");
		build.append("Account Type");
		build.append(",");
		build.append("Account Number");
		build.append(",");
		build.append("Balance");
		build.append(",");
		build.append("Email_id");
		build.append(",");
		build.append("Zip code");
		build.append("\n");
		
		build.append("1");
		build.append(",");
		build.append("BofA");
		build.append(",");
		build.append("john Doe");
		build.append(",");
		build.append("Savings");
		build.append(",");
		build.append("1234568976");
		build.append(",");
		build.append("100");
		build.append(",");
		build.append("abc@gmail.com");
		build.append(",");
		build.append("12345");
		build.append("\n");
		
		build.append("2");
		build.append(",");
		build.append("Wells Fargo");
		build.append(",");
		build.append("James bond");
		build.append(",");
		build.append("Checkings");
		build.append(",");
		build.append("9632587410");
		build.append(",");
		build.append("1000");
		build.append(",");
		build.append("xyz@yahoo.com");
		build.append(",");
		build.append("89654");
		build.append("\n");
		
		build.append("3");
		build.append(",");
		build.append("Chase");
		build.append(",");
		build.append("Lorem Ipsum");
		build.append(",");
		build.append("Current");
		build.append(",");
		build.append("1254789654");
		build.append(",");
		build.append("2000");
		build.append(",");
		build.append("dfg@gmail.com");
		build.append(",");
		build.append("45632");
		build.append("\n");
		
		build.append("4");
		build.append(",");
		build.append("SelfScore");
		build.append(",");
		build.append("Adams Adams");
		build.append(",");
		build.append("Savings");
		build.append(",");
		build.append("3214789650");
		build.append(",");
		build.append("8520");
		build.append(",");
		build.append("zxcv@yahoo.com");
		build.append(",");
		build.append("12547");
		build.append("\n");
		
		printwriter.write(build.toString());
		printwriter.close();
		
	}

}
