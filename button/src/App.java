import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.geckodriver.driver", "D:\\GeckoDriver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.leafground.com/button.xhtml");
            
        WebElement title = webDriver.findElement(By.id("j_idt88:j_idt90"));
        Thread.sleep(2000);
        title.click();     
        Thread.sleep(2000);
        webDriver.navigate().back();
        Thread.sleep(2000);

        boolean btn = webDriver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
        if (btn == false) {
            System.out.println("Button is disabled");
        }
        else{
            System.out.println("Button is enabled");
        }

        Thread.sleep(2000);
        WebElement pos = webDriver.findElement(By.id("j_idt88:j_idt94"));
        System.out.println("Position of the submit Button : "+pos.getLocation());

        Thread.sleep(2000);
        WebElement clr = webDriver.findElement(By.id("j_idt88:j_idt96"));
        System.out.println("Button Color: " +clr.getCssValue("background-color"));

        Thread.sleep(2000);
        WebElement hw = webDriver.findElement(By.id("j_idt88:j_idt96"));
        System.out.println("Height and width of the button: " +hw.getSize());

        Thread.sleep(2000);
        WebElement clrchange = webDriver.findElement(By.id("j_idt88:j_idt100"));
        Actions action = new Actions(webDriver);
        Thread.sleep(2000);
        action.moveToElement(clrchange).perform();
        Thread.sleep(2000);

        WebElement imgbtn = webDriver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
        imgbtn.click();
        Thread.sleep(2000);
        imgbtn.click();

        String rbtn = ".rounded-button"; 
        java.util.List <WebElement> roundbtn = webDriver.findElements(By.cssSelector(rbtn));
        int tot = roundbtn.size();
        System.out.println("Number of rounded buttons: " + tot);
    }
}
