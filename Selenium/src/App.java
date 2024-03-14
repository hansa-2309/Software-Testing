import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.geckodriver.driver", "D:\\GeckoDriver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.leafground.com/input.xhtml;jsessionid=node0kg8p5s68lb4daozr510sjoxb277287.node0");
            
        WebElement errormsg = webDriver.findElement(By.id("j_idt106:thisform:age"));
        errormsg.sendKeys(Keys.ENTER);
       
        Thread.sleep(2000);
        WebElement name = webDriver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Hansa G K");
        
        Thread.sleep(2000);
        WebElement append = webDriver.findElement(By.id("j_idt88:j_idt91"));
        append.sendKeys(", India");

        Thread.sleep(2000);
        boolean txtbox = webDriver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        if (txtbox == false) {
            System.out.println("Textbox is disabled");
        }
        else{
            System.out.println("Textbox is enabled");
        }

        Thread.sleep(2000);
        WebElement clr = webDriver.findElement(By.id("j_idt88:j_idt95"));
        clr.clear();

        Thread.sleep(2000);
        WebElement retrivElement = webDriver.findElement(By.id("j_idt88:j_idt97"));
        String val = retrivElement.getAttribute("value");
        System.out.println(val);

        Thread.sleep(2000);
        WebElement email = webDriver.findElement(By.id("j_idt88:j_idt99"));
        email.sendKeys("hansagk2309@gmail.com"+Keys.TAB);
        
        Thread.sleep(2000);
        WebElement about = webDriver.findElement(By.id("j_idt88:j_idt101"));
        about.sendKeys("I am a hard-working person."+Keys.ENTER,"I would describe myself as an open and honest person.");

        Thread.sleep(2000);
        WebElement label = webDriver.findElement(By.id("j_idt106:float-input"));
        label.click();

        Thread.sleep(2000);
        WebElement dob = webDriver.findElement(By.id("j_idt106:j_idt116_input"));
        dob.sendKeys("9/23/2002");
       
        Thread.sleep(2000);
        WebElement slider = webDriver.findElement(By.id("j_idt106:slider"));
        slider.sendKeys("57");

        Thread.sleep(2000);
        WebElement key = webDriver.findElement(By.id("j_idt106:j_idt122"));
        key.click();
    }
}
