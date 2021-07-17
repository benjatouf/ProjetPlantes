package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Admin;
import metier.repository.IAdminRepository;
@Repository
@Transactional(readOnly = true)
public class AdminRepositoryJpa implements IAdminRepository{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Admin> findAll() {
		TypedQuery<Admin> query = em.createQuery("select m from Matiere m", Admin.class);

		return query.getResultList();
	}

	@Override
	public Admin findById(Long id) {
		return em.find(Admin.class, id);
	}

	@Override
	@Transactional(readOnly = false)
	public Admin save(Admin obj) {
		return em.merge(obj);
	}

	@Transactional(readOnly = false)
	public void delete(Admin obj) {
		em.remove(em.merge(obj));
	}

}
