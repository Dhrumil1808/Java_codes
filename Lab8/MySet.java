package Lab8;

import java.util.Arrays;

public class MySet implements MyMath<MySet> {
	int[] array;

	public MySet(int[] array) {
		
		int totalUniqueValues=0;
		loop1:for(int counter=0;counter<array.length;counter++)
		{
			for(int j=0;j<totalUniqueValues;j++)
			{
				if(array[counter]==array[j])
					continue loop1;
			}
			array[totalUniqueValues]=array[counter];
			totalUniqueValues++;
		}
		this.array = Arrays.copyOf(array, totalUniqueValues);
	}

	public int[] getArray() {
		return array;
	}
	
	@Override
	public MySet add(MySet o)
	{
		int[] secondArray=o.getArray();
		int[] result = Arrays.copyOf(array, secondArray.length+array.length);
		System.arraycopy(secondArray, 0,result , array.length, secondArray.length);
		return new MySet(result);
	}

	@Override
	public MySet subtract(MySet o)
	{
		int[] secondArray=o.getArray();
		int totalUniqueValues=0;
		int[] result=Arrays.copyOf(array, array.length);
		loop1:for(int counter=0;counter<result.length;counter++)
		{
			for(int j=0;j<secondArray.length;j++)
			{
				if(result[counter]==secondArray[j])
					continue loop1;
			}
			result[totalUniqueValues]=result[counter];
			totalUniqueValues++;
		}
		return new MySet(Arrays.copyOf(result, totalUniqueValues));
	}

	@Override
	public MySet multiply(MySet o){
		
		int[] firstArray=subtract(o).getArray();
		int[] secondArray=o.subtract(this).getArray();
		int[] result=Arrays.copyOf(firstArray,firstArray.length+secondArray.length);
		System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
		return new MySet(result);
		
	}
	
	@Override
	public MySet divide(MySet o) {
		int[] secondArray=o.getArray();
		int totalUniqueValues=0;
		int[] result=Arrays.copyOf(array, array.length);
		loop1:for(int counter=0;counter<result.length;counter++)
		{
			for(int j=0;j<secondArray.length;j++)
			{
				if(result[counter]==secondArray[j]){
					result[totalUniqueValues]=result[counter];
					totalUniqueValues++;
					continue loop1;
				}
			}
		}
		return new MySet(Arrays.copyOf(result, totalUniqueValues));
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}