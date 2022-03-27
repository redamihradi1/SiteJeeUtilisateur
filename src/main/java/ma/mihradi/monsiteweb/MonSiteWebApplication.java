package ma.mihradi.monsiteweb;

import ma.mihradi.monsiteweb.entities.Utilisateur;
import ma.mihradi.monsiteweb.repositories.UtilisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MonSiteWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonSiteWebApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UtilisateurRepository utilisateurRepository){
        return args -> {
            Utilisateur u1 = new Utilisateur(null,"reda","reda","mihradi","reda",2000.0,23);
            Utilisateur u2 = new Utilisateur(null,"rim","rim","mihradi","rim",2000.0,18);
            Utilisateur u3 = new Utilisateur(null,"rayan","rim","mihradi","rim",2000.0,15);
            utilisateurRepository.save(u1);
            utilisateurRepository.save(u2);
            utilisateurRepository.save(u3);





        };}


}
