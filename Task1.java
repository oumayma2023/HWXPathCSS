package HWXPathCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Task1 {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver= new ChromeDriver();
            driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
            firstName.sendKeys("Malek");
            WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
            lastName.sendKeys("Boudhina");
            WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
            email.sendKeys("oumaymaayadi@gmail.com");
            WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='phone']"));
            phoneNumber.sendKeys("(757)-000-0000");
            WebElement address=driver.findElement(By.xpath("//input[@placeholder='Address']"));
            address.sendKeys("2000 virginia beach Blvd");
            WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
            city.sendKeys("Virginia");
            Thread.sleep(2000);
            WebElement state=driver.findElement(By.xpath("//option[text()='Virginia']"));
            state.click();
            WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
            zipCode.sendKeys("23454");
            WebElement website=driver.findElement(By.xpath("//input[@name='website']"));
            website.sendKeys("google.com");
            Thread.sleep(2000);
            WebElement no=driver.findElement(By.xpath("//input[@value='no']"));
            no.click();
            WebElement projectDesciption=driver.findElement(By.xpath("//textarea[@name='comment']"));
            projectDesciption.sendKeys("Selenium it's little complicated:)");
            Thread.sleep(2000);
            WebElement sendButton=driver.findElement(By.xpath("//button[text()='Send ']"));
            sendButton.click();
            Thread.sleep(2000);
            driver.quit();
        }
    }


