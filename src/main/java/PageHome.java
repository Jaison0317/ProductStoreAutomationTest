import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class PageHome extends Page{

    @FindBy(xpath = "//a[contains(text(),'About us')]")
    private WebElement labelAboutUS;
    @FindBy(xpath = "//h5[@id=\"videoModalLabel\"]")
    private WebElement modalAboutUS;
    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    private WebElement contactUS;
    @FindBy(xpath = "//h5[contains(text(),'New message')]")
    private WebElement contactUSModal;
    @FindBy(xpath = "//*[@id=\"recipient-email\"]")
    private WebElement inputContactUsEmail;
    @FindBy(xpath = "//input[@id=\"recipient-name\"]")
    private WebElement inputContactUsName;
    @FindBy(xpath = "//textarea[@id=\"message-text\"]")
    private WebElement inputContactUsMessage;
    @FindBy(xpath = "//button[contains(text(),'Send message')]")
    private WebElement btnSendMessage;
    @FindBy(xpath = "//a[@id=\"cartur\"]")
    private WebElement labelCart;
    @FindBy(xpath = "//div[@id=\"page-wrapper\"]")
    private WebElement CartProducts;
    @FindBy(xpath = "//a[contains(text(),'Phones')]")
    private WebElement btnCellPhoneCategory;
    @FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
    private WebElement itemCellPhone;
    @FindBy(xpath = "/html/body/div[5]")
    private WebElement viewProduct;
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    private WebElement btnAddToCart;

    private WebDriver driver;
    public PageHome(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void aboutUS(){
        try{
            if(labelAboutUS.isDisplayed()){
                labelAboutUS.click();
                if(modalAboutUS.isDisplayed()){
                    modalAboutUS.isDisplayed();
                }else{
                    Logger.getAnonymousLogger();
                }
            }else{
                Logger.getAnonymousLogger();
            }
        }catch (Exception e){
            Logger.getAnonymousLogger();
        }
    }

    public void contactUS(String contactUsEmail, String contactUsName, String contactUsMessage){
        try{
            if(contactUS.isDisplayed()){
                contactUS.click();
                inputContactUsEmail.isDisplayed();
                inputContactUsEmail.sendKeys(contactUsEmail);
                inputContactUsName.sendKeys(contactUsName);
                inputContactUsMessage.sendKeys(contactUsMessage);
                btnSendMessage.isDisplayed();
                btnSendMessage.click();
            }else{
                Logger.getAnonymousLogger();
            }
        }catch (Exception e){
            Logger.getAnonymousLogger();
        }
    }

    public void viewCart(){
        try{
            if(labelCart.isDisplayed()){
                labelCart.click();
                if(CartProducts.isDisplayed()){
                    CartProducts.isDisplayed();
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

    public void buyProducts(){
        try{
            if(btnCellPhoneCategory.isDisplayed()){
                btnCellPhoneCategory.click();
                itemCellPhone.click();
                if(viewProduct.isDisplayed()){
                    btnAddToCart.click();
                    driver.navigate().back();
                }else{
                    Logger.getAnonymousLogger();
                }
                viewCart();
            }else{
                Logger.getAnonymousLogger();
            }

           /* int product = 5;
            for(int i = 0; i <= product; i++){
                if(btnCellPhoneCategory.isDisplayed()){
                    btnCellPhoneCategory.click();
                    itemCellPhone.click();
                    if(viewProduct.isDisplayed()){
                        btnAddToCart.click();
                        driver.navigate().back();
                    }else{
                        Logger.getAnonymousLogger();
                    }
                    viewCart();
                }else{
                    Logger.getAnonymousLogger();
                }
            }*/
        }catch (Exception e){
            Logger.getAnonymousLogger();
        }
    }
}
