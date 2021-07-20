package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Commande;

public interface ICommandeRepository extends  JpaRepository<Commande,Long> {

}
