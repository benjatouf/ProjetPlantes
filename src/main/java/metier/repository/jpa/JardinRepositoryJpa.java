package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Jardin;
import metier.repository.IJardinRepository;

@Repository
@Transactional
public class JardinRepositoryJpa implements IJardinRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Jardin> findAll() {
		TypedQuery<Jardin> query = em.createQuery("select m from Jardin m", Jardin.class);
		return query.getResultList();
	}

	@Override
	public Jardin findById(Long id) {
		return em.find(Jardin.class, id);
	}

	@Override
	public Jardin save(Jardin obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Jardin obj) {
		em.remove(em.merge(obj));
		
	}
}
