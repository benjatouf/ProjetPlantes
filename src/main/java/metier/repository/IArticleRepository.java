package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Article;

public interface IArticleRepository extends  JpaRepository<Article,Long> {

}
