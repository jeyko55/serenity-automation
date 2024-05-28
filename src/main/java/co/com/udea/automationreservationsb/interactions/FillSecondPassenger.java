package co.com.udea.automationreservationsb.interactions;

import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class FillSecondPassenger implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Perano").into(ReservationPage.SECONDPASSENGER_NAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Marrano").into(ReservationPage.SECONDPASSENGER_LASTNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("05/13/2007").into(ReservationPage.SECONDPASSENGER_BIRTHDAY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("3651235472").into(ReservationPage.SECONDPASSENGER_PHONENUMBER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("perano.marrano@udea.edu.co").into(ReservationPage.SECONDPASSENGER_EMAIL_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Masculino").into(ReservationPage.SECONDPASSENGER_GENDER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Cedula").into(ReservationPage.SECONDPASSENGER_DOCUMENTTYPE_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("84351").into(ReservationPage.SECONDPASSENGER_DOCUMENT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Colombia").into(ReservationPage.SECONDPASSENGER_COUNTRY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Antioquia").into(ReservationPage.SECONDPASSENGER_DEPARTMENT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Medellin").into(ReservationPage.SECONDPASSENGER_CITY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Calle de Perano").into(ReservationPage.SECONDPASSENGER_ADDRESS_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("789465").into(ReservationPage.SECONDPASSENGER_PASSWORD_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Fulana").into(ReservationPage.SECONDPASSENGER_EMERGENCYNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("de las Nieves").into(ReservationPage.SECONDPASSENGER_EMERGENCYLASTNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("789456123").into(ReservationPage.SECONDPASSENGER_EMERGENCYPHONENUMBER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Avenida de Fulana").into(ReservationPage.SECONDPASSENGER_EMERGENCYADDRESS_TEXT).thenHit(Keys.RETURN));
    }
    public static FillSecondPassenger fillSecondPassenger(){
        return Tasks.instrumented(FillSecondPassenger.class);
    }
}