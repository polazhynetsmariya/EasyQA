package tests;

import methods.LoginLogoutPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by S&M on 2/13/2017.
 */
public class AddOrganization extends BaseTest {
    @Test
    public void AddOrganization() throws InterruptedException {
        LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
        loginLogoutPage.loginPositive(driver);
        Thread.sleep(5000);
        assertTrue(driver.findElement(By.className("username")).isDisplayed(), "user wasn't logged in");
    }
}
