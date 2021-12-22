package com.example.cm18octobre2021.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
public class Offre extends Publication {
    private double prix;
    private long acteurId;
    //@ManyToOne(mappedBy="Offre")
    //private Collection<Paiement> paiement;

    public Offre(){}
    public Offre(long acteurId,String name, String text,  Date created, Boolean online, String type,double prix){
        super(name, text,created, online, type);
        this.acteurId = acteurId;
        this.prix = prix;
    }
    /*public void confirmer(long idOffre){setOnline(false);
    }
    public  void annuler(long idOffre){
        setOnline(true);
    }*/
}
