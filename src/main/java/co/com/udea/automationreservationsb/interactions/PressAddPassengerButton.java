package co.com.udea.automationreservationsb.interactions;

import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class PressAddPassengerButton implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ReservationPage.ADDPASSENGER_BUTTON));
    }
    public static PressAddPassengerButton pressAddPassengerButton(){
        return Tasks.instrumented(PressAddPassengerButton.class);
    }
}
