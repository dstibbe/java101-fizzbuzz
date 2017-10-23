package nl.dstibbe.example.autotest.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(//
        strict = true, //
        // tags = { "@debug" },
        plugin = { "pretty:target/reports/pretty-full", "json:target/reports/full-test-report.json" }, //
        features = "classpath:features/", //
        glue = { "nl.dstibbe.example.autotest.glue" }//
)
public class TestRunner {
}