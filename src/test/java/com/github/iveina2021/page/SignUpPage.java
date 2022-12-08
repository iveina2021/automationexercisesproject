package com.github.iveina2021.page;

// page_url =  https://automationexercise.com/signup/

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$$;

public class SignUpPage {
    @FindBy(css = ".login-form > .title")
    public SelenideElement enterAccountInformationLabel;

    @FindBy(css = "input[id='id_gender1']")
    public SelenideElement gender1Checkbox;

    @FindBy(css = "input[id='password']")
    public SelenideElement passwordInput;

    @FindBy(css = "select[id='days']")
    public SelenideElement daysDropDown;

    @FindBy(css = "select[id='months']")
    public SelenideElement monthsDropDown;

    @FindBy(css = "select[id='years']")
    public SelenideElement yearsDropDown;

    @FindBy(css = "input[id='newsletter']")
    public SelenideElement newsletterCheckbox;

    @FindBy(css = "input[id='optin']")
    public SelenideElement receiveSpecialOffersCheckbox;

    @FindBy(css = "div[class='form-group'] label")
    public SelenideElement dateBirthLabel;

    @FindBy(css = "input[id='first_name']")
    public SelenideElement firstNameInput;

    @FindBy(css = "input[id='last_name']")
    public SelenideElement lastNameInput;

    @FindBy(css = "input[id='company']")
    public SelenideElement companyInput;

    @FindBy(css = "input[id='address1']")
    public SelenideElement addressInput;

    @FindBy(css = "input[id='address2']")
    public SelenideElement addressTwoInput;

    @FindBy(css = "select[id='country']")
    public SelenideElement selectCountryDropDown;

    @FindBy(css = "input[id='state']")
    public SelenideElement stateInput;

    @FindBy(css = "input[id='city']")
    public SelenideElement cityInput;

    @FindBy(css = "input[id='zipcode']")
    public SelenideElement zipcodeInput;

    @FindBy(css = "input[data-qa='mobile_number']")
    public SelenideElement mobileNumberInput;

    @FindBy(css = "button[data-qa='create-account']")
    public SelenideElement createAccountButton;

    @FindBy(css = "label[for='address2']")
    public SelenideElement addressTwoLabel;

    public void checkEnterAccountInformationLabelIsVisible() {
        enterAccountInformationLabel.should(Condition.exist);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        daysDropDown.click();
        getDaysSelectOption(day).click();

        monthsDropDown.click();
        getMonthsSelectOption(month).click();

        yearsDropDown.click();
        getYearsSelectOption(year).click();
    }

    private void selectCountry(String country) {
        selectCountryDropDown.click();
        getCountriesSelectOption(country).click();
    }

    public SelenideElement getDaysSelectOption(String day) {
        return $$("#days option")
                .find(attribute("value", day));
//        return $("option [value='" + day + "']");
    }

    public SelenideElement getMonthsSelectOption(String month) {
        return $$("#months option")
                .find(attribute("value", month));
    }

    public SelenideElement getYearsSelectOption(String year) {
        return $$("#years option")
                .find(attribute("value", year));
    }

    public SelenideElement getCountriesSelectOption(String country) {
        return $$("#country option")
                .find(attribute("value", country));
    }

    public AccountCreatedPage fillEnterAccountInformationForm(String password,
                                                              String day,
                                                              String month,
                                                              String year,
                                                              String firstName,
                                                              String lastName,
                                                              String company,
                                                              String address,
                                                              String addressTwo,
                                                              String country,
                                                              String state,
                                                              String city,
                                                              String zipcode,
                                                              String mobileNumber) {
        gender1Checkbox.click();
        passwordInput.setValue(password);
        scrollToDateOfBirthLabel();
        selectDateOfBirth(day, month, year);
        newsletterCheckbox.click();
        receiveSpecialOffersCheckbox.click();

        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        companyInput.setValue(company);
        addressInput.setValue(address);
        scrollToAddressTwoLabel();
        addressTwoInput.setValue(addressTwo);
        selectCountry(country);
        stateInput.setValue(state);
        cityInput.setValue(city);
        zipcodeInput.setValue(zipcode);
        mobileNumberInput.setValue(mobileNumber);
        createAccountButton.click();
        return Selenide.page(AccountCreatedPage.class);
    }

    private void scrollToDateOfBirthLabel() {
        dateBirthLabel.scrollIntoView(true);
        dateBirthLabel.shouldHave(Condition.text("Date of Birth"));
    }

    private void scrollToAddressTwoLabel() {
        addressTwoLabel.scrollIntoView(true);
        addressTwoLabel.shouldHave(Condition.text("Address 2"));
    }
}
