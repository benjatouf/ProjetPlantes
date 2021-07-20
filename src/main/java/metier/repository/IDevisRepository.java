package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Devis;

public interface IDevisRepository extends  JpaRepository<Devis,Long> {

}
