import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[ ] args) throws Exception {
        System.setProperty("webdriver.geckodriver.driver","D:\\GeckoDriver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver( );
        webDriver.get("https://www.leafground.com/link.xhtml;jsessionid=node0lrcnf5kpbp7833lmzfh838dj419805.node0");

        // WebElement dashbord = webDriver.findElement(By.linkText("/dashboard.xhtml;jsessionid=node0lrcnf5kpbp7833lmzfh838dj419805.node0"));
        // dashbord.click();
    }
}
