//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
///**
// * Created by S&M on 2/8/2017.
// */
//public class Delete_org {
//    @Test
//    public void main() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        String baseUrl = "https://app.geteasyqa.com";
//        driver.get(baseUrl + "/users/sign_in");
//        Thread.sleep(2000);
//        driver.findElement(By.id("user_email")).clear();
//        driver.findElement(By.id("user_email")).sendKeys("maria.polazhynets@thinkmobiles.com");
//        driver.findElement(By.id("user_password")).click();
//        driver.findElement(By.id("user_password")).clear();
//        driver.findElement(By.id("user_password")).sendKeys("28081989cfif");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("div.sign-form-column")).click();
//        driver.findElement(By.name("commit")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("h2")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Sparkd!")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='organizations-left-menu']/div/ul/li[6]/a")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Delete organization")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("confirm")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a.log_out")).click();
//        driver.close();
//
//    }
//}