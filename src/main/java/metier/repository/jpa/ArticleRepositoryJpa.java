package metier.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import metier.model.Adresse;
import metier.model.Article;
import metier.repository.IArticleRepository;

@Repository
@Transactional
public class ArticleRepositoryJpa implements IArticleRepository {
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Article> findAll() {
		TypedQuery<Article> query = em.createQuery("select m from Article m", Article.class);

		return query.getResultList();
	}

	@Override
	public Article findById(Long id) {
		return em.find(Article.class, id);
	}

	@Override
	public Article save(Article obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Article obj) {
		em.remove(em.merge(obj));
		
	}

}
