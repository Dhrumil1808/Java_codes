package test;

import static org.junit.Assert.*;
import org.junit.Test;

import lec17.Crypt;

public class CryptTester {

	@Test
	public void testCryptCreated(){
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNotNull(c);
	}
	
	@Test
	public void testToString(){
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNotNull(c.toString());
	}
}
