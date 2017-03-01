package pages;

import org.openqa.selenium.*;

import java.util.List;

import static org.hamcrest.Matchers.contains;

/**
 * Created by S&M on 2/16/2017.
 */
public class MyOrganizationsPage {
    public void FindAndOpenOrganization(WebDriver driver, String _organization_title) throws InterruptedException {
        List<WebElement> organization = (List<WebElement>) ((JavascriptExecutor) driver).executeScript("return $('a:contains(" + _organization_title + ")').first()");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", organization.get(0));
        Thread.sleep(3000);
        organization.get(0).click();
    }
    public void ClickAddOrganization(WebDriver driver)
    {
        driver.findElement(By.linkText("Add organization")).click();
    }

    public void CreateNewOrganization(WebDriver driver)
    {
        driver.findElement(By.cssSelector("[href='/organizations/new']")).click();
    }
}