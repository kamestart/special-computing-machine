package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/",
glue = { "stepdefinitions" },
monochrome = true,
plugin = {"pretty", "json:target/JsonReports/report.json", "html:target/HtmlReports/reports.html", "junit:target/JunitReports/reports.xml" }
//tags = "@smoke"
)
public class TestRunner {

}
