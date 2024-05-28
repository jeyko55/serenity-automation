package co.com.udea.automationreservationsb.tasks;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenReservationPage implements Task {

    private PageObject page;

    public OpenReservationPage(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(this.page));
    }

    public static OpenReservationPage browser(PageObject page){
        return Tasks.instrumented(OpenReservationPage.class,page);
    }
}