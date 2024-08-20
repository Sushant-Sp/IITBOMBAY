package Assignment.IITB.service;

import Assignment.IITB.entity.CourseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {

    CourseEntity createCourse(CourseEntity course);


}
