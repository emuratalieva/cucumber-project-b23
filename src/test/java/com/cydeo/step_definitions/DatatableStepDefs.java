package com.cydeo.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DatatableStepDefs {

    //@Given("I have a {word}")
    @Given("I have a {string}")
    public void i_have_a(String animal) {
        System.out.println("Given I have a " + animal);
    }

    @When("I call their names")
    public void i_call_their_names() {
        System.out.println(" When I call their names ");
    }

    @Then("They come to me.")
    public void they_come_to_me() {
        System.out.println(" Then they come to me ");
    }

    @Given("I have following animals")
    public void i_have_following_animals(List<String> animalLst) {
        System.out.println("animal list "+animalLst);

    }


    @When("I call their names with below names")
    public void iCallTheirNamesWithBelowNames(List<String> nameLst) {
        System.out.println("nameLst = " + nameLst);
    }

    @Then("They come to me with below noise")
    public void they_come_to_me_with_below_noise(Map<String,String> animalNoiseMap) {

        System.out.println("animalNoiseMap = " + animalNoiseMap);

    }


}
