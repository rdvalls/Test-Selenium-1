import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rdval\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement DropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        DropdownMenu.click();

        WebElement Modal = driver.findElement(By.xpath("/html/body/div/div/div/a[11]"));
        Modal.click();



    }
}
