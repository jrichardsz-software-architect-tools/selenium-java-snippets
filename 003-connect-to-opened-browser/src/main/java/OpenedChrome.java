import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenedChrome {

  public static void main(String[] args) throws InterruptedException {

    String imageFilePath = "/tmp/deleteme/some_image.png";

    System.setProperty("webdriver.chrome.driver", "/../selenium/chromedriver");

    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("debuggerAddress", "localhost:9222");

    // Initialize browser
    WebDriver driver = new ChromeDriver(options);

    File f = new File(imageFilePath);
    while (true) {
      if (f.exists() && !f.isDirectory()) {
        
        try {
          performSearch(driver, imageFilePath);
        }catch(Exception e) {
          System.out.println(e.toString());
        }
        
        if (f.delete()) {
          System.out.println("File deleted successfully");
        } else {
          System.out.println("Failed to delete the file");
        }
      }
      Thread.sleep(2000);
    }

    // Close browser
    // driver.close();
  }

  public static void performSearch(WebDriver driver, String localImageFilePath) {
    driver.get("https://www.google.com.pe/imghp?hl=en&tab=ri&ogbl");

    driver.findElement(By.className("LM8x9c")).click();
    driver.findElement(By.cssSelector("a.iOGqzf.H4qWMc.aXIg1b")).click();

    driver.findElement(By.cssSelector("input[name=\"encoded_image\"]"))
        .sendKeys(localImageFilePath);
  }

}
