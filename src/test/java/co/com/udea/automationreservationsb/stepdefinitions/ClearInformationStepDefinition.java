package co.com.udea.automationreservationsb.stepdefinitions;

import co.com.udea.automationreservationsb.tasks.FillOnePassengerTask;
import co.com.udea.automationreservationsb.tasks.OpenReservationPage;
import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ClearAllFieldsStepDefinition {

    //actor
    private final Actor actor = Actor.named("Jacobo");

    //driver
    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    //inicializar
    @Before
    public void init() {
        actor.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("the user is on the flight reservation page")
    public void userIsOnReservationPage() {

        actor.attemptsTo(OpenReservationPage.browser(new ReservationPage()));
    }
    @When("the user fills in the passenger information")
    public void userFillsPassengerInformation() {
        actor.attemptsTo(FillOnePassengerTask.fillOnePassengerTask());
    }

    @When("the user presses the Clear button")
    public void userPressesClearButton(){
        actor.attemptsTo(FillOnePassengerTask.fillOnePassengerTask());
    }
    @Then("all the passenger information fields should be empty")

}