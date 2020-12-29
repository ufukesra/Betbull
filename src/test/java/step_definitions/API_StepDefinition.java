package step_definitions;

import io.cucumber.java.en.Given;
import pages.API_Testing;

public class API_StepDefinition {

    API_Testing apipage= new API_Testing();
    @Given("send a post request body with email and password then verify status code {int}")
    public void send_a_post_request_body_with_email_and_password_then_verify_status_code(int statusCode) {
        statusCode=201;

        apipage.successfullRegistrarion(statusCode);
    }

    @Given("send a post request body with email then verify status code {int}")
    public void send_a_post_request_body_with_email_then_verify_status_code(int statusCode) {
        statusCode=400;
        apipage.unsuccessfullRegistrarion(statusCode);

    }

    @Given("send a get request to get all users then verify status code {int}")
    public void send_a_get_request_to_get_all_users_then_verify_status_code(int statusCode) {
        statusCode=200;

        apipage.getUserList(statusCode);
    }


}
