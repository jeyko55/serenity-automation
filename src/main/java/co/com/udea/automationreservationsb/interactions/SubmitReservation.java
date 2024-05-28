package co.com.udea.automationreservationsb.interactions;

import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;


public class SubmitReservation implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ReservationPage.SUBMIT_BUTTON));
        actor.attemptsTo(Open.url("https://sites.auburn.edu/SitePages/Success.aspx"));
    }
    public static SubmitReservation submitReservation(){
        return Tasks.instrumented(SubmitReservation.class);
    }
}