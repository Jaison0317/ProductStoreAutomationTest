import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class PageLogin extends Page{

    @FindBy(xpath = "//input[@id=\"loginusername\"]")
    private WebElement usernameInput;
    @FindBy(xpath = "//input[@id=\"loginpassword\"]")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement btnLogin;
    @FindBy(xpath = "//a[@id=\"login2\"]")
    private WebElement btnSignIn;
    @FindBy(xpath = "//a[contains(text(),'Welcome')]")
    private WebElement labelUserLogged;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    private WebElement btnLogOut;
    @FindBy(xpath = "//a[contains(text(),'Sign up')]")
    private WebElement btnSignUp;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[2]/form")
    private WebElement signUpModal;
    @FindBy(xpath = "//input[@id=\"sign-username\"]")
    private WebElement signUpUsername;
    @FindBy(xpath = "//input[@id=\"sign-password\"]")
    private WebElement signUpPassword;
    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    private WebElement btnSignUpUser;



    private WebDriver driver;
    public PageLogin(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void hacerlogin(String username, String password){
        try{
            if(btnSignIn.isDisplayed()){
                btnSignIn.click();

                if(usernameInput.isDisplayed() && passwordInput.isDisplayed()){
                    usernameInput.clear();
                    usernameInput.sendKeys(username);
                    passwordInput.clear();
                    passwordInput.sendKeys(password);
                    btnLogin.click();
                }else{
                    Logger.getAnonymousLogger();
                }
            }else {
                Logger.getAnonymousLogger();
            }
        }catch (Exception e){
            Logger.getAnonymousLogger();
        }
    }

    public void signUpUser(String username, String password){
        try{
            btnSignUp.isDisplayed();
            btnSignUp.click();

            if(signUpModal.isDisplayed()){
                signUpModal.click();
                signUpUsername.clear();
                signUpUsername.sendKeys(username);
                signUpPassword.sendKeys(password);
                btnSignUpUser.click();
            }else{
                Logger.getAnonymousLogger();
            }

        }catch (Exception e){
            Logger.getAnonymousLogger();
        }
    }

    public void logOut(){
        try{
            if(labelUserLogged.isDisplayed()){
                btnLogOut.isDisplayed();
                btnLogOut.click();
                driver.quit();
            }
        }catch (Exception e){
            Logger.getAnonymousLogger();
        }
    }
}
