package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.RecetteJardin;

public interface IRecetteJardinRepository extends  JpaRepository<RecetteJardin,Long> {

}
