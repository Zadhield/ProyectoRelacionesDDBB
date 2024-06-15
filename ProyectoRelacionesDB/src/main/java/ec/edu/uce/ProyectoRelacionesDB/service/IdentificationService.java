package ec.edu.uce.ProyectoRelacionesDB.service;

import ec.edu.uce.ProyectoRelacionesDB.entity.Identification;
import ec.edu.uce.ProyectoRelacionesDB.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentificationService {

    private final IdentificationRepository identificationRepository;

    @Autowired
    public IdentificationService(IdentificationRepository identificationRepository) {
        this.identificationRepository = identificationRepository;
    }

    public List<Identification> getAllIdentification() {
        return identificationRepository.findAll();
    }

    public Identification saveIdentification(Identification identification) {
        return identificationRepository.save(identification);
    }

    // Otros métodos según sea necesario
}
