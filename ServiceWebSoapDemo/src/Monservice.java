import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//****** Chaimae ******

@WebService(targetNamespace ="http://www.sir.fr")
public class Monservice {
    @WebMethod(operationName="affichage") //si on precise pas le nom, elle va prendre le nom  afficher
    public String afficher(){
        return "Mon premier service web SOAP !";
    }

    @WebMethod(operationName="promo")
    public double conversion(@WebParam(name="mt") double montant){
        return montant*0.25;
    }

}
