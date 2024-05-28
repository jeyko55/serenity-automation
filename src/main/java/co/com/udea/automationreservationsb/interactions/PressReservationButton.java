package co.com.udea.automationreservationsb.interactions;

import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class PressReservationButton implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ReservationPage.RESERVATION_BUTTON));
    }
    public static PressReservationButton pressReservationButton(){
        return Tasks.instrumented(PressReservationButton.class);
    }
}