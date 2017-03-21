package exampleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New1Test {
  
    private WebDriver driver; 
    @Test
    public void testEasy()
    {
        driver.get("http://demo.guru99.com/selenium/guru99home/");
        String tittle=  driver.getTitle();
        Assert.assertTrue(tittle.contains("Demo Guru99 Page")); 
    }
   
 
    @Test
    public void test1Easy()
    {
        driver.get("http://demo.guru99.com/selenium/guru99home/");
        String tittle=  driver.toString();
        System.out.println(tittle); 
        
    }
    
    
  @BeforeTest
  public void beforeTest() {
      driver= new FirefoxDriver();       
  }

  @AfterTest
  public void afterTest() {
      driver.quit();
  }

}
