package ec.edu.uce.ProyectoRelacionesDB.repository;


import ec.edu.uce.ProyectoRelacionesDB.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}