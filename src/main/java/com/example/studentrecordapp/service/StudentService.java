package com.example.studentrecordapp.service;

import com.example.studentrecordapp.entity.Student;
import com.example.studentrecordapp.repository.IStudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.studentrecordapp.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(long studentId) {
        Student deleteStudent = studentRepository.findById(studentId).
                orElseThrow(() -> new ResourceNotFoundException("Employee with id: " + studentId + " does not exist."));
        studentRepository.delete(deleteStudent);
    }

    @Override
    public Optional<Student> getStudentById(long studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public Student updateStudent(long studentId, Student studentDetails) {
        Student updatedStudent = studentRepository.findById(studentId).
                orElseThrow(() -> new ResourceNotFoundException("Employee with id: " + studentId + " does not exist."));
        updatedStudent.setFirstName(studentDetails.getFirstName());
        updatedStudent.setLastName(studentDetails.getLastName());
        updatedStudent.setEmail(studentDetails.getEmail());

        studentRepository.save(updatedStudent);
        return updatedStudent;
    }
}
