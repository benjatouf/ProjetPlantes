package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Vegetal;
import metier.repository.IVegetalRepository;
@Repository
@Transactional
public class VegetalRepositoryJpa implements IVegetalRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Vegetal> findAll() {
		TypedQuery<Vegetal> query = em.createQuery("select m from Vegetal m", Vegetal.class);
		return query.getResultList();
	}

	@Override
	public Vegetal findById(Long id) {
		return em.find(Vegetal.class, id);
	}

	@Override
	public Vegetal save(Vegetal obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Vegetal obj) {
		em.remove(em.merge(obj));
		
	}
}
