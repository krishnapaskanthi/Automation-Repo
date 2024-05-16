package testNG.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    public static WebDriver driver;

    @Parameters({"browserName"})

    @BeforeMethod
    public void beforeMethodAnnotation(String browserName){
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions =new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.drive","C:\\Users\\abhi\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
             driver =new FirefoxDriver(firefoxOptions);
            driver.get("https://www.google.com/");

        }else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.gecko.drive","C:\\Users\\abhi\\Downloads\\edgedriver_win32\\msedgedriver.exe");
            driver =new EdgeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();

        }else {
            throw new RuntimeException("Please Select The Correct browser Name");
        }
    }
    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyParameter(String courseName, String cityName) throws InterruptedException {

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys(courseName +" "+ cityName);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();

    }
}
