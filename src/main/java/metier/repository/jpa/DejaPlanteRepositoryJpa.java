package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.DejaPlante;
import metier.model.DejaPlante;
import metier.repository.IDejaPlanteRepository;
@Repository
@Transactional
public class DejaPlanteRepositoryJpa implements IDejaPlanteRepository {
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<DejaPlante> findAll() {
		TypedQuery<DejaPlante> query = em.createQuery("select m from DejaPlante m", DejaPlante.class);
		return query.getResultList();
	}

	@Override
	public DejaPlante findById(Long id) {
		return em.find(DejaPlante.class, id);
	}

	@Override
	public DejaPlante save(DejaPlante obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(DejaPlante obj) {
		em.remove(em.merge(obj));
	}

}
