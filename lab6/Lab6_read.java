package lab6;

public class Lab6_read {
	
	int accountid,zipcode,balance;
	long AccountNumber;
	String branchname, ApplicantName, AccountType,emailid;
	public Lab6_read(int account_id,String branch_name,String Applicant_Name, String Account_Type,long Account_Number,int Balance,String Emailid,int Zipcode)
	{
	  	this.accountid=account_id;
	  	this.branchname=branch_name;
	  	this.ApplicantName=Applicant_Name;
	  	this.AccountType=Account_Type;
	  	this.balance=Balance;
	  	this.zipcode=Zipcode;
	  	this.emailid=Emailid;
	  	this.AccountNumber=Account_Number;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getApplicantName() {
		return ApplicantName;
	}
	public void setApplicantName(String applicantName) {
		ApplicantName = applicantName;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
        public String toString()
        {
        	return getAccountid() + " , " + getBranchname() + " , " + getApplicantName() + " , " + getAccountType() + " , " + getAccountNumber() + " , " +getBalance() + " , " + getEmailid() + " , " + getZipcode();
        }
}
