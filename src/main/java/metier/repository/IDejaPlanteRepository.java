package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.DejaPlante;

public interface IDejaPlanteRepository extends  JpaRepository<DejaPlante,Long> {

}
