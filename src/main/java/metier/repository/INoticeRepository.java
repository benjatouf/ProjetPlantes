package metier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.model.Notice;

public interface INoticeRepository extends  JpaRepository<Notice,Long> {

}
