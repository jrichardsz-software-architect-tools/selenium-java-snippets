package com.regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class RegularExpressionGroupTest
{

  @BeforeClass
	public void oneTimeSetUp() {
    System.out.println("###############################");
    System.out.println("Tets: "+RegularExpressionGroupTest.class);
    System.out.println("###############################");
    System.out.println("\n");
	}    
  
    @Test(groups = { "include-test-one" })
    public void testMethodOne() {
        System.out.println("Test method one");
    }
 
    @Test(groups = { "include-test-two" })
    public void testMethodTwo() {
        System.out.println("Test method two");
    }
 
    @Test(groups = { "test-one-exclude" })
    public void testMethodThree() {
        System.out.println("Test method three");
    }
 
    @Test(groups = { "test-two-exclude" })
    public void testMethodFour() {
        System.out.println("Test method Four");
    }
}