package Assignment.IITB.service.impl;

import Assignment.IITB.entity.CourseInstanceEntity;
import Assignment.IITB.repository.InstanceRepository;
import Assignment.IITB.service.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstanceServiceImpl implements InstanceService {

    @Autowired
    private InstanceRepository instanceRepository;

    @Override
    public CourseInstanceEntity createCourseInstance (CourseInstanceEntity courseInstanceEntity){
     CourseInstanceEntity newInstanceEntity=new CourseInstanceEntity();
     CourseInstanceEntity savedInstance=instanceRepository.save(courseInstanceEntity);
     return savedInstance;
    }

    @Override
    public List<CourseInstanceEntity> getAllInstance(){
        return instanceRepository.findAll();
    }

    @Override
    public CourseInstanceEntity getCourseInstanceByID(Long id){
        Optional<CourseInstanceEntity> courseInstanceEntity = instanceRepository.findById(id);
        return courseInstanceEntity.orElse(null);
    }

    @Override
    public void deleteInstanceById(Long id){
        instanceRepository.deleteById(id);
    }
}
