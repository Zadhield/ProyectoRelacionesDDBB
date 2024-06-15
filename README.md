# ProyectoRelacionesDDBB
La aplicación gestiona entidades como estudiantes, profesores, cursos, departamentos, dentro de un contexto educativo.
Identificación y Estudiante (OneToOne): Una identificación pertenece a un estudiante y un estudiante tiene una identificación
Profesor y Curso (OneToMany): Los profesores pueden impartir varios cursos
Estudiante y Curso (ManyToMany): Los estudiantes pueden Inscribirse en varios cursos
Curso y Profesor: (ManyToOne): Cada curso se asocia a un profesor que lo imparte
