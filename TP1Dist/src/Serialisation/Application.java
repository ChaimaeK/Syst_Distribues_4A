package Serialisation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

//****** Chaimae ******
//****** Serialisation *******

public class Application {
    public static void main(String[] args) throws JAXBException{
        JAXBContext jc = JAXBContext.newInstance(Personne.class);
        Personne p = new Personne("KHARBOUCH", "Chaimae", new Date(24,2,2000));

        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  //préciser le format du fichier de sortie
        m.marshal(p, new File("resultat.xml")); //sérialiser et creer un fichier de sortie
/*
        System.out.println("Liste de Personnes");

        JAXBContext jc_1 = JAXBContext.newInstance(Personnes.class);
        Personnes ps = new Personnes();

        ps.getPersonnes().add(new Personne("A","B", new Date (1,1,2021));
        ps.getPersonnes().add(new Personne("C","D", new Date (2,2,2021));
        ps.getPersonnes().add(new Personne("E","F", new Date (3,3,2021));
        ps.getPersonnes().add(new Personne("G","H", new Date (4,4,2021));
        ps.getPersonnes().add(new Personne("A","B", new Date (1,1,2021));
        ps.getPersonnes().add(new Personne("C","D", new Date (2,2,2021));

        Marshaller ms =jc_1.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshaller(ps, new File("resultat1.xml");
*/
    }

    
}
