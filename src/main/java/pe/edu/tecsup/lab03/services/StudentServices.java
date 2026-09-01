package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import java.util.List;
import java.util.Optional;

public class StudentService {

    private StudentRepository studentRepository;

    // Constructor para inyectar el repositorio (o hacerlo por setter/constructor)
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Obtener todos los estudiantes
    public List<StudentEntity> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    // Obtener un estudiante por ID
    public Optional<StudentEntity> getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }

    // Guardar un nuevo estudiante
    public void saveStudent(StudentEntity student) {
        studentRepository.saveStudent(student);
    }

    // Actualizar un estudiante existente
    public void updateStudent(StudentEntity student) {
        studentRepository.updateStudent(student);
    }

    // Eliminar un estudiante
    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }
}