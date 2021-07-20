package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.SousGuide;

public interface ISousGuideRepository extends  JpaRepository<SousGuide,Long> {

}
