package com.edu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Classtest {

	@Test
	public void test() {
		System.out.println("Inside test");
		//fail("Not yet implemented");
	}
	@Test
	public void test1() {
		String s="hi";
		System.out.println("Inside test1");
		assertEquals("hello", s);
	}
	@Before
	public void beforestest() {
		System.out.println("before each testcase");
	}
	@After
	public void afterTestCase() {
		System.out.println("after each testcase");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before all the method");
	}


}
