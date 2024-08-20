package Assignment.IITB.service.impl;

import Assignment.IITB.entity.CourseEntity;
import Assignment.IITB.repository.CourseRepository;
import Assignment.IITB.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

   @Override
    public List <CourseEntity> getAllCourses(){
       return courseRepository.findAll();
   }

   @Override
    public CourseEntity getCourseById(Long id){
       Optional<CourseEntity> courseEntityOptional =courseRepository.findById(id);
     return courseEntityOptional.orElse(null);
   }

   @Override
    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
   }

}
