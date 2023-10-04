package com.example.JunitProject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertProgram {
	@Test
	public void testAssertEquals() {
		assertEquals(10,10);
	}
	@Test
	public  void testAssertTrue() {
		boolean a=10>7;
		assertTrue(a);
	}
	@Test
	public void testSame() {
		assertSame("Sekar","Sekar");
	}
	@Test
	public void testNull() {
		assertNull(null);
	}
	@Test
	public void testArrayEquals() {
		int[] a= {5,10,15};
		int[] b= {5,10,15};
		assertArrayEquals(a,b);
	}
	@Test
	public void testNotEquals() {
		assertNotEquals(11,15);
	}
	@Test
	public void testFalse() {
		boolean a=10<7;
		assertFalse(a);
	}
	@Test
	public void testNotSame() {
		assertNotSame("gana","Sekar");
	}
	@Test
	public void testNotNull() {
		assertNotNull("Mani");
	}
	

}
