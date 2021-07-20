package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Commentaire;

public interface ICommentaireRepository extends  JpaRepository<Commentaire,Long> {

}
