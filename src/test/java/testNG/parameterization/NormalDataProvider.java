package testNG.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NormalDataProvider {

    public static WebDriver driver;

    @DataProvider(name = "Test Data")
    public Object[][] dataProviderFunction(){
        return new Object[][]{
                {"Selenium","Pune"},
                {"Selenium","Kolhapur"},
                {"Selenium","Mumbai"},
                {"Selenium","Nagpur"}
        };
    }
    @Test(dataProvider ="Test Data" )
    public void verifyParameter(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys(courseName +" "+ cityName);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();

    }
}
