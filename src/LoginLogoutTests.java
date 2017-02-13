//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//public class LoginLogoutTests {
//    private WebElement userName;
//    private WebElement password;
//    private WebElement loginButton;
//    private WebDriver driver;
//    private String login;
//    private String pass;
//
//    @BeforeMethod
//    public void SetUp(){
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    public void loginPositive(){
//        login = "maria.polazhynets@thinkmobiles.com";
//        pass = "28081989cfif";
//        login(login, pass);
//    }
//    public void login(String _login, String _password){
//        String baseUrl = "https://app.geteasyqa.com";
//        driver.get(baseUrl + "/users/sign_in");
//        userName = driver.findElement(By.xpath(".//*[@id='user_email']"));
//        password = driver.findElement(By.id("user_password"));
//        userName.sendKeys(_login);
//        password.sendKeys(_password);
//        loginButton = driver.findElement(By.xpath(".//*[@id='new_user']/input[2]"));
//        loginButton.click();
//    }
//    @Test
//    public void loginPositiveTest() throws InterruptedException {
//        loginPositive();
//        Thread.sleep(5000);
//        assertTrue(driver.findElement(By.className("username")).isDisplayed(), "user wasn't logged in");
//    }
//    @Test
//    public void loginNegative() throws InterruptedException {
//        login = "user";
//        pass = "user";
//        login(login, pass);
//        Thread.sleep(5000);
//        assertTrue(loginButton.isDisplayed(),"user was navigated to some unknown page");
//    }
//    @Test
//    public void loginEmpty() throws InterruptedException {
//        login = "";
//        pass = "";
//        login(login, pass);
//        Thread.sleep(5000);
//        WebElement errorMessage = driver.findElement(By.className("message"));
//        assertTrue(errorMessage.getText().contains("Invalid Email or password."),
//                "Invalid Email or password. - was not found on the page");
//    }
//    @Test
//    public void logoutTest() throws InterruptedException {
//        loginPositive();
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector(".log_out .svg")).click();
//        Thread.sleep(5000);
//        assertTrue(driver.findElement(By.cssSelector(".sign-title")).isDisplayed(), "sign in fields weren't displayed");
//    }
//
//    @AfterMethod
//    public void tearDown() throws Exception {
//        driver.quit();
//    }
//}
