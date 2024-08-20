package Assignment.IITB.service;

import Assignment.IITB.entity.CourseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    CourseEntity createCourse(CourseEntity course);
    List<CourseEntity>getAllCourses();
    CourseEntity getCourseById(Long id);
    void deleteCourse(Long id);



}
