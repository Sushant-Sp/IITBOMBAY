package Assignment.IITB.service;

import Assignment.IITB.entity.CourseInstanceEntity;
import org.springframework.stereotype.Service;

@Service
public interface InstanceService {

    CourseInstanceEntity createCourseInstance (CourseInstanceEntity courseInstanceEntity);


}
