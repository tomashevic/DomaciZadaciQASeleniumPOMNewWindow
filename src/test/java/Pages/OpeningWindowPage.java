package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpeningWindowPage extends BaseTest {

    WebDriver driver;

    WebElement clickHereButton;

    public OpeningWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getClickHereButton() {
        return driver.findElement(By.linkText("Click Here"));
    }

    public void clickOnClickHereButton() {
        getClickHereButton().click();
    }
}
