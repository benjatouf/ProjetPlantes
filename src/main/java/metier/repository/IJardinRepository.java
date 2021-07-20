package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Jardin;

public interface IJardinRepository extends  JpaRepository<Jardin,Long> 
{

}
