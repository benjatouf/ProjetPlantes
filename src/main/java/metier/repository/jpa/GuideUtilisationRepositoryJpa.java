package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.GuideUtilisation;
import metier.repository.IGuideUtilisationRepository;

@Repository
@Transactional
public class GuideUtilisationRepositoryJpa implements IGuideUtilisationRepository{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<GuideUtilisation> findAll() {
		TypedQuery<GuideUtilisation> query = em.createQuery("select m from GuideUtilisation m", GuideUtilisation.class);
		return query.getResultList();
	}

	@Override
	public GuideUtilisation findById(Long id) {
		return em.find(GuideUtilisation.class, id);
	}

	@Override
	public GuideUtilisation save(GuideUtilisation obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(GuideUtilisation obj) {
		em.remove(em.merge(obj));
		
	}
}
