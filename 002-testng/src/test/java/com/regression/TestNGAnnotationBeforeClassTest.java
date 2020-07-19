package com.regression;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Example to demonstrate use of @BeforeClass annotation of TestNG framework
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class TestNGAnnotationBeforeClassTest {

	@BeforeClass
	public void oneTimeSetUp() {
    System.out.println("###############################");
    System.out.println("Tets: "+TestNGAnnotationBeforeClassTest.class);
    System.out.println("###############################");
    System.out.println("\n");
		System.out.println("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
	}

	@Test
	public void validateSum() {
		System.out.println("@Test : validateSum()");
		int a = 5;
		int b = 10;
		Assert.assertEquals(a + b, 15);
	}

	@Test
	public void validateDifference() {
		System.out.println("@Test : validateDifference()");
		int a = 5;
		int b = 10;
		Assert.assertEquals(b - a, 5);
	}

}