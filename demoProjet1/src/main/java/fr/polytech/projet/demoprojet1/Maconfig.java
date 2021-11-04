package fr.polytech.projet.demoprojet1;


import fr.polytech.projet.demoprojet1.web.CompteContrelleur;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Maconfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.register((CompteContrelleur.class)); //la classe CompteContrelleur nous informe qu'on veut utiliser jersey
        return resourceConfig;
    }
}
