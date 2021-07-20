package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.RecetteJardin;
import metier.repository.IRecetteJardinRepository;
@Repository
@Transactional
public class RecetteJardinRepositoryJpa implements IRecetteJardinRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<RecetteJardin> findAll() {
		TypedQuery<RecetteJardin> query = em.createQuery("select m from RecetteJardin m", RecetteJardin.class);
		return query.getResultList();
	}

	@Override
	public RecetteJardin findById(Long id) {
		return em.find(RecetteJardin.class, id);
	}

	@Override
	public RecetteJardin save(RecetteJardin obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(RecetteJardin obj) {
		em.remove(em.merge(obj));
		
	}
}
