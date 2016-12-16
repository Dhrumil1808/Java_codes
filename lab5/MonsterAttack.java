package lab5;

public class MonsterAttack {

	int attackid,attackday,attackmonth,attackyear,attackvictims;
	String attackname,attacklocation;
	public MonsterAttack(int attackid,int attackday,int attackmonth, int attackyear,String attackname, String attacklocation,int attackvictims)
	{
		this.attackid=attackid;
		this.attackday=attackday;
		this.attackmonth=attackmonth;
		this.attackyear=attackyear;
		this.attackname=attackname;
		this.attacklocation=attacklocation;
		this.attackvictims=attackvictims;
	}
	public int getAttackId() {
		return attackid;
	}
	public void setAttackId(int attackid) {
		this.attackid = attackid;
	}
	public int getAttackDay() {
		return attackday;
	}
	public void setAttackDay(int attackday) {
		this.attackday = attackday;
	}
	public int getAttackMonth() {
		return attackmonth;
	}
	public void setAttackMonth(int attackmonth) {
		this.attackmonth = attackmonth;
	}
	public int getAttackYear() {
		return attackyear;
	}
	public void setAttackYear(int attackyear) {
		this.attackyear = attackyear;
	}
	public int getAttackVictims() {
		return attackvictims;
	}
	public void setAttackVictims(int attackvictims) {
		this.attackvictims = attackvictims;
	}
	public String getAttackName() {
		return attackname;
	}
	public void setAttackName(String attackname) {
		this.attackname = attackname;
	}
	public String getAttackLocation() {
		return attacklocation;
	}
	public void setAttackLocation(String attacklocation) {
		this.attacklocation = attacklocation;
	}
	
	
	public String toString()
	{
		return "Attack # " + getAttackId() + " occured on " + getAttackMonth() + "/"+ getAttackDay() + "/"+ getAttackYear() +". "+ getAttackName() +" attacked " + getAttackLocation() + ", resulting in " + this.getAttackVictims() + " tragic families"  ; 
	}
	public String newString()
	{
		return getAttackId() + " , " + getAttackMonth() +"/" + getAttackDay()  + "/" + getAttackYear() + " , " + getAttackName() + " , " + getAttackLocation() + " , " + getAttackVictims();
	}
}
