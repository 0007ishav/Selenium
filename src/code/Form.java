package code;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Ishav\\OneDrive - cloudEQ\\Desktop\\Training\\Selenium-Java\\register\\src\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

       
        driver.get("https://demo.guru99.com/test/newtours/register.php");

      
        WebElement firstname = driver.findElement(By.name("firstName"));
        firstname.sendKeys("Ishav");


        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("Singh");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("8295077777");

        WebElement email = driver.findElement(By.name("userName"));
        email.sendKeys("2002ishavs@gmail.com");

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("007 ludhiana");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("ludhiana");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Panjab");

        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("0007");

       
        // WebElement country = driver.findElement(By.name("country"));
        // country.sendKeys("INDIA");
        Select droplist = new Select(driver.findElement(By.name("country")));
        droplist.selectByVisibleText("INDIA");
      
        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("0007ishav");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("5748125");

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("5748125");

       
        // WebElement submitButton = driver.findElement(By.name("submit"));
        // submitButton.click();
        WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();

        
        
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
