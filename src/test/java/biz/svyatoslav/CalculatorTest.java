package biz.svyatoslav;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
    @Test
    public void test1(){
        ChromeDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by = By.xpath(xpath);
        webDriver.findElement(by);

        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }
}