package lab9;

public class Fool {
	
	int row,column,index;
	char c;
	
	public Fool(int index,int row,int column,char c)
	{
		this.row=row;
		this.column=column;
		this.c=c;
		this.index=index;
	}
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	
}
