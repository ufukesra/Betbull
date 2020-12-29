package utilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobileUtils {   private static WebDriverWait wait = new WebDriverWait(MobileUIDriver.get(), 20);

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForPresence(MobileBy by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void scroll(int x1, int y1,int timesecond, int x2, int y2){

        new TouchAction((PerformsTouchActions) MobileUIDriver.get())
                .press(PointOption.point(x1, y1)).waitAction(WaitOptions
                .waitOptions(Duration.ofSeconds(timesecond)))
                .moveTo(PointOption.point(x2, y2))
                .release().perform();
    }

    public static WebElement waitForVisibility(MobileElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(MobileUIDriver.get(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}

