package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Adresse;

public interface IAdresseRepository extends  JpaRepository<Adresse,Long> {

}
