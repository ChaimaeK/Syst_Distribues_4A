package com.example.cm18octobre2021.entities;


import lombok.*;
import com.example.cm18octobre2021.entities.Publication;


import javax.persistence.*;
import java.util.*;

@Data
@Getter
@Setter
@Entity
public class Demandeur extends Compte{
    private int codePostal;
    private String adresse;
    @OneToMany(targetEntity = Offre.class,cascade= CascadeType.ALL)
    @JoinColumn(name="od_fk",referencedColumnName = "Id_user")
    private List<Offre> offre;

    public Demandeur(){}
    public Demandeur(String full_name ,String password ,long telephone, String email, int codePostal, String adresse) {
        super(full_name, password, telephone, email);
        this.codePostal = codePostal;
        this.adresse = adresse;

    /*public Publication Poster_Demande(String name, String text, Date created, Boolean online, String type){
        Publication dem = new Publication(name, text, created, online, type);
            return dem;
        }*/


    }
    }


