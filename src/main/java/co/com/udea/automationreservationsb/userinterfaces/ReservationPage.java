package co.com.udea.automationreservationsb.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ReservationPage extends PageObject {
    public static final Target RESERVATION_BUTTON = Target.the("boton reservar").locatedBy("ter rounded-xl bg-[#2196F3] text-xl font-bold text-white']");
    public static final Target SUBMIT_BUTTON = Target.the("boton guardar reserva").locatedBy("//*[@type='submit']");
    public static final  Target TITLESUCCESSFUL_PAGE =Target.the("el link de la pagina de entrega exitosa").locatedBy("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/span");
    public static final  Target ADDPASSENGER_BUTTON =Target.the("boton de Agregar Pasajero").locatedBy("//*[@d='M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2m5 11h-4v4h-2v-4H7v-2h4V7h2v4h4z']");

    public static final  Target FIRSTPASSENGER_NAMES_TEXT =Target.the("nombres").locatedBy("/html/body/div/form/section[1]/ul/li[1]/input");
    public static final  Target FIRSTPASSENGER_LASTNAMES_TEXT =Target.the("apellidos").locatedBy("/html/body/div/form/section[1]/ul/li[2]/input");
    public static final  Target FIRSTPASSENGER_BIRTHDAY_TEXT =Target.the("fecha nacimiento").locatedBy("/html/body/div/form/section[1]/ul/li[3]/input");
    public static final  Target FIRSTPASSENGER_PHONENUMBER_TEXT =Target.the("telefono").locatedBy("/html/body/div/form/section[1]/ul/li[4]/input");
    public static final  Target FIRSTPASSENGER_EMAIL_TEXT =Target.the("email").locatedBy("/html/body/div/form/section[1]/ul/li[5]/input");
    public static final  Target FIRSTPASSENGER_GENDER_TEXT =Target.the("genero").locatedBy("/html/body/div/form/section[1]/ul/li[6]/select");
    public static final  Target FIRSTPASSENGER_DOCUMENTTYPE_TEXT =Target.the("tipo documento").locatedBy("/html/body/div/form/section[1]/ul/li[7]/select");
    public static final  Target FIRSTPASSENGER_DOCUMENT_TEXT =Target.the("documento").locatedBy("/html/body/div/form/section[1]/ul/li[8]/input");
    public static final  Target FIRSTPASSENGER_COUNTRY_TEXT =Target.the("pais").locatedBy("/html/body/div/form/section[1]/ul/li[9]/input");
    public static final  Target FIRSTPASSENGER_DEPARTMENT_TEXT =Target.the("departamento").locatedBy("/html/body/div/form/section[1]/ul/li[10]/input");
    public static final  Target FIRSTPASSENGER_CITY_TEXT =Target.the("ciudad").locatedBy("/html/body/div/form/section[1]/ul/li[11]/input");
    public static final  Target FIRSTPASSENGER_ADDRESS_TEXT =Target.the("direccion").locatedBy("/html/body/div/form/section[1]/ul/li[12]/input");
    public static final  Target FIRSTPASSENGER_PASSWORD_TEXT =Target.the("contrasena").locatedBy("/html/body/div/form/section[1]/ul/li[13]/input");
    public static final  Target FIRSTPASSENGER_EMERGENCYNAMES_TEXT =Target.the("nombres emergencia").locatedBy("/html/body/div/form/div[1]/section/ul[1]/li[1]/input");
    public static final  Target FIRSTPASSENGER_EMERGENCYLASTNAMES_TEXT =Target.the("apellidos emergecia").locatedBy("/html/body/div/form/div[1]/section/ul[1]/li[2]/input");
    public static final  Target FIRSTPASSENGER_EMERGENCYPHONENUMBER_TEXT =Target.the("telefono emergencia").locatedBy("/html/body/div/form/div[1]/section/ul[1]/li[3]/input");
    public static final  Target FIRSTPASSENGER_EMERGENCYADDRESS_TEXT =Target.the("direccion emergencia").locatedBy("/html/body/div/form/div[1]/section/ul[2]/li/input");


    public static final  Target SECONDPASSENGER_NAMES_TEXT =Target.the("nombres").locatedBy("//*[@name='tuNombre']");
    public static final  Target SECONDPASSENGER_LASTNAMES_TEXT =Target.the("apellidos").locatedBy("//*[@name='tuApellido']");
    public static final  Target SECONDPASSENGER_BIRTHDAY_TEXT =Target.the("fecha nacimiento").locatedBy("//*[@name='tuNacimiento']");
    public static final  Target SECONDPASSENGER_PHONENUMBER_TEXT =Target.the("telefono").locatedBy("//*[@name='tuTelefono']");
    public static final  Target SECONDPASSENGER_EMAIL_TEXT =Target.the("email").locatedBy("//*[@name='tuEmail']");
    public static final  Target SECONDPASSENGER_GENDER_TEXT =Target.the("genero").locatedBy("//*[@id='tuGenero']");
    public static final  Target SECONDPASSENGER_DOCUMENTTYPE_TEXT =Target.the("tipo documento").locatedBy("//*[@id='tuTipoDocumento']");
    public static final  Target SECONDPASSENGER_DOCUMENT_TEXT =Target.the("documento").locatedBy("//*[@name='tuDocumento']");
    public static final  Target SECONDPASSENGER_COUNTRY_TEXT =Target.the("pais").locatedBy("//*[@name='tuPais']");
    public static final  Target SECONDPASSENGER_DEPARTMENT_TEXT =Target.the("departamento").locatedBy("//*[@name='tuDepartamento']");
    public static final  Target SECONDPASSENGER_CITY_TEXT =Target.the("ciudad").locatedBy("//*[@name='tuCiudad']");
    public static final  Target SECONDPASSENGER_ADDRESS_TEXT =Target.the("direccion").locatedBy("//*[@name='tuDireccion']");
    public static final  Target SECONDPASSENGER_PASSWORD_TEXT =Target.the("contrasena").locatedBy("//*[@name='tuContraseña']");
    public static final  Target SECONDPASSENGER_EMERGENCYNAMES_TEXT =Target.the("nombres emergencia").locatedBy("//*[@name='nombreEmergencia']");
    public static final  Target SECONDPASSENGER_EMERGENCYLASTNAMES_TEXT =Target.the("apellidos emergecia").locatedBy("//*[@name='apellidoEmergencia']");
    public static final  Target SECONDPASSENGER_EMERGENCYPHONENUMBER_TEXT =Target.the("telefono emergencia").locatedBy("//*[@name='telefonoEmergencia']");
    public static final  Target SECONDPASSENGER_EMERGENCYADDRESS_TEXT =Target.the("direccion emergencia").locatedBy("//*[@name='direccionEmergencia']");


    public static final  Target THIRDPASSENGER_NAMES_TEXT =Target.the("nombres").locatedBy("//*[@name='tuNombre']");
    public static final  Target THIRDPASSENGER_LASTNAMES_TEXT =Target.the("apellidos").locatedBy("//*[@name='tuApellido']");
    public static final  Target THIRDPASSENGER_BIRTHDAY_TEXT =Target.the("fecha nacimiento").locatedBy("//*[@name='tuNacimiento']");
    public static final  Target THIRDPASSENGER_PHONENUMBER_TEXT =Target.the("telefono").locatedBy("//*[@name='tuTelefono']");
    public static final  Target THIRDPASSENGER_EMAIL_TEXT =Target.the("email").locatedBy("//*[@name='tuEmail']");
    public static final  Target THIRDPASSENGER_GENDER_TEXT =Target.the("genero").locatedBy("//*[@id='tuGenero']");
    public static final  Target THIRDPASSENGER_DOCUMENTTYPE_TEXT =Target.the("tipo documento").locatedBy("//*[@id='tuTipoDocumento']");
    public static final  Target THIRDPASSENGER_DOCUMENT_TEXT =Target.the("documento").locatedBy("//*[@name='tuDocumento']");
    public static final  Target THIRDPASSENGER_COUNTRY_TEXT =Target.the("pais").locatedBy("//*[@name='tuPais']");
    public static final  Target THIRDPASSENGER_DEPARTMENT_TEXT =Target.the("departamento").locatedBy("//*[@name='tuDepartamento']");
    public static final  Target THIRDPASSENGER_CITY_TEXT =Target.the("ciudad").locatedBy("//*[@name='tuCiudad']");
    public static final  Target THIRDPASSENGER_ADDRESS_TEXT =Target.the("direccion").locatedBy("//*[@name='tuDireccion']");
    public static final  Target THIRDPASSENGER_PASSWORD_TEXT =Target.the("contrasena").locatedBy("//*[@name='tuContraseña']");
    public static final  Target THIRDPASSENGER_EMERGENCYNAMES_TEXT =Target.the("nombres emergencia").locatedBy("//*[@name='nombreEmergencia']");
    public static final  Target THIRDPASSENGER_EMERGENCYLASTNAMES_TEXT =Target.the("apellidos emergecia").locatedBy("//*[@name='apellidoEmergencia']");
    public static final  Target THIRDPASSENGER_EMERGENCYPHONENUMBER_TEXT =Target.the("telefono emergencia").locatedBy("//*[@name='telefonoEmergencia']");
    public static final  Target THIRDPASSENGER_EMERGENCYADDRESS_TEXT =Target.the("direccion emergencia").locatedBy("//*[@name='direccionEmergencia']");


}
