import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rdval\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement FName = driver.findElement(By.id("first-name"));
        FName.sendKeys("Roberto");

        WebElement Lname = driver.findElement(By.id("last-name"));
        Lname.sendKeys("Dagostini");

        WebElement Jtitle = driver.findElement(By.id("job-title"));
        Jtitle.sendKeys("QA tester");

        WebElement Gschool = driver.findElement(By.xpath("//*[@id=\"radio-button-3\"]"));
        Gschool.click();

        WebElement Smale = driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]"));
        Smale.click();

        WebElement Ydropdown = driver.findElement(By.id("select-menu"));
        Ydropdown.click();

        WebElement TwoFour = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]"));
        TwoFour.click();

        WebElement DateDrop = driver.findElement(By.id("datepicker"));
        DateDrop.sendKeys("05/22/2024");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        WebElement SubmitButton = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        SubmitButton.click();

        WebDriverWait Wait = new WebDriverWait(Driver, 30);
        WebElement alert = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        String alertText = alert.getText();



        driver.quit();






    }
}
