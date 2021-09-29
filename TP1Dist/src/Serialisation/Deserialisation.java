package Serialisation;

import java.io.File;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

//****** Chaimae ******

public class Deserialisation {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Personne.class);
        Unmarshaller um = jc.createUnmarshaller();
        Personne p1 = (Personne)um.unmarshal(new File("resultat.xml"));
        //recuperer les donnees du fichier
        System.out.println(p1.getNom());
        System.out.println(p1.getPrenom());

    }
}
