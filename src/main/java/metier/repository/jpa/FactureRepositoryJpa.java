package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Facture;
import metier.repository.IFactureRepository;

@Repository
@Transactional
public class FactureRepositoryJpa implements IFactureRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Facture> findAll() {
		TypedQuery<Facture> query = em.createQuery("select m from Facture m", Facture.class);
		return query.getResultList();
	}

	@Override
	public Facture findById(Long id) {
		return em.find(Facture.class, id);
	}

	@Override
	public Facture save(Facture obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Facture obj) {
		em.remove(em.merge(obj));
		
	}
}
