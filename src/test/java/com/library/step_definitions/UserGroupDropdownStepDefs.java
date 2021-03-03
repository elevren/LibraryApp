package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserGroupDropdownStepDefs {

    @Given("the librarian logged in the application")
    public void the_librarian_logged_in_the_application() {

        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login();
        BrowserUtils.waitForPageToLoad(3);

    }

    @Given("the librarian clicked on Users on top the page")
    public void the_librarian_clicked_on_on_top_the_page() {

        BrowserUtils.waitFor(3);

        WebElement element = Driver.get().findElement(By.xpath("(//span[@class='title'])[2]"));
        element.click();

    }

    @Then("the librarian navigates to {string} page")
    public void the_librarian_navigates_to_page(String string) {

        BrowserUtils.waitFor(3);

        String pageSubTitle = "User Management";
        Assert.assertEquals(string, pageSubTitle);

    }

    @When("the librarian clicks on {string} in the drop-down menu called User Group")
    public void the_librarian_clicks_on_in_the_drop_down_menu_called_User_Group(String string) {

        BrowserUtils.waitFor(3);

        WebElement dropdownElement = Driver.get().findElement(By.id("user_groups"));
        Select userGroups = new Select(dropdownElement);

        userGroups.selectByVisibleText(string);

    }

    @Then("the column called Group in the table should show only {string}")
    public void the_column_called_Group_in_the_table_should_show_only(String string) {

        BrowserUtils.waitFor(3);

        new UsersPage().tableUserNames(string);

    }

}
