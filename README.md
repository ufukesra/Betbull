Full Name : Ufuk Sahinduran

Project Title : Betbull QA Engineer-Mobile/Web/API Tasks

Installation guide: This is a maven project. so It's assumed that the host running this code have Java and maven 
installed and JAVA_HOME already set. Here is the guide for maven installation just in 
link : https://maven.apache.org/install.html
Project get all dependencies from maven repository. So no additional installation needed.

Below are the dependencies are being used for this project :
Selenium, Cucumber, Junit, RestAssured, JavaFaker, Appium, Github Bonigarcia(WebDriverManager)

                Mobile test

Description : For mobile testing 23 out of 24 test steps has been automated successfully in one Scenario, 
1 unnecessary step skipped which is "And Swipe left to “Series” section", because there is no Series section  
in options after searching. I try to add some test steps Thread.Sleep to be able to see the steps clearly
-There is an issue in step 22 "When Click Filter" which I couldn't see filter directly and I clicked to by Author 
to be able to see filter, because -This title is not available in your current location- error message is occured

Tools: Java, Cucumber, Appium, Android Studio.



                API Test
 Description: 3 Scenario have been automated for Api Testing, 2 out of 3 passed and 1 step failed which is 
 "Given send a post request body with email and password then verify status code 201", because of the registration is
 impossible with new email and password. I have found another way to be able register successfully which is sending
 registration post request with existing email in user list then I got token successfully with 200 Ok status code.
  
 I can also send Put, Patch, Delete request successfully through to registration endpoint with body or without body and
 nothing changes in existing user list.
 
 Tools: Java, Cucumber, RestAssured, Postman
 
 
                Web Test
 Description: 4 out of 4 Scenarios with 16 test steps have been automated successfully, verified all the error messages.
 I used mostly implicit and explicit wait for finding web elements to run tests properly.
 
 Tools: Java, Cucumber, Selenium,
 




-To externalize the data a Configuration Reader utility are created to read configuration.properties. Due to sensitive
 nature of the keys , user is expected to provide his/her own key while running the tests, so that To be able to run 
 this framework for any instance you will be needed to change -apk pathway which is value of storytel_path in Config 
 file.

Build and run your project : This is maven project and tests are written in Cucumber and JUnit. so we use cucumber
 runner class to run the project as below to pick up test: mvn clean test
This is a BDD framework because Cucumber natively supports BDD. It is created basic Page Object Model (POM)
 design pattern.

        QUESTIONS AND ANSWERS
        
 Q1-Which automation frameworks are you using in your current job?
 A1-Behaviour Driven Development Framework(BDD) and Data Driven Development Framework (DDT)
 
 Q2-Do you use any Device Farm for automation? Please specify
 A2-AWS EC2 Instance for Jenkins job to run test framework on cloud computer and also familiar with Azure Devops.
 
 Q3-Which technologies/tools do you use for automation of WEB/Mobile/BE platforms? 
 A3-Java, Selenium, Cucumber, JUnit, TestNG, Gherkin,  IntelliJ, Github, Jenkins, RestAssured, Postman,
  Microsoft SQL Server, Oracle SQL Developer, Appium, Android Studio.
 
