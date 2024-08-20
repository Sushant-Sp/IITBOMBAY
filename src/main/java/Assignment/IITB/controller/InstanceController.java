package Assignment.IITB.controller;

import Assignment.IITB.entity.CourseInstanceEntity;
import Assignment.IITB.service.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/get")
    public ResponseEntity<List<CourseInstanceEntity>> getAllInstance(){
        List<CourseInstanceEntity> courseInstanceEntities = instanceService.getAllInstance();
        return ResponseEntity.ok(courseInstanceEntities);
    }

    @GetMapping("{id}")
    public ResponseEntity<CourseInstanceEntity> getCourseById(@PathVariable Long id){
        CourseInstanceEntity courseInstanceEntity = instanceService.getCourseInstanceByID(id);
        if(courseInstanceEntity != null){
           return new ResponseEntity<>(courseInstanceEntity,HttpStatus.CREATED);
        }
        else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInstanceById(@PathVariable Long id){
        instanceService.deleteInstanceById(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
