package demo;

import org.openqa.selenium.By; 
 
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

  
public class automation2 {  

	
	public static void main(String[] args) throws InterruptedException {  
        

    WebDriver driver=new ChromeDriver();  
    
    driver.manage().window().maximize();
      

    driver.navigate().to("https://ecs-qa.kloudship.com");  
          

    driver.findElement(By.id("login-email")).sendKeys("kloudship.qa.automation@mailinator.com");
    
    driver.findElement(By.id("login-password")).sendKeys("Password1");
          
    driver.findElement(By.id("login-btn")).click();
    Thread.sleep(5000);
 
    

    driver.findElement(By.xpath("//*[@class='mat-card mat-focus-indicator count-card'][7]")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[contains(text(),'Sai Krishna')]")).click();
    
    
  
    driver.findElement(By.xpath("//*[contains(text(),'delete')]")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[contains(text(),'Delete Package Type')]")).click();
    Thread.sleep(2000);
    
    
  
    driver.findElement(By.xpath("//*[text()='more_vert']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[text()='power_settings_new']")).click();
    
    
    
    driver.quit();
      
    }  
  
}  