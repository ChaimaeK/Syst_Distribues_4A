package com.example.cm18octobre2021.controller;

import com.example.cm18octobre2021.dao.OffreInterface;
import com.example.cm18octobre2021.dao.UserInterface;
import com.example.cm18octobre2021.entities.Reservation;
import com.example.cm18octobre2021.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    @Autowired
    private UserInterface userInterface;
    @Autowired
    private OffreInterface offreInterface;

    @PostMapping("/reserverOffre")
    public User reserverOffre(@RequestBody Reservation request){
        return userInterface.save(request.getUser());
    }
    @PostMapping("/findAllReservations")
    public List<User> findAllReservations(){
        return userInterface.findAll();
    }
}
