package com.cybertek.steps;

import com.cybertek.pages.AmazonPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Cucumber allows to add parameters into the steps when we need.
 * Compared to hard coding step definitions with parameters
 * become flexible for changing test data from feature files.
 * Anything we put in double quotes, becomes a string parameter for that step.
 */
public class Amazon_steps {

    AmazonPage amazonSearchPage = new AmazonPage();


    @Given("User goes to Amazon website")
    public void user_goes_to_Amazon_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
    }

    @When("User enters search keywords")
    public void user_enters_search_keywords() {
        amazonSearchPage.amazonSearchBox.sendKeys("Software Testing");
    }

    @Then("User should see search keywords in results")
    public void user_should_see_search_keywords_in_results() {
        String expected = "Software Testing";
        String actual = amazonSearchPage.amazonSearchResult.getText();
        Assert.assertTrue("Not found", actual.contains(expected));
    }

    @When("User enters keywords {string}")
    public void user_enters_keywords(String product) {
        amazonSearchPage.amazonSearchBox.sendKeys(product);
    }

    @When("User clicks on Search button")
    public void user_clicks_on_Search_button() {
        amazonSearchPage.amazonSearchButton.click();
    }

    @Then("User should see {string} in results")
    public void user_should_see_in_results(String productName) {
        String expected = productName;
        String actual = amazonSearchPage.amazonSearchResult.getText();
        Assert.assertTrue("not found", actual.contains(expected));
    }


}
