import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PullTest {

        @Test
        public void simpleTest() throws InterruptedException {

            WebDriver browser = new ChromeDriver();
            browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
            WebElement name = browser.findElement(By.xpath("//strong/a"));
            WebElement header = browser.findElement(By.xpath("//span[contains(text(),'Pull requests')]"));
            header.click();

            Assert.assertEquals(name.getText(), "PlatformaticaQA");

            Thread.sleep(2800);
       browser.close();
        }
    }

