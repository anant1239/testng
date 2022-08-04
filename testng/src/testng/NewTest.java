package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	//first
	 @BeforeTest
	  public void beforeTest1(){
		 System.out.println("This is the first step that will execute");
	  }
	 
	 @BeforeClass
	  public void beforeClass1() {
		 System.out.println("This is the second step which will execute");
	  }
// This will execute before every Test
	
	 @BeforeMethod
	  public void beforeMethod() {
		 System.out.println("This will execute before every Test Case");
	  }
	//Test is a method//so before it executes any @Testmethod it will run Beforemethod
	
	
  @Test
  public void f() {
	  System.out.println("This is the first test 1");
  }
  
  @Test
  public void b() {
	  System.out.println("This is my test case 2");
	  
  }
 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every Test Case 2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("At the end of the Class");
  }
 

  @AfterTest
  public void afterTest() {
	  System.out.println("This is at the end of the test");
  }

}
