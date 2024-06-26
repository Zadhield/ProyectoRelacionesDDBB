package ec.edu.uce.ProyectoRelacionesDB.service;

import ec.edu.uce.ProyectoRelacionesDB.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.uce.ProyectoRelacionesDB.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Otros métodos según sea necesario
}