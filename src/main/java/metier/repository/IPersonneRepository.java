package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Personne;

public interface IPersonneRepository extends  JpaRepository<Personne,Long> {

}
