 import org.openqa.selenium.firefox.FirefoxDriver;  
 import org.openqa.selenium.WebDriver;  
 public class GoogleHelloWorld  
 {  
  public static WebDriver driver;  

  public static void main( String[] args )  
  {  

   System.out.println("starting selenium web driver");  
   driver = new FirefoxDriver();  
   driver.get("https://www.google.com/");  // this open a browser :D

   try{  
    Thread.sleep(2000);  
   }catch(Exception e){}  

   driver.close();  
   driver.quit();  
  }  
 } 