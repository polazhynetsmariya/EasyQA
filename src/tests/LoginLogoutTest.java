package tests;

import pages.LoginLogoutPage;
import org.openqa.selenium.By;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.*;

/**
 * Created by S&M on 2/9/2017.
 */
public class LoginLogoutTest extends BaseTest {
    @Test
    public void loginPositiveTest() throws InterruptedException {
        LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
        loginLogoutPage.loginPositive(driver);
        Thread.sleep(5000);
        assertTrue(driver.findElement(By.className("username")).isDisplayed(), "user wasn't logged in");
    }

    @Test
    public void loginNegativeTest() throws InterruptedException {
        LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
        loginLogoutPage.loginNegative(driver);
        Thread.sleep(5000);
        assertTrue(loginLogoutPage.loginButton.isDisplayed(), "user was navigated to some unknown page");
    }
    @Test
    public void loginEmpty() throws InterruptedException {
        LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
        loginLogoutPage.loginEmpty(driver);
        Thread.sleep(5000);
        String errorMessage = driver.findElement(By.className("message")).getText();
        assertTrue(errorMessage.contentEquals("Can`t be blank"));
    }

    @Test
    public void logoutTest()throws InterruptedException{

        LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
        loginLogoutPage.logoutTest(driver);
        Thread.sleep(5000);
        assertTrue(driver.findElement(By.cssSelector(".sign-title")).isDisplayed(), "sign in fields weren't displayed");
    }
}
