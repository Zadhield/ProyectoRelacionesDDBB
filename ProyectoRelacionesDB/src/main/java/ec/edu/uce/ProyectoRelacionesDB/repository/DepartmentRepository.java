package ec.edu.uce.ProyectoRelacionesDB.repository;


import ec.edu.uce.ProyectoRelacionesDB.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}