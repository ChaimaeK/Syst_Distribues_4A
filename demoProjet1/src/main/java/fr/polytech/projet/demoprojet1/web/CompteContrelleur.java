package fr.polytech.projet.demoprojet1.web;

import fr.polytech.projet.demoprojet1.dao.Compte;
import fr.polytech.projet.demoprojet1.dao.CompteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component  //scan la class
@Path("/commerce") //répéroire
public class CompteContrelleur {
    //injection des dépendances et inversion de contrôle(on passe par l'interface
    //pour le projet on passe direct par metier, on utilise l'APRS
    @Autowired
    private CompteInterface compteInterface;

    @Path("/comptes")   //sous-répértoire
    @GET    //c'est le verbe
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> compteList(){     //la méthode represente +eurs ressources
        return compteInterface.findAll();
    }

    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte getCompte(@PathParam(value="id") int id){
        return compteInterface.findById(id).get();
    }

    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Compte save(Compte compte){
        return compteInterface.save(compte);
    }


}
/*
pour executer, au lieu de: localhost:8181/h2-console
                           localhost:8181/commerce-comptes

    classe optionnelle:
 */

