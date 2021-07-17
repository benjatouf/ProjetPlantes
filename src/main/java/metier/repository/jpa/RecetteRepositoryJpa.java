package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Recette;
import metier.repository.IRecetteRepository;
@Repository
@Transactional
public class RecetteRepositoryJpa implements IRecetteRepository{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Recette> findAll() {
		TypedQuery<Recette> query = em.createQuery("select m from Recette m", Recette.class);
		return query.getResultList();
	}

	@Override
	public Recette findById(Long id) {
		return em.find(Recette.class, id);
	}

	@Override
	public Recette save(Recette obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Recette obj) {
		em.remove(em.merge(obj));
		
	}
}
