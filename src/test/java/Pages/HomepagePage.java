package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePage extends BaseTest {

    WebDriver driver;

    WebElement multipleWindowsPageLink;


    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMultipleWindowsPageLink() {
        return driver.findElement(By.linkText("Multiple Windows"));
    }
    public void clickOnMultipleWindowsPageLink() {
        getMultipleWindowsPageLink().click();
    }

}
