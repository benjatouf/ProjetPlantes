package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import metier.model.Commande;
import metier.model.Commande;
import metier.repository.ICommandeRepository;

public class CommandeRepositoryJpa implements ICommandeRepository {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Commande> findAll() {
		TypedQuery<Commande> query = em.createQuery("select m from Commande m", Commande.class);

		return query.getResultList();
	}

	@Override
	public Commande findById(Long id) {
		return em.find(Commande.class, id);
	}

	@Override
	public Commande save(Commande obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Commande obj) {
		em.remove(em.merge(obj));
	}

}
