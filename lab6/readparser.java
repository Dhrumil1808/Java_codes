package lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class readparser {

	static List<Lab6_read> read=new ArrayList<Lab6_read>();
     
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
          Lab6 lab6=new Lab6();
          lab6.writefile();
          readfile();
          for(Lab6_read r:read)
          {
        	  System.out.println(r.toString());
          }
          
          	}
	
	public static void readfile() throws FileNotFoundException
	{
		int accountid,zipcode,balance;
		long AccountNumber;
		String branchname, ApplicantName, AccountType,emailid,line;
		String[] fields;
		try
		{
			System.out.println("Enter a filepath to read from ");
			Scanner in = new Scanner(System.in);
			File inFile = new File(in.next()); // File to read from.
			Scanner freader = new Scanner(inFile);
			freader.nextLine();
			
			while(freader.hasNextLine())
			{
				line=freader.nextLine();
				fields=line.split(",");
				accountid=Integer.parseInt(fields[0]);
				branchname=fields[1];
				ApplicantName=fields[2];
				AccountType=fields[3];
				//System.out.println(fields[4]);
				AccountNumber=Long.parseLong(fields[4]);
				balance=Integer.parseInt(fields[5]);
				emailid=fields[6];
				zipcode=Integer.parseInt(fields[7]);
				read.add(new Lab6_read(accountid,branchname,ApplicantName,AccountType,AccountNumber,balance,emailid,zipcode));
			}
			
			
		}
		catch(IOException e)
		{
			System.err.println(e);
			System.exit(1);
		}
	}

}
