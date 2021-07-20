package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.SousGuide;
import metier.repository.ISousGuideRepository;
@Repository
@Transactional
public class SousGuideRepositoryJpa implements ISousGuideRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<SousGuide> findAll() {
		TypedQuery<SousGuide> query = em.createQuery("select m from SousGuide m", SousGuide.class);
		return query.getResultList();
	}

	@Override
	public SousGuide findById(Long id) {
		return em.find(SousGuide.class, id);
	}

	@Override
	public SousGuide save(SousGuide obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(SousGuide obj) {
		em.remove(em.merge(obj));
		
	}
}
