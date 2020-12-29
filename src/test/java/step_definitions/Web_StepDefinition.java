package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Web_Testing;

public class Web_StepDefinition {
    Web_Testing webtest= new Web_Testing();


    @Given("navigate landing page")
    public void navigate_landing_page() {
        webtest.navigateLandingPage();
    }

    @When("go to Sign in")
    public void go_to_Sign_in() {
        webtest.goToSignIn();
    }

    @Then("click submit button with no credentials")
    public void click_submit_button_with_no_credentials() {
        webtest.clickSubmitWithNoCredentials();

    }

    @Then("verify no credentials error message")
    public void verify_no_credentials_error_message() {

        webtest.verifyNoCredentialsErrorMessage();
    }

    @Then("enter only email and click sign in button")
    public void enter_only_email_and_click_sign_in_button() {

        webtest.enterOnlyEmail();
    }

    @Then("verify only email error message")
    public void verify_only_email_error_message() {

        webtest.verifyOnlyEmailErrorMessage();
    }

    @Then("enter only password then click sign in button")
    public void enter_only_password_then_click_sign_in_button() {

        webtest.enterOnlyPassword();
    }

    @Then("verify only password error message")
    public void verify_only_password_error_message() {

        webtest.verifyOnlyPasswordErrorMessage();
    }

    @Then("enter invalid credentials then click sign in button")
    public void enter_invalid_credentials_then_click_sign_in_button() {

        webtest.enterinvalidCredentials();
    }

    @Then("verify invalid credentials error message")
    public void verify_invalid_credentials_error_message() {


        webtest.verifyInvalidCredentialsErrorMessage();
    }


}
