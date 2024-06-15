package ec.edu.uce.ProyectoRelacionesDB.repository;

import ec.edu.uce.ProyectoRelacionesDB.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}


