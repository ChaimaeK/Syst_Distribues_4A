package fr.polytech.projet.demoprojet1.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CompteInterface extends JpaRepository<Compte, Integer> {   //prends 2 parametre: <la classe,type clé primaire>

/*
on passe par une interface pour acceder à la base de donnée:
**on veut une application férmée à la modification et évolutive
si on change l'interface on change notre application(non seulement l'evoluer)

 */
}
