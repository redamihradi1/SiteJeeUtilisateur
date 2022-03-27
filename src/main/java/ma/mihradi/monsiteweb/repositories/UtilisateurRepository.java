package ma.mihradi.monsiteweb.repositories;

import ma.mihradi.monsiteweb.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
