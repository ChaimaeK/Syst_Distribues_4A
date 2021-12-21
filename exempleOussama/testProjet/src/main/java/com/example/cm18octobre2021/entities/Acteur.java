package com.example.cm18octobre2021.entities;

import lombok.*;

import javax.persistence.Entity;

@Data
@Getter
@Setter
@Entity
public class Acteur extends Compte{
    private String profession;
    private boolean disponible;
    private int total_services;
    public Acteur(){}
    public Acteur(String full_name ,String password ,long telephone, String email, String profession, boolean disponible,int total_services){
        super(full_name, password,telephone,email);
        this.profession=profession;
        this.disponible=disponible;
        this.total_services=total_services;


    }

}
