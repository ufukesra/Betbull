package pages;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import utilities.MobileUIDriver;
import utilities.MobileUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Mobile_Testing {

AppiumDriver driver= MobileUIDriver.get();


@AndroidFindBy(id ="grit.storytel.app:id/text_switcher_recycler_view")
private MobileElement storyScreen;

@AndroidFindBy(id = "grit.storytel.app:id/carousel_title")
private MobileElement welcomeText;

@AndroidFindBy(id = "grit.storytel.app:id/carousel_title")
private MobileElement swipeLeftText;

@AndroidFindBy(id = "grit.storytel.app:id/create_account_preview")
private MobileElement tryItOutButton;

@AndroidFindBy(xpath = "//*[@text=\"Your country\"]")
private MobileElement yourCountryTitle;

@AndroidFindBy(xpath = "//*[@text=\"Iceland\"]")
private MobileElement icelandradioBtn;

@AndroidFindBy(id = "grit.storytel.app:id/buttonDone")
private MobileElement doneBtn;

@AndroidFindBy(xpath = "//*[@text=\"Icelandic\"]")
private  MobileElement icelandicCheckbox;

@AndroidFindBy(id = "grit.storytel.app:id/buttonDone")
private MobileElement languageDoneBtn;

@AndroidFindBy(xpath = "//*[@text=\"Feelgood\"]")
private MobileElement feelGoodElement;

@AndroidFindBy(id = "grit.storytel.app:id/tvEntityDescription")
private MobileElement feelGoodText;

@AndroidFindBy(xpath = "(//*[@class=\"android.view.ViewGroup\"])[10]/android.widget.TextView[1]")
private MobileElement seventhElement;

@AndroidFindBy(id = "grit.storytel.app:id/textViewBookName")
private MobileElement verifyBookName;

@AndroidFindBy(id = "grit.storytel.app:id/btnBookshelfToggle")
private MobileElement likeBtn;

@AndroidFindBy(id = "grit.storytel.app:id/edit_text_email")
private MobileElement emailInput;

@AndroidFindBy(id = "grit.storytel.app:id/edit_text_password")
private MobileElement passwordInput;

@AndroidFindBy( id = "grit.storytel.app:id/button_sign_in")
private MobileElement continueBtn;

@AndroidFindBy(id = "grit.storytel.app:id/button_positive")
private MobileElement accept_Égsamþykki_Btn;

@AndroidFindBy(id = "grit.storytel.app:id/button_negative")
private MobileElement noThanksPopUp;

@AndroidFindBy(id = "grit.storytel.app:id/progressBar")
private  MobileElement loaderScreen;

@AndroidFindBy(xpath = "(//*[@class=android.widget.ImageButton])[1]")
private MobileElement previousPageBtn;

@AndroidFindBy(className = "android.widget.ImageButton")
private List<MobileElement> previousicons;

@AndroidFindBy(xpath = "//*[@text=\"Your Bookshelf\"]")
private MobileElement yourBookshelf;

@AndroidFindBy(id = "grit.storytel.app:id/tvTitle")
private MobileElement savedBooksName;

@AndroidFindBy(id = "grit.storytel.app:id/buttonToolbubble")
private MobileElement threePoints;

@AndroidFindBy(id = "grit.storytel.app:id/buttonSaveToBookshelf")
private MobileElement removeFromBookshelf;

@AndroidFindBy(xpath = "//*[@text=\"Book Tips\"]")
private MobileElement bookTipsBtn;

@AndroidFindBy(xpath = "//*[@text=\"Search\"]")
private MobileElement searchBtn;

@AndroidFindBy(id = "grit.storytel.app:id/autoCompleteTextView")
private MobileElement searchInput;

@AndroidFindBy(xpath = "//*[@text=\"The Adventures of Harry Stevenson\"]")
private MobileElement adventuresofHarry;

@AndroidFindBy(id = "grit.storytel.app:id/textViewBookName")
private MobileElement verifyAdvantureName;

@AndroidFindBy(id = "grit.storytel.app:id/bAuthor")
private MobileElement byAuthor;

@AndroidFindBy(id = "grit.storytel.app:id/buttonFilter")
private MobileElement filterBtn;

@AndroidFindBy(xpath = "//*[@text=\"Ebook\"]")
private MobileElement eBookCheckbox;

@AndroidFindBy(id = "grit.storytel.app:id/buttonDone")
private MobileElement doneFilterBtn;

@AndroidFindBy(id = "grit.storytel.app:id/textViewNoResult")
private MobileElement oopsMessage;





    public Mobile_Testing() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileUIDriver.get()), this); }


        public void verifyLandingPage(){
//            DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
//            desiredCapabilities.setCapability("app", ConfigurationReader.getProperty("storytel_path"));
        String expectedText="Let me tell you a Story";
        String actualText=welcomeText.getText();
            System.out.println("Actual Text: "+actualText);
            assertEquals(expectedText,actualText);


        }
    public void SwipeScreen(){

        //sagdansola x=1000, y=1200  --> x=100, y=1200
        //soldansaga x=100, y=1200  --> x=1000, y=1200

        MobileUtils.scroll(1000,1200,3/2,100,1200);


       assertEquals("Stories that want to be heard",swipeLeftText.getText());

       MobileUtils.scroll(100,1200,1,1000,1200);

        assertEquals("Let me tell you a Story",welcomeText.getText());
    }

    public void clickTryItOut(){
        tryItOutButton.click();

        assertEquals("Your country",yourCountryTitle.getText());

    }

    public void scrollingDowntoIceland() {
        for (int i = 0; i < 2; i++) {

        MobileUtils.scroll(80,1200,3/2,80,200);
        }
        String countryname="Iceland";
        if (icelandradioBtn.getText().equals(countryname)){
            icelandradioBtn.click();
        }


    }


    public void clickDone(){
        doneBtn.click();
    }

    public void selectOnlyEglish(){
        //Select only English by clicking Icelandic

        icelandicCheckbox.click();
        List<MobileElement> langCheckBoxes=driver.findElementsByClassName("android.widget.CheckBox");

        assertEquals(false,langCheckBoxes.get(1).isEnabled());
        for (int i = 0; i <langCheckBoxes.size() ; i++) {
            if (!(langCheckBoxes.get(i).isEnabled())){
                if (i==1){
                    System.out.println("There is only one language selected :"+langCheckBoxes.get(1).getText());
                }
            }


        }

        languageDoneBtn.click();


    }


    public void findFeelGoodElement(){

        outherloop:
        for (int i = 0; i <15 ; i++) {

            MobileUtils.scroll(500,1750,0,500,750);

            List<MobileElement> bookstag=driver.findElementsByClassName("android.widget.TextView");
            for (int j = 0; j <bookstag.size() ; j++) {

                if (bookstag.get(j).getText().equals("Feelgood")) {
                    System.out.println("Book tag :"+ bookstag.get(j).getText());
                    break outherloop;
                }
            }


        }


    }

    String seventhBookName="";
    public void goFeelGoodAndChooseSeventhBook(int seventhBook) {
        seventhBook = 7;
        feelGoodElement.click();
        BrowserUtils.waitFor(3);
        MobileUtils.waitForVisibility(feelGoodText, 30);
        String expectedText = "Ert þú að leita að einhverju auðveldu og fallegu lestrarefni sem kemur þér í " +
                "gott skap? Þá hefur þú ratað á réttan stað. Hér höfum við tekið saman frábæra feelgood titla fyrir þig.";

        assertEquals(expectedText, feelGoodText.getText());


        for (int i = 0; i < 4; i++) {

            MobileUtils.scroll(500, 1450, 1, 500, 1155);
        }
        seventhBookName = seventhElement.getText();
        System.out.println(seventhBookName);
        seventhElement.click();




    }


    public void verifyBookName(){
        MobileUtils.waitForVisibility(verifyBookName,10);
        assertEquals(seventhBookName,verifyBookName.getText());
    }

    public void clickLikeButton(){

        likeBtn.click();


    }


    public void enterEmailPasswordAncClickContinue(){
        Faker faker = new Faker();
        String email= faker.internet().emailAddress();
        emailInput.sendKeys(email);
        passwordInput.sendKeys("01234578");
        continueBtn.click();
    }
    public void accept_Égsamþykki(){
        accept_Égsamþykki_Btn.click();
    }

    public void noThanksMarketingConsept(){
       MobileUtils.waitForVisibility(noThanksPopUp,10);
        noThanksPopUp.click();
        BrowserUtils.waitFor(10);
        //((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.invisibilityOf(loaderScreen));
//        BrowserUtils.waitFor(10);
    }


    public void closeWelcomeToStortel(){


        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));

        //driver.navigate().back();

    }

    public void clickLikeAndVerifyBookSaved(){
       likeBtn.click();
       threePoints.click();

       assertTrue(removeFromBookshelf.isDisplayed());



       //This part is verify savedbook in Your Bookshelf
//       previousPageBtn.click();
//        MobileUtils.scroll(500, 50, 1, 500, 1200);
//        previousPageBtn.click();
//        BrowserUtils.waitFor(1);
//        previousPageBtn.click(); // options button to check bookshelf
//
//        MobileUtils.waitForVisibility(yourBookshelf,10);
//        yourBookshelf.click();
//
//        assertEquals(seventhBookName,savedBooksName.getText());

    }

    public void goBackBookTips(){
        AndroidDriver ad= (AndroidDriver)driver;
        ad.pressKey(new KeyEvent(AndroidKey.BACK)); //close saved verify popup
        MobileUtils.waitForVisibility(previousicons.get(0),10);
        previousicons.get(0).click(); //leave saved book
        BrowserUtils.waitFor(2);
        MobileUtils.scroll(500, 500, 0, 500, 1750);
        previousicons.get(0).click(); //leave feelgood

    }

    public void openSideMenu(){

        previousicons.get(0).click(); //this is option button for search
    }

    public void clickSearchBtn(){

        searchBtn.click();
    }

    public void searchHarry(){

        searchInput.click();
        searchInput.sendKeys("Harry");

        AndroidDriver ad = (AndroidDriver)driver;
        ad.pressKey(new KeyEvent(AndroidKey.BACK));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBePresentInElement(searchInput,"Harry"));
        driver.getKeyboard().pressKey(Keys.ENTER);
    }

    public void searchTheAdvanturesofHarryStevenson(){

        outherloop:
        for (int i = 0; i <100 ; i++) {

            MobileUtils.scroll(500,1750,1,500,750);

            List<MobileElement> bookstag=driver.findElementsByClassName("android.widget.TextView");
            for (int j = 0; j <bookstag.size() ; j++) {

                if (bookstag.get(j).getText().equals("The Adventures of Harry Stevenson")) {
                    break outherloop;
                }
            }


        }

        adventuresofHarry.click();

    }

    public void verifyAdventureOfHarry(){
        String expectedName = "The Adventures of Harry Stevenson";
        String actualName = verifyAdvantureName.getText();

        assertEquals(expectedName,actualName);
    }

    public void clickFilter(){
        byAuthor.click();//to be able to see filter, because This title is not available in your current location error message is occur
        filterBtn.click();
        BrowserUtils.waitFor(2);

    }

    public void removeEbook(){
        eBookCheckbox.click();
        doneFilterBtn.click();
    }

    public void oopsErrorMessageVerify(){
        System.out.println("Error message :"+ oopsMessage.getText());
        String expectedmessage = "Oops! It seems you've filtered a bit too much.";
        String actualmessage = oopsMessage.getText();
        assertEquals(expectedmessage,actualmessage);
    }
}
