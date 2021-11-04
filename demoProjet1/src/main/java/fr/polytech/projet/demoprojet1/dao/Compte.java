package fr.polytech.projet.demoprojet1.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//annotation JPA..
//il faut ajouter la dependence JPA pour utiliser @Entity
@Entity //on veut que les objets de la classe Compte soient sauvegarder dans une base de donnée
//@Entity (name = "x")  **On peut preciser le nom de la table de données créée, sinon, elle prends le nom de la classe
public class Compte {
    @Id //il faut preciser la clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pour que la clé primaire soit auto-incrementée: de 1

    private int id;
    private double solde;

    public Compte() {
    }

    public Compte(int id, double solde) {
        this.id = id;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                '}';
    }
}
/*
Dependences: SQL:Spring Data JPA, H2 Database,
             Web: Spring Web, Jersey,
             Developper Tools: Developper Boot DevTools (pour ne pas relancer le serveur manuellement)
Pour ajouter une dependence à un projet existant, on l'ajoute dans le fichier pom.xml.. Pour trouver le syntaxe: e.g: google/mysql dependency maven

Servlet dispatcher
APRs: ressources:
      et verbe: (get, put(MAJ), post(Creation des ressources), delete)
      Path
 */
