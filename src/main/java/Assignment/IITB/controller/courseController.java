package Assignment.IITB.controller;

import Assignment.IITB.entity.CourseEntity;
import Assignment.IITB.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/courses")
public class courseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    public courseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/course")
    public ResponseEntity<CourseEntity>createCourse(@RequestBody CourseEntity course){
    CourseEntity createdCourse = courseService.createCourse(course);
    return new ResponseEntity<>(createdCourse,HttpStatus.CREATED);

        }

     @GetMapping("/get")
    public ResponseEntity<List<CourseEntity>> getAllCourses(){
        List<CourseEntity> courseEntities = courseService.getAllCourses();
        return ResponseEntity.ok(courseEntities);

     }

     @GetMapping("/{id}")
    public ResponseEntity<CourseEntity> getCourseById(@PathVariable Long id){
    CourseEntity course = courseService.getCourseById(id);
        if(course != null){
             return  new ResponseEntity<>(course,HttpStatus.CREATED);
        }
        else{
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
     }

     @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     }

}
