package Assignment.IITB.controller;

import Assignment.IITB.entity.CourseEntity;
import Assignment.IITB.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

}
