package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LoginSteps {

    public WebDriver driver;

    @Given("^Im on Homepage \"([^\"]*)\"$")
    public void im_on_Homepage(String url) throws Throwable {

        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        driver.get(url);

    }

    @When("^I click on My Account link$")
    public void i_click_on_My_Account_link()  {
    driver.findElement(By.xpath("/html/body/header/div[2]/section/section[3]/ul/li[1]/a")).click();
    }

    @When("^I enter valid username\"([^\"]*)\"$")
    public void i_enter_valid_username(String validUsername) {
driver.findElement(By.name("EmailOrAccountNumber")).sendKeys(validUsername);
    }

    @When("^I enter valid password\"([^\"]*)\"$")
    public void i_enter_valid_password(String validPassword)  {
        driver.findElement(By.id("Password")).sendKeys(validPassword);

    }

    @When("^I click Sign In button$")
    public void i_click_Sign_In_button()  {
driver.findElement(By.id("SignInNow")).click();
    }

    @Then("^I should login successfully with success message as\"([^\"]*)\"$")
    public void i_should_login_successfully_with_success_message_as(String arg1) throws Throwable {

    }

    @Then("^I should be redirected to My Account page$")
    public void i_should_be_redirected_to_My_Account_page()  {

    }
    @When("^I enter invalid username\"([^\"]*)\"$")
    public void i_enter_invalid_username(String invalidUsername ) throws Throwable {


    }

    @When("^I enter invalid password\"([^\"]*)\"$")
    public void i_enter_invalid_password(String invalidPassword) throws Throwable {

    }

    @Then("^I should not login successfully with warning message as\"([^\"]*)\"is displayed$")
    public void i_should_not_login_successfully_with_warning_message_as_is_displayed(String loginMessage) throws Throwable {

    }

    @When("^I enter no username\"([^\"]*)\"$")
    public void i_enter_no_username(String noUsername ) throws Throwable {


    }

    @When("^I enter blank password\"([^\"]*)\"$")
    public void i_enter_blank_password(String blankPassword) throws Throwable {

    }


    @Then("^I should not login successfully with warning message as\"([^\"]*)\"$")
    public void i_should_not_login_successfully_with_warning_message_as(String warningMessage ) throws Throwable {

    }


}