package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterUsersSteps {
    private WebDriver driver;
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @When("I fill in the data for the creation of the account")
    public void i_fill_in_the_data_for_the_creation_of_the_account() {
        registerPage.fillTheForm();
    }
    
    @Then("I check the {string}")
    public void iCheckThe(String expectedResult) {
        System.out.println(registerPage.getTextAccount());
        Assert.assertEquals(registerPage.getTextAccount(),expectedResult);
    }
    @Then("^I delete the account with the button$")
    public void i_delete_the_account_with_the_button() {
        registerPage.ClickInContinue();
        registerPage.DeleteAccount();
    }

  
}
