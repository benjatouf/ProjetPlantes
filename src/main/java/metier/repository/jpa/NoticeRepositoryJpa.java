package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Notice;
import metier.repository.INoticeRepository;
@Repository
@Transactional
public class NoticeRepositoryJpa implements INoticeRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Notice> findAll() {
		TypedQuery<Notice> query = em.createQuery("select m from Notice m", Notice.class);
		return query.getResultList();
	}

	@Override
	public Notice findById(Long id) {
		return em.find(Notice.class, id);
	}

	@Override
	public Notice save(Notice obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Notice obj) {
		em.remove(em.merge(obj));
		
	}
}
