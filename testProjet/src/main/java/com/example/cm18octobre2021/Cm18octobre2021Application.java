package com.example.cm18octobre2021;


//import com.example.cm18octobre2021.controller.OffreController;

/*import com.example.cm18octobre2021.dao.AdminInterface;
import com.example.cm18octobre2021.dao.CompteInterface;*/
import com.example.cm18octobre2021.dao.UserInterface;
import com.example.cm18octobre2021.entities.User;
/*import com.example.cm18octobre2021.entities.Admin;
import com.example.cm18octobre2021.entities.Compte;*/

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Cm18octobre2021Application {

    public static void main(String[] args) {
        SpringApplication.run(Cm18octobre2021Application.class, args);
    }

    @Bean
    CommandLineRunner runner(UserInterface userInterface) {

        return args -> {
            userInterface.save(new User("jean", "lolo", 22222, "tp@cedcz.com", "plombier", true, 200, 57255, "rue "));
            userInterface.save(new User("jack", "lili", 33333, "lolo.cnk@cnce.com", "prof", false, 23, 57255, "rue "));
            userInterface.save(new User("joe", "lala", 44444, "lili.rezib@vzeklfnerz.com", "conducteur", true, 23, 57255, "rue "));

        };
    }
}


