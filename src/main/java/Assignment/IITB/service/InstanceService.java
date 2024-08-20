package Assignment.IITB.service;

import Assignment.IITB.entity.CourseInstanceEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstanceService {

    CourseInstanceEntity createCourseInstance (CourseInstanceEntity courseInstanceEntity);
    List<CourseInstanceEntity> getAllInstance();
    CourseInstanceEntity getCourseInstanceByID(Long id);
    void deleteInstanceById(Long id);



}
