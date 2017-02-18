package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by S&M on 2/16/2017.
 */
public class DashboardPage {
    public void OpenMyOrganizations(WebDriver driver, String _organization_title){
        driver.findElement(By.cssSelector("a[href='/users/profile/my_organizations']")).click();
    }
    public void ClickAddOrganization(WebDriver driver){
        driver.findElement(By.linkText("Add organization")).click();
    }

}
