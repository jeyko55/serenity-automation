package co.com.udea.automationreservationsb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.automationreservationsb.userinterfaces.ReservationPage.TITLESUCCESSFUL_PAGE;

public class ValidationSuccessPage implements Question<String> {

    public ValidationSuccessPage(){}
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITLESUCCESSFUL_PAGE).getText();
        return msg;
    }

    public static ValidationSuccessPage titleSuccess(){
        return new ValidationSuccessPage();
    }
}