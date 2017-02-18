package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by S&M on 2/16/2017.
 */
public class OrganizationPage {
    public void DeleteOrganization(WebDriver driver) throws InterruptedException {
        driver.findElement(By.cssSelector("a[href*=delete_organization] span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href*=destroy_organization_confirm]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#confirm")).click();
        }
    }

