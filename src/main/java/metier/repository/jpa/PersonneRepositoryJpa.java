package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Personne;
import metier.repository.IPersonneRepository;
@Repository
@Transactional
public class PersonneRepositoryJpa implements IPersonneRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Personne> findAll() {
		TypedQuery<Personne> query = em.createQuery("select m from Personne m", Personne.class);
		return query.getResultList();
	}

	@Override
	public Personne findById(Long id) {
		return em.find(Personne.class, id);
	}

	@Override
	public Personne save(Personne obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Personne obj) {
		em.remove(em.merge(obj));
		
	}
}
