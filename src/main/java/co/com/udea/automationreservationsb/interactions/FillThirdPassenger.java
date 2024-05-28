package co.com.udea.automationreservationsb.interactions;

import co.com.udea.automationreservationsb.userinterfaces.ReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class FillThirdPassenger implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Perano").into(ReservationPage.THIRDPASSENGER_NAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Marrano").into(ReservationPage.THIRDPASSENGER_LASTNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("05/13/2007").into(ReservationPage.THIRDPASSENGER_BIRTHDAY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("3651235472").into(ReservationPage.THIRDPASSENGER_PHONENUMBER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("perano.marrano@udea.edu.co").into(ReservationPage.THIRDPASSENGER_EMAIL_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Masculino").into(ReservationPage.THIRDPASSENGER_GENDER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Cedula").into(ReservationPage.THIRDPASSENGER_DOCUMENTTYPE_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("84351").into(ReservationPage.THIRDPASSENGER_DOCUMENT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Colombia").into(ReservationPage.THIRDPASSENGER_COUNTRY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Antioquia").into(ReservationPage.THIRDPASSENGER_DEPARTMENT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Medellin").into(ReservationPage.THIRDPASSENGER_CITY_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Calle de Perano").into(ReservationPage.THIRDPASSENGER_ADDRESS_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("789465").into(ReservationPage.THIRDPASSENGER_PASSWORD_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Fulana").into(ReservationPage.THIRDPASSENGER_EMERGENCYNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("de las Nieves").into(ReservationPage.THIRDPASSENGER_EMERGENCYLASTNAMES_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("789456123").into(ReservationPage.THIRDPASSENGER_EMERGENCYPHONENUMBER_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Enter.theValue("Avenida de Fulana").into(ReservationPage.THIRDPASSENGER_EMERGENCYADDRESS_TEXT).thenHit(Keys.RETURN));
    }
    public static FillThirdPassenger fillThirdPassenger(){
        return Tasks.instrumented(FillThirdPassenger.class);
    }
}