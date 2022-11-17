package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		String a = "Ayush";
		String b = "Sagar";
		String c = "AyushSagar";
		String result = Junit.addString(a,b);
		//fail("Not yet implemented");
		assertEquals (c,result);
	}

}
