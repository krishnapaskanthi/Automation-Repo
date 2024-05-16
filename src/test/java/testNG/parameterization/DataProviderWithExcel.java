package testNG.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {
    public static WebDriver driver;
    @DataProvider(name = "Test Data")
    public Object[][] dataProviderWithExcel() throws IOException {
       Object[][]arrObj= getDataFromExcel("C:\\Users\\abhi\\Desktop\\Dataprovider.xlsx","testSheet1");
       return arrObj;
    }
    public String[][] getDataFromExcel(String filepath,String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filepath);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow  rows = sheet.getRow(0);
        int noOFRows = sheet.getPhysicalNumberOfRows();
        int noOfCOl= rows.getLastCellNum();
        Cell cell;
        String [][] data= new String[noOFRows-1][noOfCOl];
        for (int i =1;i< noOFRows;i++){
            for (int j =0; j< noOfCOl;j++){
                rows= sheet.getRow(i);
                cell = rows.getCell(j);

                data[i-1][j]= cell.getStringCellValue();
            }
        }
        return data;
    }
        @Test(dataProvider ="Test Data" )
    public void verifyParameter(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(courseName + " " + cityName);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
