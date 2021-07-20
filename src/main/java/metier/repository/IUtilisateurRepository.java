package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Utilisateur;

public interface IUtilisateurRepository extends  JpaRepository<Utilisateur,Long> {

}
