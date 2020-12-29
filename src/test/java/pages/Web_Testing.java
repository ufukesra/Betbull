package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.WebUIDriver;

import static org.junit.Assert.assertEquals;


public class Web_Testing {

    WebDriver driver = WebUIDriver.getDriver();
    Faker faker = new Faker();

    public Web_Testing() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@class='login']")
    private WebElement signInTab;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "(//*[@class=\"submit\"])[2]/button")
    private WebElement submitBtn;

    @FindBy(xpath = "/*[@class=\"alert alert-danger\"]")
    private  WebElement thereisAnError;

    @FindBy(xpath = "//*[@class=\"alert alert-danger\"]/ol/li")
    private WebElement errorMessage;

//    @BeforeStep
//    public void setup(Scenario scenario){
//        System.out.println(scenario.getSourceTagNames());
//        System.out.println(scenario.getName());
//        System.out.println("BEFORE");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }


    public void navigateLandingPage() {
        driver.get(ConfigurationReader.getProperty("webUrl"));

    }

    public void goToSignIn(){
        signInTab.click();
    }

    public void clickSubmitWithNoCredentials(){

        BrowserUtils.waitForVisibility(submitBtn,10);
        submitBtn.click();
    }


    public void verifyNoCredentialsErrorMessage(){
        String expectedErrorMessage= "An email address required.";

        BrowserUtils.waitForVisibility(errorMessage,10);
        String actualErrorMessage = errorMessage.getText();
        assertEquals(expectedErrorMessage,actualErrorMessage);
    }


    public void enterOnlyEmail(){

        BrowserUtils.waitForVisibility(emailInput,10);
        emailInput.sendKeys(faker.internet().emailAddress());
        submitBtn.click();
    }


    public void verifyOnlyEmailErrorMessage(){
       BrowserUtils.waitForVisibility(errorMessage,10);
        String expextectedErrorMessage = "Password is required.";
        String actualErrorMessage = errorMessage.getText();

        assertEquals(expextectedErrorMessage,actualErrorMessage);
    }

    public void enterOnlyPassword(){
BrowserUtils.waitForVisibility(passwordInput,10);
        passwordInput.sendKeys(faker.internet().password());
        submitBtn.click();
    }
    public void verifyOnlyPasswordErrorMessage(){
       BrowserUtils.waitForVisibility(errorMessage,10);
        String expectedErrorMessage= "An email address required.";

        BrowserUtils.waitForVisibility(errorMessage,10);
        String actualErrorMessage = errorMessage.getText();
        assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    public void enterinvalidCredentials(){
      BrowserUtils.waitForVisibility(emailInput,10);
        emailInput.sendKeys(faker.name().firstName()+"-"+faker.name().lastName());
        passwordInput.sendKeys("////////");
        submitBtn.click();
    }

    public void verifyInvalidCredentialsErrorMessage(){

        String expectedErrorMessage= "Invalid email address.";

        BrowserUtils.waitForVisibility(errorMessage,10);
        String actualErrorMessage = errorMessage.getText();
        assertEquals(expectedErrorMessage,actualErrorMessage);

    }


}
