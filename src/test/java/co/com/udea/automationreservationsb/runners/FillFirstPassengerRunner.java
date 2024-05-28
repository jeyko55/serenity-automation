package co.com.udea.automationreservationsb.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/fill_one_passenger.feature",
        glue = "co.com.udea.automationreservationsb.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class FillFirstPassengerRunner {
}