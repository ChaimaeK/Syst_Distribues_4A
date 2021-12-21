package com.example.cm18octobre2021.controller;


import com.example.cm18octobre2021.dao.DemandeInterface;

import com.example.cm18octobre2021.entities.Demande;
import com.example.cm18octobre2021.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DemandeController {

    @Autowired
    private DemandeInterface demandeInterface;

    @GetMapping(value="/demandes")
    public Iterable<Demande> getAllDemande(){
        Iterable<Demande> demandesCollections = demandeInterface.findAll();
        return demandesCollections;
    }
    @GetMapping("/demandes/{idPub}")
    public Demande getOneDemande(@PathVariable long idPub){
        Demande demande = new Demande();
        Optional<Demande> optionalDemande = demandeInterface.findById(idPub);
        if(optionalDemande.isPresent()){
            demande=optionalDemande.get();
        }
        return demande;
    }
    @PostMapping(path = "/demandes")
    public Demande saveDemande(@RequestBody Demande newdemande) {
        return demandeInterface.save(newdemande);
    }
    @DeleteMapping("/demandes/{idPub}")
    public void delete(@PathVariable long idPub){
        demandeInterface.deleteById(idPub);
    }

    @PutMapping("/demandes/{idPub}")
    public  Demande update(@RequestBody Demande demande, @PathVariable long idPub){
        demande.setIdPub(idPub);
        return  demandeInterface.save(demande);
    }
}
