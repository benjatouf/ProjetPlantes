package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Recette;

public interface IRecetteRepository extends  JpaRepository<Recette,Long> {

}
