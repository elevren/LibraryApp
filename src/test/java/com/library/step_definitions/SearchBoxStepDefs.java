package com.library.step_definitions;

import com.library.pages.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchBoxStepDefs {

    @When("the librarian clicks on search box and writes some user {string}")
    public void the_librarian_clicks_on_search_box_and_writes_some_user(String string) {

        new UsersPage().searchBox.sendKeys(string);

    }

    @Then("the table should contain {string}")
    public void the_table_should_contain(String string) {

        Assert.assertTrue(new UsersPage().getUserInformation().contains(string));

//        new UsersPage().getUserInformation(string);


    }

}
