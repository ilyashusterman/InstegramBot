import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LikeMachine {
    private final ChromeDriver driver;
    public boolean isConnected = false;
    private String status;

    LikeMachine(){
        System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chrome");
        this.driver = new ChromeDriver();
    }

    public LikeMachine getSession(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        driver.quit();
        LikeMachine likeMachine = new LikeMachine();
        likeMachine.isConnected = true;
        likeMachine.status = "Couldnt connect";
        return likeMachine;
    }

}
