import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AuthenticationPageTest {
    ChromeDriver driver;
    String buttonSignInLocator;

    @BeforeEach
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.bk.com/");
        buttonSignInLocator = "//div[@class='css-1rynq56 r-jwli3a r-95zftm r-1enofrn r-oxtfae r-dhbnww']";

    }

    @DisplayName("Пустые данные")
    @Test
    public void testMethod1() {
        WebElement a =driver.findElement(By.xpath(buttonSignInLocator));
        a.click();

    }

    @AfterEach
    public void afterTest() {
        driver.quit();
    }


}



