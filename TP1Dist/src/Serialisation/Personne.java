package Serialisation;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//****** Chaimae ******

@XmlRootElement (name = "etudiant") //Pour nommer la balise mere, si on le précise pas elle prend le nom de la classe
public class Personne implements Serializable {
    //tous les attributs doivent être de type private...
    //la classe est dotée forcement d'un constructeur sans parametre...
    //des getter et setter

    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Personne() {
    }
    public Personne(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    @XmlAttribute //
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
