import javax.xml.ws.Endpoint;

//****** Chaimae ******

public class Deploiement {

    public static void main(String[]args){
        String url ="http://localhost:8686/";

        //Monservice ms = new Monservice();
        Endpoint.publish(url,new Monservice());
        System.out.println("WSDL accessible à l'adresse" + url);
    }
}
