package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSample {
	
	Calculator calculator;
	
	@BeforeClass
	public static void befeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("after class");
	}
	@Before
	public void setUp()
	{
		calculator = new Calculator();
		
		System.out.println("Before test method");
	}
	
	@After
	public void setDown()
	{
		calculator = null;
		System.out.println("After test method");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Test method");
		assertEquals(70, calculator.add(30, 40));
		
		
	}
	
	@Test
	public void testAdd1()
	{
		System.out.println("Test method");
		assertEquals(70, calculator.add(30, 40));
		
		
	}

}
