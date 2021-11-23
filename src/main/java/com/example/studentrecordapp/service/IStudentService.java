package com.example.studentrecordapp.service;

import com.example.studentrecordapp.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    List<Student> getAllStudents();

    Student addStudent(Student student);

    void deleteStudent(long studentId);

    Optional<Student> getStudentById(long studentId);

    Student updateStudent(long studentId, Student studentDetails);
}
