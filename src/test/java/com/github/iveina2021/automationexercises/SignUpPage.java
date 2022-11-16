package com.github.iveina2021.automationexercises;

// page_url =  https://automationexercise.com/signup/

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.page;

public class SignUpPage {
    @FindBy(css = "html > body > section > div > div > div > div:nth-of-type(1) > h2 > b")
    public SelenideElement enterAccountInformationLabel;

    @FindBy(css = "#id_gender1")
    public SelenideElement genderCheckboxMr;

    @FindBy(css = "input[id='password']")
    public SelenideElement passwordInput;

    @FindBy(css = "select[id='days']")
    public SelenideElement daysDropDown;

    @FindBy(css = "select[id='days'] option[value='2']")
    public SelenideElement getDay2DropDown;

    @FindBy(css = "select[id='months']")
    public SelenideElement monthsDropDown;

    @FindBy(css = "select[id='months'] option[value='4']")
    public SelenideElement getMonthApril;

    @FindBy(css = "select[id='years']")
    public SelenideElement yearsDropDown;

    @FindBy(css = "option[value='2019']")
    public SelenideElement getYear2019;

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

    @FindBy(css = "option[value='Canada']")
    public SelenideElement getCountryCanada;

    @FindBy(css = "input[id='state']")
    public SelenideElement stateInput;

    @FindBy(css = "input[id='city']")
    public SelenideElement cityInput;

    @FindBy(css = "input[id='zipcode']")
    public SelenideElement zipcodeInput;

    @FindBy(css = "input[id^='mobile']")
    public SelenideElement mobileNumberInput;

    @FindBy(css = "button[data-qa='create-account']")
    public SelenideElement createAccountButton;

    @FindBy(css = "label[for='address2']")
    public SelenideElement addressTwoLabel;

    public void checkEnterAccountInformationLabelIsVisible() {
        enterAccountInformationLabel.isDisplayed();
    }

    public void selectDateOfBirth() {
        daysDropDown.click();
        getDay2DropDown.click();

        monthsDropDown.click();
        getMonthApril.click();

        yearsDropDown.click();
        getYear2019.click();
    }

    public void scrollToDateOfBirthLabel() {
        dateBirthLabel.scrollIntoView(true);
    }

    public void scrollToAddressTwoLabel() {
        addressTwoLabel.scrollIntoView(true);
    }

    public AccountCreatedPage fillEnterAccountInformationForm() {
        genderCheckboxMr.click();
        passwordInput.setValue("123" + UUID.randomUUID());
        scrollToDateOfBirthLabel();
        selectDateOfBirth();
        newsletterCheckbox.click();
        receiveSpecialOffersCheckbox.click();

        firstNameInput.setValue("Leonard");
        lastNameInput.setValue("Hofstadter");
        companyInput.setValue("Big Bang Theory Inc");
        addressInput.setValue("Abbey Road, 1");
        scrollToAddressTwoLabel();
        addressTwoInput.setValue("Abbey Road, 2");
        selectCountryDropDown.click();
        getCountryCanada.click();
        stateInput.setValue("Ontario");
        cityInput.setValue("Toronto");
        zipcodeInput.setValue("123456");
        mobileNumberInput.setValue("123456789");
        createAccountButton.click();

        return page(AccountCreatedPage.class);
    }
}
