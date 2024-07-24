package main.java.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pagePackage.LoginPage;

public class steps {
    WebDriver driver;
   LoginPage lp=new LoginPage();



    @Given("^User Launch Firefox browser$")
    public void user_Launch_Firefox_browser() {
       lp.openBrowser();


    }

    @When("^User opens URL \"([^\"]*)\"$")
    public void user_opens_URL(String url) {
        driver.get(url);
    }

    @When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enters_Email_as_and_Password_as(String email, String password) {
        lp.setUserName(email);
        lp.setPassword(password);
    }

    @When("^Click on Login$")
    public void click_on_Login(){
        lp.clickLoginButton();
    }

    @Then("^PageURL should be \"([^\"]*)\"$")
    public void pageurl_should_be(String title) {
        if(driver.getPageSource().contains("Login was unsucessfill.")){
            driver.close();
            Assert.assertTrue(false);
        }
        else{
            Assert.assertEquals(title,driver.getTitle());
        }

    }

    @When("^User click on Log out Link$")
    public void user_click_on_Log_out_Link() throws InterruptedException {
        lp.logOut();
        Thread.sleep(3000);
    }



    @Then("^close browser$")
    public void close_browser(){
        driver.close();
    }




}
