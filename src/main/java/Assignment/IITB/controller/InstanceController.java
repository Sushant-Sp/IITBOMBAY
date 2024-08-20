package Assignment.IITB.controller;

import Assignment.IITB.entity.CourseInstanceEntity;
import Assignment.IITB.service.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/instances")
public class InstanceController {

    @Autowired
    private InstanceService instanceService;

    @PostMapping("/add")
    public ResponseEntity<CourseInstanceEntity> createCourseInstance(@RequestBody CourseInstanceEntity courseInstanceEntity){
        CourseInstanceEntity createdInstance = instanceService.createCourseInstance(courseInstanceEntity);
        return new ResponseEntity<>(createdInstance,HttpStatus.CREATED);


    }
}
