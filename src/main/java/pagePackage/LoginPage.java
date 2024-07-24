package pagePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
public WebDriver driver;
public void openBrowser(){
    driver=new FirefoxDriver();
    WebDriverManager.firefoxdriver().setup();
}
public void setUserName(String uname){
    driver.findElement(By.xpath("//input[@id='Email']")).clear();
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(uname);

}
public void setPassword(String pass){
    driver.findElement(By.xpath("//input[@id='Password']")).clear();
    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
}
public void clickLoginButton(){
    driver.findElement(By.xpath("//button[text()='Log in']")).click();
}
public void logOut(){
    driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
