package Serialisation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

//****** Chaimae ******

@XmlRootElement
public class Personnes implements Serializable {
    private List<Personne> personnes=new ArrayList<>();

    public Personnes(){

    }

    public Personnes(List<Personne> personnes) {
        super();
        this.personnes = personnes;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }

}