package uk.co.library.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

import java.util.HashMap;

public class jobSearchStepdefs {
    @Given("^I am on home page\\.$")
    public void iAmOnHomePage() throws InterruptedException {

    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) throws InterruptedException {
//        Thread.sleep(1000);
//        new HomePage().acceptCookies();
        Thread.sleep(1000);
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location) throws InterruptedException {
        new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) throws InterruptedException {
       Thread.sleep(1000);
        new HomePage().selectDistance(distance);
    }

    @And("^I click on more search options link$")
    public void iClickOnMoreSearchOptionsLink() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().clickOnMoreSearchOptionsLink();
    }

    @And("^I enter Salary Min \"([^\"]*)\"$")
    public void iEnterSalaryMin(String salaryMin) throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().enterSalaryMin(salaryMin);
    }

    @And("^I enter Salary Max \"([^\"]*)\"$")
    public void iEnterSalaryMax(String salaryMax) throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().enterSalaryMax(salaryMax);
    }

    @And("^I select Salary Type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType) throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select Job Type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().selectJobTypeDropDown(jobType);
    }

    @And("^I click on Find Jobs Button$")
    public void iClickOnFindJobsButton() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().clickOnFindJobsButton();
        Thread.sleep(1000);
    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new ResultPage().verifyTheResult(result), result);
    }
}
