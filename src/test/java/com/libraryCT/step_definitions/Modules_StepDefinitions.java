package com.libraryCT.step_definitions;
import com.libraryCT.pages.LibrarianDashboardPage;
import com.libraryCT.pages.StudentBooksPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static com.libraryCT.utilities.BrowserUtils.*;
import java.util.List;

public class Modules_StepDefinitions {
    @Then("the student should see following modules")
    public void the_student_should_see_following_modules(List<String> modules) {
        List<String> actualModulesTexts = getListOfElementsText(new StudentBooksPage().menuLinks);
        Assert.assertEquals(modules,actualModulesTexts);
    }

    @Then("the librarian should see following modules")
    public void the_librarian_should_see_following_modules(List<String> modules) {
        List<String> actualModulesTexts = getListOfElementsText(new LibrarianDashboardPage().menuLinks);
        Assert.assertEquals(modules,actualModulesTexts);
    }
}
