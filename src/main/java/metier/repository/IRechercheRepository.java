package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Recherche;

public interface IRechercheRepository extends  JpaRepository<Recherche,Long> {

}
