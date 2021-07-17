package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import metier.model.Commentaire;
import metier.model.Commentaire;
import metier.repository.ICommentaireRepository;

public class CommentaireRepositoryJpa implements ICommentaireRepository {
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Commentaire> findAll() {
		TypedQuery<Commentaire> query = em.createQuery("select m from Commentaire m", Commentaire.class);
		return query.getResultList();
	}

	@Override
	public Commentaire findById(Long id) {
		return em.find(Commentaire.class, id);
	}

	@Override
	public Commentaire save(Commentaire obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Commentaire obj) {
		em.remove(em.merge(obj));
		
	}

}
