package co.com.udea.automationreservationsb.interactions;

import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class FillFirstPassenger implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Pepito").into(ReservationPage.FIRSTPASSENGER_NAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Garcia").into(ReservationPage.FIRSTPASSENGER_LASTNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("18/08/2000").into(ReservationPage.FIRSTPASSENGER_BIRTHDAY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("3092553972").into(ReservationPage.FIRSTPASSENGER_PHONENUMBER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("pepito.garcia@udea.edu.co").into(ReservationPage.FIRSTPASSENGER_EMAIL_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Masculino").into(ReservationPage.FIRSTPASSENGER_GENDER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Cedula").into(ReservationPage.FIRSTPASSENGER_DOCUMENTTYPE_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("123456798").into(ReservationPage.FIRSTPASSENGER_DOCUMENT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Colombia").into(ReservationPage.FIRSTPASSENGER_COUNTRY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Antioquia").into(ReservationPage.FIRSTPASSENGER_DEPARTMENT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Medellin").into(ReservationPage.FIRSTPASSENGER_CITY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Calle de Pepito").into(ReservationPage.FIRSTPASSENGER_ADDRESS_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("1234").into(ReservationPage.FIRSTPASSENGER_PASSWORD_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Fulana").into(ReservationPage.FIRSTPASSENGER_EMERGENCYNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("de las Nieves").into(ReservationPage.FIRSTPASSENGER_EMERGENCYLASTNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("789456123").into(ReservationPage.FIRSTPASSENGER_EMERGENCYPHONENUMBER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Avenida de Fulana").into(ReservationPage.FIRSTPASSENGER_EMERGENCYADDRESS_TEXT).thenHit(Keys.RETURN));

    }
    public static FillFirstPassenger fillFirstPassenger(){
        return Tasks.instrumented(FillFirstPassenger.class);
    }
}