package pages;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class API_Testing {

    public void successfullRegistrarion(int statusCode){

        String token="";
        String body2="{\"email\":\"eve.holt@reqres.in\",\n" +
                "                \"password\":\"123456789\"}";


        Faker faker = new Faker();
        String email=faker.name().firstName().toLowerCase()+"."+faker.name().lastName().toLowerCase()+"@reqres.in";
        String email2= faker.internet().emailAddress();

        Map<String,Object> body1 = new HashMap<>();
        body1.put("password",faker.internet().password());
        body1.put("email",email);



        Response response=
                given()
                        .accept(ContentType.JSON).contentType(ContentType.JSON).body(body2).log().all()
                .when()
                        .post(ConfigurationReader.getProperty("apiRegUrl")).prettyPeek();

        assertEquals(200,response.statusCode());

        token=response.jsonPath().getString("token");


        /*
        Registration is not possible only with username and password body which is not in the user list in this framework
        or postman, I get below error
                        {"email":"mail@gmail.com",
                         "password":"123456789"
                         }

           and the error message is
                          {
                             "error": "Note: Only defined users succeed registration"
                          }


         I can only get response token when I send a registration post request with existing email address in user list
         for instance
                         {
                            "email": "eve.holt@reqres.in",
                             "password": "123456789"
                          }

                     and the token is
                         {
                            "id": 4,
                            "token": "QpwL5tke4Pnpja7X4"
                          }
         */
    }


    public void unsuccessfullRegistrarion(int statusCode){

        Map<String,Object> body = new HashMap<>();
        Faker faker = new Faker();
        body.put("email",faker.internet().emailAddress());


        Response response=
                given()
                        .accept(ContentType.JSON).contentType(ContentType.JSON).body(body).log().all()
                .when()
                        .post(ConfigurationReader.getProperty("apiRegUrl")).prettyPeek();

        assertEquals(statusCode,response.statusCode());
        String expectederrorMessage="Missing password";
        String actualErrorMessage = response.jsonPath().getString("error");
        assertEquals(expectederrorMessage,actualErrorMessage);

    }




    public void getUserList(int statusCode){

        Response response=
                given()
                        .accept(ContentType.JSON).contentType(ContentType.JSON)
                        .when()
                        .get(ConfigurationReader.getProperty("apiGetUrl")).prettyPeek();

        assertEquals(statusCode,response.statusCode());
    }
}
