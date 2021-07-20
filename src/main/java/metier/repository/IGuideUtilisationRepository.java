package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.GuideUtilisation;

public interface IGuideUtilisationRepository extends  JpaRepository<GuideUtilisation,Long> {

}
