package com.libraryCT.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(//abstract methods?
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/libraryCT/step_definitions",
        dryRun = true,
        tags = "@wip"



)


public class CukesRunner {//?

}
