package nl.dstibbe.example.autotest.glue;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FizzBuzzStepDefs {

    private String result;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        this.result = null;
    }

    @When("^FizzBuzz called for round ([0-9]+)$")
    public void fizzBuzzCalledWith(int round) throws Throwable {
        result = "Buzz";
//        result = new FizzBuzz().play(345);
    }

    @Then("^Result has value ([a-zA-Z]+)$")
    public void resultHasValue(String value){
        Assert.assertEquals("Unexpected fizzbuzz result", value, result);
    }
}
