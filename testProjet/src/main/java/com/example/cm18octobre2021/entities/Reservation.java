package com.example.cm18octobre2021.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture;
    private Date dateReservation;
    //private enum typePaiement;
    private double tarif;
    /*@ManyToOne
    private Demandeur demandeur;
    @OneToMany
    private Offre offre;*/

    private User user;


}
