import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Execution {

    private WebDriver driver;
    private static PageLogin Login;
    private static PageHome home;
    String URL = "https://www.demoblaze.com/index.html";
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        Login = new PageLogin(driver);
        home = new PageHome(driver);
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
    @Test
//    public void buyProducts(){
//        Login.hacerlogin("jaison0317","123456");
//        home.buyProducts();
//    }
    @Test
    public void aboutUS(){
        home.aboutUS();
    }
    @Test
    public void contactUS(){
        home.contactUS("jaison0317@gmail.com","Jaison","Prueba");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
