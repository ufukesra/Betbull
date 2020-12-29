package step_definitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.MobileUIDriver;
import utilities.WebUIDriver;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");

        if(scenario.getSourceTagNames().contains("@web")){
            WebUIDriver.getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            WebUIDriver.getDriver().manage().window().maximize();
        }else if(scenario.getSourceTagNames().contains("@mobile")){
            MobileUIDriver.get().manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        }else{

        }

    }

    @After
    public void teardown(Scenario scenario){

        if(scenario.getSourceTagNames().contains("@web")){
            if(scenario.isFailed()){
                TakesScreenshot takesScreenshot = (TakesScreenshot) WebUIDriver.getDriver();
                byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
                scenario.embed(image, "image/png");
            }
            WebUIDriver.closeDriver();
        }else if(scenario.getSourceTagNames().contains("@mobile")){
            if(scenario.isFailed()){
                TakesScreenshot takesScreenshot = (TakesScreenshot) MobileUIDriver.get();
                byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
                scenario.embed(image, "image/png");
            }
            MobileUIDriver.closeDriver();
        }else{

        }
        System.out.println("AFTER");
    }
}
