package pages;
import utils.RandomData;
import com.github.javafaker.Faker;
public class LoginPage extends BasePage {
    private String btnSingupLogin = "//a[contains(.,'Signup / Login')]";
    private String inputName = "//input[@name=\'name\']";
    private String inputEmail = "//input[contains(@data-qa,'signup-email')]";
    private String btnSignUp = "//button[@type='submit'][contains(.,'Signup')]";
    
    
    public LoginPage() {
        super(driver);
    }
    
    public void clickInSignup(){
        clickElement(this.btnSingupLogin);   
    }
    
    public void  addNewSignUp(){
        RandomData randomData = new RandomData();
        String name = randomData.getName();
        String email = randomData.getEmail();
        
        write(this.inputName,name);
        write(this.inputEmail,email);
        clickElement(this.btnSignUp);
        
        
    }
    
}
