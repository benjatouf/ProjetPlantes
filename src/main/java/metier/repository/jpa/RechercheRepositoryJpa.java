package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Recherche;
import metier.repository.IRechercheRepository;

@Repository
@Transactional
public class RechercheRepositoryJpa implements IRechercheRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Recherche> findAll() {
		TypedQuery<Recherche> query = em.createQuery("select m from Recherche m", Recherche.class);
		return query.getResultList();
	}

	@Override
	public Recherche findById(Long id) {
		return em.find(Recherche.class, id);
	}

	@Override
	public Recherche save(Recherche obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Recherche obj) {
		em.remove(em.merge(obj));
		
	}
}
