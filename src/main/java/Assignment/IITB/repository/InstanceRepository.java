package Assignment.IITB.repository;

import Assignment.IITB.entity.CourseInstanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InstanceRepository extends JpaRepository<CourseInstanceEntity, Long> {

}