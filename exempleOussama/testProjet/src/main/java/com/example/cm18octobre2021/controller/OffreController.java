package com.example.cm18octobre2021.controller;
import com.example.cm18octobre2021.dao.OffreInterface;
import com.example.cm18octobre2021.dao.PublicationInterface;
import com.example.cm18octobre2021.entities.Offre;
import com.example.cm18octobre2021.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController

public  class OffreController  {
    @Autowired
    private OffreInterface offreInterface;

    @GetMapping(value="/offres")
    @CrossOrigin(origins="http://localhost:4200/")
    public List<Offre> getAllOffre(){
        List<Offre> offreCollections = offreInterface.findAll();
        return offreCollections;
    }

    @GetMapping("/offres/{idPub}")
    public Offre getOneOffre(@PathVariable long idPub){
       Offre offre = new Offre();
       Optional<Offre> optionalOffre = offreInterface.findById(idPub);
       if(optionalOffre.isPresent()){
           offre=optionalOffre.get();
       }
       return offre;
    }

    @PostMapping(path = "/offres")
    public Offre saveOffre(@RequestBody Offre newoffre) {
        return offreInterface.save(newoffre);
    }
    @DeleteMapping("/offres/{idPub}")
    @CrossOrigin(origins="http://localhost:4200/")
    public void delete(@PathVariable long idPub){
        offreInterface.deleteById(idPub);
    }

    @PutMapping("/offres/{idPub}")
    public  Offre update(@RequestBody Offre offre, @PathVariable long idPub){
        offre.setIdPub(idPub);
        return  offreInterface.save(offre);
    }

/*
    @PostMapping(value = "/offres")
    public Offre addOffre ( @RequestParam(value = "acteurId") long acteurId,
        @RequestParam(value = "name") String name, @RequestParam(value = "text") String text,
        @RequestParam(value = "created") Date created,
        @RequestParam(value = "online") Boolean online, @RequestParam(value = "type") String type,
        @RequestParam(value = "prix") double prix){
            Offre newOffre = new Offre(acteurId, name, text, created, online, type, prix);

            offreInterface.save(newOffre);
            return newOffre;
        }*/
}



