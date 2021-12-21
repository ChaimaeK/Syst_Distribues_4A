package com.example.cm18octobre2021.controller;

import com.example.cm18octobre2021.dao.DemandeurInterface;
import com.example.cm18octobre2021.dao.OffreInterface;
import com.example.cm18octobre2021.entities.Demandeur;
import com.example.cm18octobre2021.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    @Autowired
    private DemandeurInterface demandeurInterface;
    @Autowired
    private OffreInterface offreInterface;

    @PostMapping("/reserverOffre")
    public Demandeur reserverOffre(@RequestBody Reservation request){
        return demandeurInterface.save(request.getDemandeur());
    }
    @PostMapping("/findAllReservations")
    public List<Demandeur> findAllReservations(){
        return demandeurInterface.findAll();
    }
}
