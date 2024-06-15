package ec.edu.uce.ProyectoRelacionesDB.repository;


import ec.edu.uce.ProyectoRelacionesDB.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}