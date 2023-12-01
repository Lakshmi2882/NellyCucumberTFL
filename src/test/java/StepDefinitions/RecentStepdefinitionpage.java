package StepDefinitions;


import TestBase.testbase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.JourneyPlannerPage;



public class RecentStepdefinitionpage extends testbase {
JourneyPlannerPage jp= new JourneyPlannerPage(driver);
    @Given("I navigate to Tfl website")
    public void i_navigate_to_tfl_website() {
        jp.Navigate("https://tfl.gov.uk");
    }

@When("I click on cookies button")
public void iClickOnCookiesButton() {

        jp. ClickonCookies();
}

    @Then("plan a journey page is displayed")
    public void plan_a_journey_page_is_displayed() {
        Assert.assertEquals(jp.PageTitle(), "Keeping London moving - Transport for London");
    }
    @When("I enter from a location")
    public void i_enter_from_a_location() {
        String ftl="Tw33tl";
jp.enterpostcode(ftl);

    }
    @When("I enter to a location")
    public void i_enter_to_a_location() {
        String ttl="KT2 6RL";
       jp.Topostcode(ttl);

    }
    @When("I click change time link")
    public void i_click_change_time_link() {
jp.changedepTime();
    }

    @When("I select leaving date")
    public void i_select_leaving_date() {
        jp.changeDate();
    }
    @When("I select leaving time")
    public void i_select_leaving_time() {
jp.changeTime();
    }
    @When("I click plan my journey")
    public void i_click_plan_my_journey() {
jp.clickOnJourneyPlanButton();
    }
    @Then("quieter Times Message Displayed")
    public void quieter_times_message_displayed() {
Assert.assertEquals(jp.JourneyplannedResults(),"Tuesday 5th Dec, 11:00");
    }
    @When("I click on Home button")
    public void i_click_on_home_button() {
       jp.ClickHomebtn();
    }
    @And("Click on Recents Tab")
    public void click_on_recents_tab() {
       jp.Clickrecenttab();
      jp.Navigateback();
      jp.Navigateback();
      jp.Navigateback();
      jp.Navigateforward();
      jp.ClickHomebtn();
      jp.Clickrecenttab();
    }

    @Then("I can Recentinformation")
    public void i_can_recentinformation() {
Assert.assertEquals(jp.Recenttabinfo(),"Tw33tl to KT2 6RL");
    }
}
