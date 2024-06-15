package ec.edu.uce.ProyectoRelacionesDB.service;

import ec.edu.uce.ProyectoRelacionesDB.entity.*;
import ec.edu.uce.ProyectoRelacionesDB.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DataService {

    @Autowired
    private IdentificationRepository identificationRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Transactional
    public void insertTestData() {
        // Crear una identificación
        Identification id = new Identification();
        id.setNumber("1726616541");

        // Crear un estudiante
        Student student = new Student();
        student.setName("Angelo");
        student.setIdentification(id); // Establecer la identificación en el estudiante

        // Guardar la identificación primero (OneToOne: Identification <-> Student)
        identificationRepository.save(id);

        // Guardar el estudiante luego
        studentRepository.save(student);

        // Crear un departamento
        Department department = new Department();
        department.setName("Departmento de Matemáticas");

        // Guardar el departamento primero
        departmentRepository.save(department);

        // Crear un profesor
        Teacher teacher1 = new Teacher();
        teacher1.setName("Oscar Toalombo");
        teacher1.setDepartment(department); // Establecer el departamento del profesor

        // Asignar al departamento un jefe (head) (OneToOne: Department <-> Teacher)
        department.setHead(teacher1);

        // Guardar el profesor y el departamento (OneToOne: Department <-> Teacher)
        teacherRepository.save(teacher1);

        // Crear otro profesor
        Teacher teacher2 = new Teacher();
        teacher2.setName("Juan Perez");

        // Guardar el segundo profesor
        teacherRepository.save(teacher2);

        // Crear cursos
        Course course1 = new Course();
        course1.setName("Algebra lineal");
        course1.setTeacher(teacher1); // Asignar el primer profesor al curso (ManyToOne: Course -> Teacher)

        Course course2 = new Course();
        course2.setName("Ecuaciones Diferenciales");
        course2.setTeacher(teacher2); // Asignar el segundo profesor al curso (ManyToOne: Course -> Teacher)

        // Guardar los cursos primero (ManyToOne: Course -> Teacher)
        courseRepository.save(course1);
        courseRepository.save(course2);

        // Asociar cursos con profesores (OneToMany: Teacher -> Course)
        teacher1.getCourses().add(course1);
        teacher2.getCourses().add(course2);

        // Guardar los cursos en los repositorios (OneToMany: Teacher -> Course)
        teacherRepository.save(teacher1);
        teacherRepository.save(teacher2);

        // Crear otro estudiante
        Student student2 = new Student();
        student2.setName("Daniel");

        // Guardar el segundo estudiante
        studentRepository.save(student2);

        // Crear cursos para el segundo estudiante
        Course course3 = new Course();
        course3.setName("Programacion 1");

        Course course4 = new Course();
        course4.setName("Fisica");

        // Guardar los cursos primero (ManyToMany: Student <-> Course)
        courseRepository.save(course3);
        courseRepository.save(course4);

        // Asignar cursos al segundo estudiante (ManyToMany: Student <-> Course)
        student2.getCourses().add(course3);
        student2.getCourses().add(course4);

        // Guardar los cursos del segundo estudiante (ManyToMany: Student <-> Course)
        studentRepository.save(student2);
    }
}
