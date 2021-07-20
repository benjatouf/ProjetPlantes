package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Admin;

public interface IAdminRepository extends  JpaRepository<Admin,Long>{
	
}
