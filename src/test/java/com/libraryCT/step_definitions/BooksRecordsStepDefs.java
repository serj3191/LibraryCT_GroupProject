package com.libraryCT.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BooksRecordsStepDefs {

    @Then("the user should see default book record is {int}")
    public void the_user_should_see_default_book_record_is(Integer int1) {

    }
    @When("the user click on record number option")
    public void the_user_click_on_record_number_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see following record options")
    public void the_user_should_see_following_record_options(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }


}
