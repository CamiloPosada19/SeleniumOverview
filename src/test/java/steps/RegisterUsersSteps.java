package steps;
import io.cucumber.java.en.*;
import io.cucumber.java.PendingException;
public class RegisterUsersSteps {

    @Given("^I as a user enter the website$")
    public void i_as_a_user_enter_the_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.print("Conectando...");
    }
    @When("^I click on singup\\/login, I enter the data to create an account.$")
    public void i_click_on_singup_login_i_enter_the_data_to_create_an_account() {
        System.out.print("Conectando...");
    }
    @Then("^I check the Account Created tooltip$")
    public void i_check_the_account_created_tooltip() {
        System.out.print("Conectando...");
    }
    @Then("^I delete the account with the button$")
    public void i_delete_the_account_with_the_button() {
        System.out.print("Conectando...");
    }
    @Then("^I check the Account Deleted tooltip$")
    public void i_check_the_account_deleted_tooltip() {
        System.out.print("Conectando...");
    }
}
