import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage {

    public static WebDriver driver = new ChromeDriver();
    String URL = "https://dsportalapp.herokuapp.com/";

    @FindBy (xpath = "//button[text() = 'Get Started']") WebElement StartButton;

    @Test
    public void homePage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get(URL);

        PageFactory.initElements(driver,this);

        StartButton.click();
    }

}
