package tests;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import pages.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.testng.Assert.assertTrue;

/**
 * Created by S&M on 2/13/2017.
 */
public class AddOrganizationTest extends BaseTest {
    String _organization_title = "Sparkd";
    DashboardPage dp = new DashboardPage();
    MyOrganizationsPage mop = new MyOrganizationsPage();
    AddOrganizationPage ao = new AddOrganizationPage();

    @BeforeMethod
    public void DeleteOrganization() throws InterruptedException {
        LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
        loginLogoutPage.loginPositive(driver);
        Thread.sleep(2000);
        try {
            dp.OpenMyOrganizations(driver, _organization_title);
            Thread.sleep(2000);
            mop.FindAndOpenOrganization(driver, _organization_title);
            OrganizationPage op = new OrganizationPage();
            Thread.sleep(5000);
            op.DeleteOrganization(driver);
            Thread.sleep(2000);
        } catch (WebDriverException e){}

    }

    @Test
    public void AddOrganizationPositiveTest() throws InterruptedException {
        dp.ClickAddOrganization(driver);
        Thread.sleep(2000);
        ao.CreateOrganization(driver, _organization_title);
        Thread.sleep(2000);
        assertTrue(driver.findElement(By.linkText("Sparkd")).isDisplayed(), "Organization wasn't created");
    }

    @Test
    public void AddOrganizationEmptyTest() throws InterruptedException {
        String errorMessage = "can't be blank";
        dp.ClickAddOrganization(driver);
        Thread.sleep(2000);
        ao.CreateOrganization(driver, "");
        Thread.sleep(2000);
        WebElement errorMessageElement = driver.findElement(By.cssSelector(".message"));
        assertTrue(errorMessageElement.getText().equals(errorMessage), "unexpected error message was displayed");
    }

    @Test
    public void AddOrganizationExisted() throws InterruptedException {
        String errorMessage = "has already been taken";
        dp.ClickAddOrganization(driver);
        Thread.sleep(2000);
        ao.CreateOrganization(driver, _organization_title);
        Thread.sleep(2000);
        mop.ClickAddOrganization(driver);
        Thread.sleep(2000);
        ao.CreateOrganization(driver, _organization_title);
        Thread.sleep(2000);
        WebElement errorMessageElement = driver.findElement(By.cssSelector(".message"));
        assertTrue(errorMessageElement.getText().equals(errorMessage), "unexpected error message was displayed");
    }

    @Test
    public void OrganizationNameLenghtTest() throws InterruptedException {
        _organization_title = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String errorMessage = "is too long (maximum is 150 characters)";
        dp.ClickAddOrganization(driver);
        Thread.sleep(2000);
        ao.CreateOrganization(driver, _organization_title);
        Thread.sleep(2000);
        WebElement errorMessageElement = driver.findElement(By.cssSelector(".message"));
        assertTrue(errorMessageElement.getText().equals(errorMessage), "unexpected error message was displayed");
    }

    @Test
    public void ChangeOrganizationTitleTest() throws InterruptedException {
        String _organization_title = UUID.randomUUID().toString();
        String _NewOrganizationTitle = _organization_title + "!";
        dp.ClickAddOrganization(driver);
        Thread.sleep(2000);
        ao.CreateOrganization(driver, _organization_title);
        Thread.sleep(2000);
        mop.FindAndOpenOrganization(driver,_organization_title);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".card-header-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#organization_title")).sendKeys("!");
        driver.findElement(By.cssSelector("[value='Save changes']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText(_NewOrganizationTitle)).click();
    }

    @Test
    public void CreateNewOrganizationButtonTest() throws InterruptedException {
        mop.CreateNewOrganization(driver);
        Thread.sleep(2000);
        ao.CreateOrganization(driver, _organization_title);
        Thread.sleep(2000);
        assertTrue(driver.findElement(By.linkText("Sparkd")).isDisplayed(), "Organization wasn't created");
    }
}