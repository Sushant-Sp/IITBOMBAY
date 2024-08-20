package Assignment.IITB.service.impl;

import Assignment.IITB.entity.CourseEntity;
import Assignment.IITB.repository.CourseRepository;
import Assignment.IITB.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

   @Autowired
    private CourseRepository courseRepository;


   @Override
    public CourseEntity createCourse (CourseEntity course){
     CourseEntity newCourseEntity=new CourseEntity();
     CourseEntity savedCourse =courseRepository.save(course);
    return savedCourse;
   }
}
