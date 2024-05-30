package steps;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    LoginPage loginPage = new LoginPage();
    @Given("I as a user enter the website {string}")
    public void i_as_a_user_enter_the_website(String url) {
        LoginPage.navigateTo(url);

    }
    @When("^I click on singup\\/login, I enter the data to create an account.$")
    public void i_click_on_singup_login_i_enter_the_data_to_create_an_account() {
        loginPage.clickInSignup();
        loginPage.addNewSignUp();
    }

}
