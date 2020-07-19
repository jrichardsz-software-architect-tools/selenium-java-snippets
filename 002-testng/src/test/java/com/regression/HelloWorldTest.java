package com.regression;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class HelloWorldTest {
  
  @BeforeClass
	public void oneTimeSetUp() {
    System.out.println("###############################");
    System.out.println("Tets: "+HelloWorldTest.class);
    System.out.println("###############################");
    System.out.println("\n");
	}  
    
  @Test
  public void testHelloWorld() {
      assertEquals(true, true);
  }
}