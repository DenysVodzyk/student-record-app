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
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Optional<Student> getStudentById(Long studentId) {
        return studentRepository.findById(studentId);
    }
}
