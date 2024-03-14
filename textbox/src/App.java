import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.geckodriver.driver", "D:\\GeckoDriver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.leafground.com/window.xhtml");

        WebElement newtab = webDriver.findElement(By.id("j_idt88:new"));
        Thread.sleep(3000);
        newtab.click();
        System.out.println("New tab opened !!");
        ArrayList<String> array1 = new ArrayList<String>(webDriver.getWindowHandles());
        Thread.sleep(3000);
        webDriver.switchTo().window((array1.get(1))).close();
        webDriver.switchTo().window((array1.get(0)));

        WebElement multitab = webDriver.findElement(By.id("j_idt88:j_idt91"));
        Thread.sleep(3000);
        multitab.click();
        ArrayList<String> array2 = new ArrayList<String>(webDriver.getWindowHandles());
        System.out.println("No of tabs opened = "+array2.size());  
        Thread.sleep(3000);    
        webDriver.switchTo().window((array2.get(2))).close();
        Thread.sleep(2500);
        webDriver.switchTo().window((array2.get(1))).close();
        webDriver.switchTo().window((array2.get(0)));

        WebElement closetab = webDriver.findElement(By.id("j_idt88:j_idt93"));
        Thread.sleep(2500);
        closetab.click();
        ArrayList<String> array3 = new ArrayList<String>(webDriver.getWindowHandles());  
        webDriver.switchTo().window((array3.get(3))).close();
        Thread.sleep(3000);
        webDriver.switchTo().window((array3.get(2))).close();
        Thread.sleep(2500);
        webDriver.switchTo().window((array3.get(1))).close();
        Thread.sleep(2500);
        webDriver.switchTo().window((array3.get(0)));
        
        WebElement delaytab = webDriver.findElement(By.id("j_idt88:j_idt95"));
        Thread.sleep(2500);
        delaytab.click();
    }
}
