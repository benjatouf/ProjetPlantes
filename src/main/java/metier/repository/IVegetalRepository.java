package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Vegetal;

public interface IVegetalRepository extends  JpaRepository<Vegetal,Long> {

}
