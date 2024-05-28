package co.com.udea.automationreservationsb.stepdefinitions;

import co.com.udea.automationreservationsb.questions.ValidationSuccessPage;
import co.com.udea.automationreservationsb.tasks.FillOnePassengerTask;
import co.com.udea.automationreservationsb.tasks.OpenReservationPage;
import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import co.com.udea.automationreservationsb.utils.Constants2;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class FillOnePassengerStepDefinition {

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

    @When("the user fills in the passenger information")
    public void userFillsPassengerInformation(){
        actor.attemptsTo(FillOnePassengerTask.fillOnePassengerTask());
    }

    @When("the user submits the reservation")
    public void userSubmitsReservation(){
        actor.attemptsTo(FillOnePassengerTask.fillOnePassengerTask());
    }

    // El front no devuelve ningún mensaje de éxito
    @Then("the reservation should be created successfully")
    public void reservationSuccessfully(){
        GivenWhenThen.then(actor).should(GivenWhenThen.seeThat(ValidationSuccessPage.titleSuccess(), Matchers.containsString(Constants2.VAL_SUCCESS)));
    }
}