package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLogoutPage {
    public WebElement userName;
    public WebElement password;
    public WebElement loginButton;
    public String login;
    public String pass;


    public void login(WebDriver driver, String _login, String _password){
        String baseUrl = "https://app.geteasyqa.com";
        driver.get(baseUrl + "/users/sign_in");
        userName = driver.findElement(By.xpath(".//*[@id='user_email']"));
        password = driver.findElement(By.id("user_password"));
        userName.sendKeys(_login);
        password.sendKeys(_password);
        loginButton = driver.findElement(By.xpath(".//*[@id='new_user']/input[2]"));
        loginButton.click();}

    public void loginPositive(WebDriver driver){
        login = "maria.polazhynets@thinkmobiles.com";
        pass = "28081989cfif";
        login(driver,login, pass);}

    public void loginNegative(WebDriver driver) throws InterruptedException {
        login = "user";
        pass = "user";
        login(driver,login, pass);
        Thread.sleep(5000);

    }
    public void loginEmpty(WebDriver driver) throws InterruptedException {
        login = "";
        pass = "";
        login(driver,login, pass);
        Thread.sleep(5000);
        WebElement errorMessage = driver.findElement(By.className("message"));}

    public void logoutTest(WebDriver driver) throws InterruptedException {
        login = "maria.polazhynets@thinkmobiles.com";
        pass = "28081989cfif";
        login(driver,login, pass);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".log_out .svg")).click();
        Thread.sleep(5000);

    }

}

