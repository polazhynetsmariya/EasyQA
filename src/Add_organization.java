//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by S&M on 2/7/2017.
// */
//public class Add_organization {
//    @Test
//    public void main() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        String baseUrl = "https://app.geteasyqa.com";
//        driver.get(baseUrl + "/users/sign_in");
//        driver.findElement(By.id("user_email")).clear();
//        driver.findElement(By.id("user_email")).sendKeys("maria.polazhynets@thinkmobiles.com");
//        driver.findElement(By.id("user_password")).click();
//        driver.findElement(By.id("user_password")).clear();
//        driver.findElement(By.id("user_password")).sendKeys("28081989cfif");
//        driver.findElement(By.name("commit")).click();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
//        driver.findElement(By.linkText("Add organization")).click();
//        driver.findElement(By.id("organization_title")).clear();
//        driver.findElement(By.id("organization_title")).sendKeys("Sparkd");
//        driver.findElement(By.name("commit")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a.log_out")).click();
//        driver.close();
//
//    }
//}