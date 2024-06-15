package ec.edu.uce.ProyectoRelacionesDB.service;


import ec.edu.uce.ProyectoRelacionesDB.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.uce.ProyectoRelacionesDB.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    // Otros métodos según sea necesario
}