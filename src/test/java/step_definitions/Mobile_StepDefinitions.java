package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Mobile_Testing;
import utilities.MobileUtils;

public class Mobile_StepDefinitions {

    Mobile_Testing mobileTest= new Mobile_Testing();


    @Given("Open Storytel app")
    public void open_Storytel_app() {
        MobileUtils.wait(2);
        mobileTest.verifyLandingPage();
    }

    @When("Swipe stories to left and right and verify swiping works correctly")
    public void swipe_stories_to_left_and_right_and_verify_swiping_works_correctly() {
        mobileTest.SwipeScreen();
    }

    @Then("Click on “Try it out” button")
    public void click_on_Try_it_out_button() {
        mobileTest.clickTryItOut();
    }

    @Then("Scroll down to find “Iceland” selection")
    public void scroll_down_to_find_Iceland_selection() {

        mobileTest.scrollingDowntoIceland();
    }

    @When("Select “Iceland” and click “Done”")
    public void select_Iceland_and_click_Done() {
        mobileTest.clickDone();

    }

    @Then("Select only “English” from languages selections page and click “Done”")
    public void select_only_English_from_languages_selections_page_and_click_Done() {

        mobileTest.selectOnlyEglish();

    }

    @Then("Scroll down to find “Feelgood” text from Book tips page")
    public void scroll_down_to_find_Feelgood_text_from_Book_tips_page() {

        mobileTest.findFeelGoodElement();
    }

    @When("Swipe left on “Feelgood” section books and click on the {int}th item from the list")
    public void swipe_left_on_Feelgood_section_books_and_click_on_the_th_item_from_the_list(Integer int1) {

        mobileTest.goFeelGoodAndChooseSeventhBook(int1);
    }

    @Then("Verify correct book is clicked")
    public void verify_correct_book_is_clicked() {

        mobileTest.verifyBookName();
    }

    @Then("Click like button")
    public void click_like_button() {

        mobileTest.clickLikeButton();
    }

    @When("Fill a valid email and password and click “Continue” button")
    public void fill_a_valid_email_and_password_and_click_Continue_button() {

        mobileTest.enterEmailPasswordAncClickContinue();

    }

    @Then("Click I Accept button \\(Ég samþykki)")
    public void click_I_Accept_button_Ég_samþykki() {

        mobileTest.accept_Égsamþykki();
    }

    @Then("Click “No thanks” to Marketing Consent popup")
    public void click_No_thanks_to_Marketing_Consent_popup() {

        mobileTest.noThanksMarketingConsept();
    }

    @When("Click Back button to close “Welcome to Storytel!” page")
    public void click_Back_button_to_close_Welcome_to_Storytel_page() {

        mobileTest.closeWelcomeToStortel();
    }

    @Then("Click Like button and verify book is saved to bookshelf")
    public void click_Like_button_and_verify_book_is_saved_to_bookshelf() {

        mobileTest.clickLikeAndVerifyBookSaved();
    }

    @Then("Click ← to go back to Book tips")
    public void click_to_go_back_to_Book_tips() {

        mobileTest.goBackBookTips();
    }

    @When("Open Side Menu")
    public void open_Side_Menu() {

        mobileTest.openSideMenu();
    }

    @Then("Click Search button")
    public void click_Search_button() {

        mobileTest.clickSearchBtn();
    }

    @Then("Swipe left to “Series” section")
    public void swipe_left_to_Series_section() {

    }

    @When("Search for “Harry”")
    public void search_for_Harry() {

        mobileTest.searchHarry();
    }

    @Then("Swipe up on search result to find “The Advantures of Harry Stevenson” and click on it")
    public void swipe_up_on_search_result_to_find_The_Advantures_of_Harry_Stevenson_and_click_on_it() {

        mobileTest.searchTheAdvanturesofHarryStevenson();
    }

    @Then("Verify that page is the correct page")
    public void verify_that_page_is_the_correct_page() {

        mobileTest.verifyAdventureOfHarry();
    }

    @When("Click Filter")
    public void click_Filter() {

        mobileTest.clickFilter();
    }

    @Then("Remove Ebook from Filter list and click “Done”")
    public void remove_Ebook_from_Filter_list_and_click_Done() {

        mobileTest.removeEbook();
    }

    @Then("Verify “Oops! It seems you've filtered a bit too much.” text on the screen.")
    public void verify_Oops_It_seems_you_ve_filtered_a_bit_too_much_text_on_the_screen() {

        mobileTest.oopsErrorMessageVerify();
    }

}
