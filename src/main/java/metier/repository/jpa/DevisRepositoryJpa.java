package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Devis;
import metier.repository.IDevisRepository;

@Repository
@Transactional
public class DevisRepositoryJpa implements IDevisRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Devis> findAll() {
		TypedQuery<Devis> query = em.createQuery("select m from Devis m", Devis.class);
		return query.getResultList();
	}

	@Override
	public Devis findById(Long id) {
		return em.find(Devis.class, id);
	}

	@Override
	public Devis save(Devis obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Devis obj) {
		em.remove(em.merge(obj));
		
	}
}
