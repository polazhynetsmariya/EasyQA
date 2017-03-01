package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public void AddProjectToOrganization(WebDriver driver, String _project_title, String _organization_title) throws InterruptedException {
        driver.findElement(By.cssSelector("a[href*=projects] span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".card-tabs-list-item a[href*='projects']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[href='/projects/new?type=Card']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#myModal .dd-pointer")).click();
        Thread.sleep(2000);
        List<WebElement> organization = (List<WebElement>) ((JavascriptExecutor) driver).executeScript("return $('.dd-option-text:contains(" + _organization_title + ")')");
        organization.get(1).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[name='project[title]']")).sendKeys(_project_title);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[value='Add New Project']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".close")).click();
    }

    public void AddMemberToOrganization(WebDriver driver, String _email_address) throws InterruptedException {
        driver.findElement(By.cssSelector("a[href*=members] span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href*=invitation]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[name='emails']")).sendKeys(_email_address);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[value='Add Members']")).click();
    }
}

