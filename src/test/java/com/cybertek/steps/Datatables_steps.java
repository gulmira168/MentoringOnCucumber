package com.cybertek.steps;

import com.cybertek.pages.DatatablesPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Cucumber allows to add parameters into the steps when we need.
 * Compared to hard coding step definitions with parameters
 * become flexible for changing test data from feature files.
 * Anything we put in double quotes, becomes a string parameter for that step.
 */

public class Datatables_steps {
    DatatablesPage datatablesPage = new DatatablesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),100);

    @Given("User goes to URL")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User clicks on New Button")
    public void user_clicks_to_New_Button() {
        datatablesPage.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DTE_Body")));
        Assert.assertTrue(datatablesPage.newEmployeeForm.isDisplayed());
    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {
        datatablesPage.firstNameInput.sendKeys("Susan");
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {
        datatablesPage.lastNameInput.sendKeys("Swan");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
        datatablesPage.positionInput.sendKeys("QA");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
        datatablesPage.officeInput.sendKeys("Tysons Corner");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        datatablesPage.extensionInput.sendKeys("123");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
        datatablesPage.startDateInput.sendKeys("2018-10-23");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        datatablesPage.salaryInput.sendKeys("100000");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
        datatablesPage.createButton.click();
    }

    @Then("User enters first name to search box")
    public void user_enters_first_name_to_search_box() {
        datatablesPage.searchBox.sendKeys("Susan");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='sorting_1']")));
        String expected = "Susan";
        String actual = datatablesPage.firstResult.getText();
        Assert.assertTrue(actual.contains(expected));
    }

//steps with parameters

    @Then("User should enter firstname {string}")
    public void user_should_enter_firstname(String string) {
        datatablesPage.firstNameInput.sendKeys(string);
    }

    @Then("User should enter lastname {string}")
    public void user_should_enter_lastname(String string) {
        datatablesPage.lastNameInput.sendKeys(string);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String string) {
        datatablesPage.positionInput.sendKeys(string);
    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String string) {
        datatablesPage.officeInput.sendKeys(string);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String string) {
        datatablesPage.extensionInput.sendKeys(string);
    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String string) {
        datatablesPage.startDateInput.sendKeys(string);
    }

    @Then("User should enter salary {string}")
    public void user_should_enter_salary(String string) {
        datatablesPage.salaryInput.sendKeys(string);
    }

    @Then("User enters first name {string} to search box")
    public void user_enters_first_name_to_search_box(String firstname) {
        datatablesPage.searchBox.sendKeys(firstname);
    }

    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String firstname) {
        String expected = firstname;
        String actual = datatablesPage.firstResult.getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='sorting_1']")));
        Assert.assertTrue("Not found", actual.contains(expected));
    }

}
