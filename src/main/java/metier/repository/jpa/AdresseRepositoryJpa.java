package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Admin;
import metier.model.Adresse;
import metier.repository.IAdresseRepository;
@Repository
@Transactional
public class AdresseRepositoryJpa implements IAdresseRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Adresse> findAll() {
		TypedQuery<Adresse> query = em.createQuery("select m from Adresse m", Adresse.class);
		return query.getResultList();
	}

	@Override
	public Adresse findById(Long id) {
		return em.find(Adresse.class, id);
	}

	@Override
	public Adresse save(Adresse obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Adresse obj) {
		em.remove(em.merge(obj));
		
	}

}
