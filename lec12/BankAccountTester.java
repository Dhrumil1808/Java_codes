package lec12;
import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args)
	{
		BankAccount acc1=new BankAccount();
		boolean done=false;
		while(!done)
		{
			System.out.println("What do you want to do :\n" + "1. Create new bank account\n" + "2. Deposit \n"+ "3. Withdraw\n" +"4. Display Account\n"+ "5 Exit Program \n");
			Scanner input=new Scanner(System.in);
			int choice=input.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("could you please insert your id \t");
				int newId=input.nextInt();
				System.out.println("Insert your balance \t");
				double newBalance=input.nextInt();
				System.out.println("Insert interest rate");
				double newInterestRate=input.nextInt();
				acc1.setId(newId);
				acc1.setBalance(newBalance);
				acc1.setAnnualInterestRate(newInterestRate);
				System.out.println(acc1);
				//acc1.BankAccount(newId,newBalance,newInterestRate);
				break;
			case 4:
				System.out.println("your Id is \t" + acc1.getId());
				System.out.println("your current balance is \t"+acc1.getBalance());
				System.out.println("your annual interest rate is \t"+ acc1.getAnnualInterestRate());
				break;
			case 5:
				done=true;
				break;
			}
		
		}
		
	}
}
