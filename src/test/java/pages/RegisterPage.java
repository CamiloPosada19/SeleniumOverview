package pages;
import utils.RandomData;
public class RegisterPage extends BasePage{
    private String radioButton = "//input[@value='Mr']";
    private String dropdownDay = "days";
    private String dropwdownMonth = "months";
    private String dropwdonYear = "years";
    
    private String inputFirstName = "first_name";
    private String inputLastName = "last_name";
    private String inputPassword = "password";
    private String inputCompany = "address1";
    private String inputState = "state";
    private String inputCity = "city";
    private String inputZipCode = "zipcode";
    private String mobileNumber = "mobile_number";
    private String btnCreateAccount = "//button[@type='submit'][contains(.,'Create Account')]";
    private String textAccount = "//b[contains(.,\'Account\')]";
    private String btnContinue = "//a[contains(@data-qa,'continue-button')]";
    private String btnDeleteAccount = "//a[contains(.,'Delete Account')]";
    
    public RegisterPage() {
        super(driver);
    }
    
    public void fillTheForm(){
        RandomData randomData = new RandomData();
        clickElement(radioButton);
        selectFromDropdownByValue(dropdownDay,"6");
        selectFromDropdownByValue(dropwdownMonth,"3");
        selectFromDropdownByValue(dropwdonYear,"1992");
        writeByID(inputFirstName,randomData.getName());
        writeByID(inputLastName,randomData.getLastName());
        writeByID(inputPassword,randomData.getPhoneNumber());
        writeByID(inputCompany,randomData.getCompanyName());
        writeByID(inputState,randomData.getStreetAddress());
        writeByID(inputCity,randomData.getCity());
        writeByID(inputZipCode,randomData.getZipCode());
        writeByID(mobileNumber,randomData.getPhoneNumber());
        clickElement(btnCreateAccount);
    }
    
    public String getTextAccount(){
        return getText(textAccount);
    }
    
    public void ClickInContinue(){
        clickElement(btnContinue);
    }
    public void DeleteAccount(){
        clickElement(btnDeleteAccount);
    }


}
