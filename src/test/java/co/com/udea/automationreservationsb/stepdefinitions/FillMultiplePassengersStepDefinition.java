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

public class FillOtherPassengerStepDefinition {
    //actor
    private final Actor actor = Actor.named("Jacobo");

    //driver
    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    //inicializar
    @Before
    public void init(){
        actor.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("the user is on the flight reservation page")
    public void userIsOnReservationPage(){
        actor.attemptsTo(OpenReservationPage.browser(new ReservationPage()));
    }

    @Given("the user has an existing reservation")
    public void userFillsPassengerInformation(){
        actor.attemptsTo(FillOnePassengerTask.fillOnePassengerTask());
    }
    @When("the user navigates to the Reservar page")
    //todo
    @When("the user presses to add a new passenger")
    //todo
    @When("the user fills in the additional passenger information")
    //todo
    @When("the user submits the updated reservation")
    //todo
    @Then("the reservation should be updated successfully")
    //todo

}