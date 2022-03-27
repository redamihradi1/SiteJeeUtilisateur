package ma.mihradi.monsiteweb.web;

import lombok.AllArgsConstructor;
import ma.mihradi.monsiteweb.entities.Utilisateur;
import ma.mihradi.monsiteweb.repositories.UtilisateurRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class UtilisateurController {
    UtilisateurRepository utilisateurRepository;

    @GetMapping(path = "/")
    public String home(Model model){
        List<Utilisateur> utilisateurList = utilisateurRepository.findAll();
        model.addAttribute("utilisateurList",utilisateurList);
        return "home";
    }

}
