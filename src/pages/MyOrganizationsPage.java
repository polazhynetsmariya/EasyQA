package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

/**
 * Created by S&M on 2/16/2017.
 */
public class MyOrganizationsPage {
    public void FindAndOpenOrganization(WebDriver driver, String _organization_title){
        driver.findElement(By.linkText(_organization_title)).click();
    }

    public void ClickAddOrganization(WebDriver driver){
        driver.findElement(By.linkText("Add organization")).click();
    }
}
