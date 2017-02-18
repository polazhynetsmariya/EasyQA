package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by S&M on 2/14/2017.
 */
public class AddOrganizationPage {

    public void CreateOrganization(WebDriver driver, String _organization_title) {
        driver.findElement(By.cssSelector("[name='organization[title]']")).sendKeys(_organization_title);
        driver.findElement(By.cssSelector("[value='Add New Organization']")).click();
    }
}
