package co.com.udea.automationreservationsb.tasks;

import co.com.udea.automationreservationsb.interactions.FillFirstPassenger;
import co.com.udea.automationreservationsb.interactions.FillSecondPassenger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillTwoPassengersTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(FillFirstPassenger.fillFirstPassenger());
        actor.attemptsTo(FillSecondPassenger.fillSecondPassenger());
    }

    public static FillTwoPassengersTask fillTwoPassengersTask() {

        return Tasks.instrumented(FillTwoPassengersTask.class);
    }
}
