package com.microfocus.adm.octane.gherkinautomation;

import static org.junit.Assert.*;
import cucumber.api.java.en.*;

public class StepDefinitions {
    @Given("^the Google Chrome browser is open$")
    public void theGoogleChromeBrowserIsOpen() {
        System.out.println("The browser is open!");
        //assertTrue(false);
         System.out.println("The test worked!");
    }

    @When("^opening the live chat$")
    public void openingTheLiveChat() {
        System.out.println("opening live chat!");
    }

    @Then("^the chat works$")
    public void theChatWorks() {
        System.out.println("The test worked!");
        int x=5;
         System.out.println("The test worked!");
    }

    @Given("a web browser is on the Google page")
    public void aWebBrowserIsOnTheGooglePage() throws Exception {
        throw new Exception("exception in given");
         //System.out.println("The test worked!");
    }

    @When("the search phrase {string} is entered")
    public void theSearchPhraseIsEntered(String arg0) {
        
    }

    @Then("results for {string} are shown")
    public void resultsForAreShown(String arg0) throws Exception {
        //throw new Exception("exception!");
         System.out.println("The test worked!");
        
    }

    @And("the related results include {string}")
    public void theRelatedResultsInclude(String arg0) throws Exception {

    }

    @But("the related results do not include {string}")
    public void theRelatedResultsDoNotInclude(String arg0) {
    }

    @And("the following related results are shown")
    public void theFollowingRelatedResultsAreShown() throws Exception {

    }

    @And("the related results include Panda Express")
    public void theRelatedResultsIncludePandaExpress() {
    }

    @Given("I said <word>")
    public void iSaidWord() {
        
    }

    @When("You hear I said <word>")
    public void youHearISaidWord() {
        
    }

    @Then("You scram <answer>")
    public void youScramAnswer() {
    }

    @Given("I said {string}")
    public void iSaid(String arg0) {
        
    }

    @When("You hear I said {string}")
    public void youHearISaid(String arg0) {
        
    }

    @Then("You scream {string}")
    public void youScream(String arg0) {
    }

    @Given("payment security system is up")
    public void paymentSecuritySystemIsUp() {

    }

    @Given("a customer named <customer>")
    public void aCustomerNamedCustomer() {

    }

    @Given("I am logged in as <customer>")
    public void iAmLoggedInAsCustomer() {

    }

    @Given("I have at least one item in cart")
    public void iHaveAtLeastOneItemInCart() {

    }

    @When("I try to buy items in my cart")
    public void iTryToBuyItemsInMyCart() {

    }

    @Given("a customer named {string}")
    public void aCustomerNamed(String arg0) {

    }

    @Given("I am logged in as {string}")
    public void iAmLoggedInAs(String arg0) {

    }

    @Then("I confirm my payment method {string} and proceed to checkout.")
    public void iConfirmMyPaymentMethodAndProceedToCheckout(String arg0) {
    }

    @Then("hi")
    public void hi() {
    }

    @Given("g")
    public void g() {

    } 
    
    @Given("m")
    public void m(){
    }

    @When("w")
    public void w() {

    }

    @Then("t")
    public void t() {
        assertTrue(true);
    }
}
