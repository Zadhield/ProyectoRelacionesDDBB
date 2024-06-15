package ec.edu.uce.ProyectoRelacionesDB.repository;

import ec.edu.uce.ProyectoRelacionesDB.entity.Identification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificationRepository extends JpaRepository<Identification, Long> {
}
