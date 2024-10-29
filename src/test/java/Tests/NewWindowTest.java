package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class NewWindowTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }
    @Test
    public void userCanOpenNewWindow() {
        String homePageUrl = driver.getCurrentUrl();
        String expectedURL = "https://the-internet.herokuapp.com/windows/new";
        homepagePage.clickOnMultipleWindowsPageLink();
        Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
        Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);
        openingWindowPage.clickOnClickHereButton();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        System.out.println(driver.getCurrentUrl());
        WebElement newWindowMessage = driver.findElement(By.className("example"));
        Assert.assertTrue(newWindowMessage.isDisplayed());

    }
}
