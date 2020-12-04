import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void simpleTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svitlana\\Documents\\GITProject\\ChromDriver\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//strong/a"));
        WebElement name1 = browser.findElement(By.xpath("//span/a"));

        Assert.assertEquals(name.getText(), "PlatformaticaQA");
        Assert.assertEquals(name1.getText(), "SergeiDemyanenko");

        Thread.sleep(3000);


        browser.close();
    }
}
