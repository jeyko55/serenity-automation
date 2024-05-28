package co.com.udea.automationreservationsb.tasks;


import co.com.udea.automationreservationsb.interactions.FillFirstPassenger;
import co.com.udea.automationreservationsb.interactions.PressReservationButton;
import co.com.udea.automationreservationsb.interactions.SubmitReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillOnePassengerTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PressReservationButton.pressReservationButton());
        actor.attemptsTo(FillFirstPassenger.fillFirstPassenger());
        actor.attemptsTo(SubmitReservation.submitReservation());
    }

    public static FillOnePassengerTask fillOnePassengerTask(){
        return Tasks.instrumented(FillOnePassengerTask.class);
    }
}
