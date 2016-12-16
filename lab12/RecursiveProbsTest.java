package lab12;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RecursiveProbsTest {

	@Test
	public void testRecursiveContainsWithEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertFalse(r.recursiveContains('a', s));
	}
	
	@Test
	public void testRecursiveContainsWithNoOccurrences() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertFalse(r.recursiveContains('z', s));
	}

	@Test
	public void testRecursiveContainsWithOccurrences() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertTrue(r.recursiveContains('a', s));
	}


	@Test
	public void testAllSameWithEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertTrue(r.recursiveAllCharactersSame(s));
		// code the assertion
	}

	@Test
	public void testAllSameWithDifferingCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		// code the assertion
		assertFalse(r.recursiveAllCharactersSame(s));
	}

	@Test
	public void testRecursiveAllSameWithAllSameCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "aaaaaaa";
		// code the assertion
		assertTrue(r.recursiveAllCharactersSame(s));
	}

	@Test
	public void testRecursiveReverseEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		// code the rest of the test
		String s="";
		String o=r.recursiveReverse(s);
		assertEquals(o,s);
	}

	@Test
	public void testReverseNonEmptyString() {
		// code the test
		RecursiveProbs r = new RecursiveProbs();
		// code the rest of the test
		String s="The rain in the Spain falls mainly on the plain";
		String res="nialp eht no ylniam sllaf niapS eht ni niar ehT";
		String o=r.recursiveReverse(s);
		assertEquals(o,res);
		
	}
	
	@Test
	public void testCountWithEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		int count=r.recursiveCount('a', s);
		int b=0;
		assertEquals(Integer.toString(count),Integer.toString(b));
		
	}

	@Test
	public void testCountWithDifferingCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in the Spain falls mainly on the plain";
		int count=r.recursiveCount('a', s);
		int b=5;
		assertEquals(Integer.toString(count),Integer.toString(b));
	
	}

	@Test
	public void testCountWithAllSameCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "aaa";
		int count=r.recursiveCount('a', s);
		int b=3;
		assertEquals(Integer.toString(count),Integer.toString(b));
	
	}

	// supply three tests here for the method recursiveCount(char c, String s)
 
}