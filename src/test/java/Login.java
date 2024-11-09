import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

    private WebDriver driver;
    private static PageLogin Login;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        Login = new PageLogin(driver);
    }
    @Test
    public void LogIn(){
        Login.hacerlogin("jaison0317","123456");
    }
    @Test
    public void signUp(){
        Login.signUpUser("prueba","prueba123");
    }
    @Test
    public void logOut(){
        Login.hacerlogin("jaison0317","123456");
        Login.logOut();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
