package com.example.cm18octobre2021.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
public class Demande extends Publication{
    private long demandeurId;
    public Demande(){}
    public Demande(long demandeurId,String name, String text, Date created, Boolean online, String type){
        super(name, text, created, online, type);
        this.demandeurId = demandeurId;
    }

}
