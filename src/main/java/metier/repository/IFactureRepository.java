package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Facture;

public interface IFactureRepository extends  JpaRepository<Facture,Long> {

}
