package junittest;

import static org.junit.Assert.*;
import org.junit.Test;
import Lab8.MySet;

public class MySetTester {

	@Test
	public void test1() {
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,3,4,5,6,7};
		int[] my3={1,2,3,4,5,6,7};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet result=my.add(my1);
		String result1=result.toString();
		assertNotNull(result);
		MySet my4=new MySet(my3);
		assertEquals(result1,my4.toString());
	}
	
	@Test
	public void test2() {
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,3,4,5,6,7};
		int[] my3={2};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my4=new MySet(my3);
		MySet result1=my.subtract(my1);
		String result2=result1.toString();
		assertNotNull(result1);
		assertEquals(result2, my4.toString());
		
		}

	@Test
	public void test3() {
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,3,4,5,6,7};
		int[] my3={2,6,7};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my4=new MySet(my3);
		MySet result1=my.multiply(my1);
		String result2=result1.toString();
		assertNotNull(result1);
		assertEquals(result2,my4.toString());
		}
	

	@Test
	public void test4() {
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,3,4,5,6,7};
		int[]  my3={1,3,4,5};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my4=new MySet(my3);
		MySet result1=my.divide(my1);
		assertNotNull(result1);
		assertEquals(result1.toString(),my4.toString());
		}

	@Test
	public void test5() {
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,3,4,5,6,7};
		int[] my3={1,2,3,4,5};
		MySet my=new MySet(myarray);
		MySet my4=new MySet(my3);
		assertNotNull(my);
		assertEquals(my.toString(), my4.toString());
		}


	@Test
	public void test6() {
		//int[] myarray={1,2,3,4,5};
		int[] myarray1={1,3,4,5,6,7,5,4};
		int[] my3={1,3,4,5,6,7};
		MySet my1=new MySet(myarray1);
		MySet my4=new MySet(my3);
		assertNotNull(my1);
		assertEquals(my1.toString(), my4.toString());
		}

	@Test
	public void test7() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,2,3,4,5};
		int[] my3={1,2,3,4,5};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.add(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test8() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,2,3,4,5};
		int[] my3={};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.subtract(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}

	@Test
	public void test9() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,2,3,4,5};
		int[] my3={};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.multiply(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}
	
	@Test
	public void test10() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={1,2,3,4,5};
		int[] my3={1,2,3,4,5};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.divide(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test11() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={};
		int[] my3={1,2,3,4,5};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.add(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test12() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={};
		int[] my3={1,2,3,4,5};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.subtract(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}


	@Test
	public void test13() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={};
		int[] my3={1,2,3,4,5};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.multiply(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test14() {
		
		int[] myarray={1,2,3,4,5};
		int[] myarray1={};
		int[] my3={};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.divide(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}

	@Test
	public void test15() {
		
		int[] myarray={};
		int[] myarray1={};
		int[] my3={};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.add(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}
	
	@Test
	public void test16() {
		
		int[] myarray={};
		int[] myarray1={};
		int[] my3={};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.subtract(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}

	@Test
	public void test17() {
		
		int[] myarray={};
		int[] myarray1={};
		int[] my3={};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.multiply(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}

	@Test
	public void test18() {
		
		int[] myarray={};
		int[] myarray1={};
		int[] my3={};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.divide(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my2);
		assertEquals(my4,me.toString());
		}

	@Test
	public void test19() {
		
		int[] myarray={1,1};
		//int[] myarray1={};
		int[] my3={1};
		MySet my=new MySet(myarray);
		//MySet my1=new MySet(myarray1);
		//MySet my2=my.multiply(my1);
		MySet me = new MySet(my3);
		String my4 = my.toString();
		assertNotNull(my);
		assertEquals(my4,me.toString());
		}

	@Test
	public void test20() {
		
		int[] myarray={};
		//int[] myarray1={};
		int[] my3={};
		MySet my=new MySet(myarray);
		//MySet my1=new MySet(myarray1);
		//MySet my2=my.multiply(my1);
		MySet me = new MySet(my3);
		String my4 = my.toString();
		assertNotNull(my);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test21() {
		
		int[] myarray={-1,-2,-3,-4,-5};
		int[] myarray1={1,2,-3,-4};
		int[] my3={-1,-2,-3,-4,-5,1,2};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.add(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my4);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test22() {
		
		int[] myarray={-1,-2,-3,-4,-5};
		int[] myarray1={1,2,-3,-4};
		int[] my3={-1,-2,-5};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.subtract(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my4);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test23() {
		
		int[] myarray={-1,-2,-3,-4,-5};
		int[] myarray1={1,2,-3,-4};
		int[] my3={-1,-2,-5,1,2};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.multiply(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my4);
		assertEquals(my4,me.toString());
		}
	
	
	@Test
	public void test24() {
		
		int[] myarray={-1,-2,-3,-4,-5};
		int[] myarray1={1,2,-3,-4};
		int[] my3={-3,-4};
		MySet my=new MySet(myarray);
		MySet my1=new MySet(myarray1);
		MySet my2=my.divide(my1);
		MySet me = new MySet(my3);
		String my4 = my2.toString();
		assertNotNull(my4);
		assertEquals(my4,me.toString());
		}
	

	@Test
	public void test25() {
		int[] myarray={1,2,3,4,5};
		MySet my=new MySet(myarray);
		assertNotNull(my.toString());
			}
	
	@Test
	public void test26() {
		int[] myarray1={1,3,4,5,6,7};
		MySet my1=new MySet(myarray1);
		assertNotNull(my1.toString());
		
		}

	@Test
	public void test27() {
		int[] my3={2,6,7};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}
	

	@Test
	public void test28() {
		int[]  my3={1,3,4,5};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}

	@Test
	public void test29() {
		int[]  my3={1,3,4,5};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}


	@Test
	public void test30() {
		//int[] myarray={1,2,3,4,5};
		int[]  my3={1,3,4,5,6,7};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}

	@Test
	public void test31() {
		
		int[]  my3={1,2,3,4,5};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}
	

	@Test
	public void test32() {
		
		int[]  my3={};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}

	@Test
	public void test33() {
		
		int[]  my3={};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}
	
	@Test
	public void test34() {
		
		int[]  my3={1,2,3,4,5};
		MySet my4=new MySet(my3);
		assertNotNull(my4.toString());
		}
	

	@Test
	public void test35() {
		
		int[] my3={1};
		assertNotNull(my3.toString());
		}
	


	
	
	

	@Test
	public void test36() {
		
		int[] my3={-1,-2,-3,-4,-5,1,2};
		assertNotNull(my3.toString());
		}
	

	@Test
	public void test37() {
		
		int[] my3={-1,-2,-5,1,2};
		assertNotNull(my3.toString());
			}
	

	@Test
	public void test38() {
		
		int[] my3={-3,-4};
		assertNotNull(my3.toString());
		}
	
	

	
	
}
