package fr.polytech.projet.demoprojet1;

import fr.polytech.projet.demoprojet1.dao.Compte;
import fr.polytech.projet.demoprojet1.dao.CompteInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoProjet1Application {
//c'est le point d'entré de notre application, le seul main qu'on a, c'est ce main qu'on execute à chaque fois
    public static void main(String[] args) {
        SpringApplication.run(DemoProjet1Application.class, args);
    }

    @Bean   //pour que la methode puisse être executer au démarage **important  //execute la methode
    CommandLineRunner start(CompteInterface compteInterface){
        return args -> {
            compteInterface.save(new Compte(1,1200));
            compteInterface.save(new Compte(2,500));
            compteInterface.save(new Compte(3,340));
            compteInterface.save(new Compte(4,144));

            compteInterface.findAll().forEach(compte ->
                    System.out.println(compte.getSolde()));
        };
    }
}
