import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExample {

  public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "/../selenium/chromedriver");
    
    // Initialize browser
    WebDriver driver = new ChromeDriver();
    
    // Open Google
    driver.get("http://www.google.com");
    
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("jrichardsz");    

    // Close browser
    driver.close();
  }

}
