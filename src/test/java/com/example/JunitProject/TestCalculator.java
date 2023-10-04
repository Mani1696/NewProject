package com.example.JunitProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	Calculator c=new Calculator();
	@Before
	public void hi() {
		System.out.println("Hello");
	}
	@org.junit.Test
	public void testAdd() {
		c.add();
	}
	@org.junit.Test
	public void testSub() {
		c.sub(10, 3);
	}
//	@org.junit.Test
//	public void checkAddSub() {
//		assertSame(c.add(),c.sub(41,10));
//	}
	@org.junit.Test
	public void testMulti() {
		System.out.println(c.multi(18,21));
	}
	@org.junit.Test
	public void testDivi() {
		System.out.println(c.divi());
	}
	@org.junit.Test
	public void testfMin() {
		Sample s=new Sample();
		int[] ab= {10,5,15,20};
		assertEquals(s.findMin(ab),5);
	}
	@org.junit.Test 
	public void testMax() {
		Sample s=new Sample();
		String[] ab= {"Sekar","Aravind","Ajay","Communication"};
		assertSame(s.findMaxLength(ab),"Communication");
	}
	@After
	public void display() {
		System.out.println("bye");
	}

}
